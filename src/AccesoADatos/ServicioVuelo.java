package AccesoADatos;

import Logica.Vuelo;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.internal.OracleTypes;

public class ServicioVuelo extends Servicio {

    private static final String INSERTARVUELO = "{call insertarVuelo(?,?,?,?,?,?)}";
    private static final String MODIFICARVUELO = "{call modificarVuelo(?,?,?,?,?,?)}";
    private static final String ELIMINARVUELO = "{call eliminarVuelo(?)}";
    private static final String LISTARVUELO = "{?=call listarVuelo()}";
    private static final String BUSCARVUELO = "{?=call buscarVuelo(?)}";
    private static final String BUSCARVUELOTIPO = "{?=call buscarVueloprecio(?)}";
    private static ServicioVuelo servicioVuelo = new ServicioVuelo();

    public ServicioVuelo() {
    }

    public void insertarVuelo(Vuelo elVuelo) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARVUELO);
            pstmt.setString(1, elVuelo.getOrigen());
            pstmt.setString(2, elVuelo.getDestino());
            pstmt.setString(3, elVuelo.getFechaIda());
            pstmt.setString(4, elVuelo.getFechaRegreso());
            pstmt.setInt(5, elVuelo.getCantidadPasajeros());
            pstmt.setInt(6, elVuelo.getDescuento());

            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            throw new GlobalException(e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public void modificarVuelo(Vuelo elVuelo) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(MODIFICARVUELO);
            pstmt.setString(1, elVuelo.getOrigen());
            pstmt.setString(2, elVuelo.getDestino());
            pstmt.setString(3, elVuelo.getFechaIda());
            pstmt.setString(4, elVuelo.getFechaRegreso());
            pstmt.setInt(5, elVuelo.getCantidadPasajeros());
            pstmt.setInt(6, elVuelo.getDescuento());
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la modificación");
            }

        } catch (SQLException e) {
            throw new GlobalException(e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public void eliminarVuelo(String codigo) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARVUELO);
            pstmt.setString(1, codigo);
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminación");
            }

        } catch (SQLException e) {
            throw new GlobalException(e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public ArrayList<Vuelo> listarVuelo() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Vuelo vuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARVUELO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                vuelo = new Vuelo(
                        rs.getString("Origen"),
                        rs.getString("Destino"),
                        rs.getString("FechaIda"),
                        rs.getString("FechaRegreso"),
                        rs.getInt("CantidadPasajeros"),
                        rs.getInt("Descuento"));
                coleccion.add(vuelo);
            }
        } catch (SQLException e) {
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return coleccion;
    }

    public Vuelo buscarVuelo(String nombre) throws GlobalException, NoDataException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Vuelo elVuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(BUSCARVUELO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.setString(2, nombre);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elVuelo = new Vuelo(rs.getString("Origen"),
                        rs.getString("Destino"),
                        rs.getString("FechaIda"),
                        rs.getString("FechaRegreso"),
                        rs.getInt("CantidadPasajeros"),
                        rs.getInt("Descuento"));

                coleccion.add(elVuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0) {
            throw new NoDataException("No hay datos");
        }
        return elVuelo;
    }

    public Vuelo buscarVueloTipo(String tipo) throws GlobalException, NoDataException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Vuelo elVuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(BUSCARVUELOTIPO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.setString(2, tipo);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elVuelo = new Vuelo(rs.getString("Origen"),
                        rs.getString("Destino"),
                        rs.getString("FechaIda"),
                        rs.getString("FechaRegreso"),
                        rs.getInt("CantidadPasajeros"),
                        rs.getInt("Descuento"));
                coleccion.add(elVuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0) {
            throw new NoDataException("No hay datos");
        }
        return elVuelo;
    }

    public static ServicioVuelo getServicioVuelo() {
        return servicioVuelo;
    }
    
    public ArrayList<Vuelo> listarVueloDescuentos() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Vuelo vuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARVUELO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                vuelo = new Vuelo(
                        rs.getString("Origen"),
                        rs.getString("Destino"),
                        rs.getString("FechaIda"),
                        rs.getString("FechaRegreso"),
                        rs.getInt("CantidadPasajeros"),
                        rs.getInt("Descuento"));
               
                coleccion.add(vuelo);
                
            }
        } catch (SQLException e) {
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return coleccion;
    }
   
}
