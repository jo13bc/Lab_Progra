/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import AccesoADatos.Servicio;
import Logica.Usuario;
import java.util.Collection;

public class ServicioUsuario extends Servicio {

    private static final String INSERTARVUELO = "{call insertarUsuario(?,?,?,?,?,?,?,?,?)}";
    private static final String MODIFICARVUELO = "{call modificarUsuario(?,?,?,?,?,?,?,?,?)}";
    private static final String ELIMINARVUELO = "{call eliminarUsuario(?)}";
    private static final String LISTARVUELO = "{?=call listarUsuario()}";
    private static final String BUSCARVUELO = "{?=call buscarUsuario(?)}";
    private static final String BUSCARVUELOTIPO = "{?=call buscarUsuarioprecio(?)}";
    private static ServicioUsuario servicioUsuario = new ServicioUsuario();

    public ServicioUsuario() {
    }

    public void insertarUsuario(Usuario elUsuario) throws GlobalException, NoDataException {
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
            pstmt.setString(1, elUsuario.getUsuario());
            pstmt.setString(2, elUsuario.getContrasena());
            pstmt.setString(3, elUsuario.getNombre());
            pstmt.setString(4, elUsuario.getApellidos());
            pstmt.setString(5, elUsuario.getEmail());
            pstmt.setString(6, elUsuario.getFecha());
            pstmt.setString(7, elUsuario.getDireccion());
            pstmt.setInt(8, (int) elUsuario.getTelefonoTrabajo());
            pstmt.setInt(9, (int) elUsuario.getCelular());

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

    public void modificarUsuario(Usuario elUsuario) throws GlobalException, NoDataException {
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
            pstmt.setString(1, elUsuario.getUsuario());
            pstmt.setString(2, elUsuario.getContrasena());
            pstmt.setString(3, elUsuario.getNombre());
            pstmt.setString(4, elUsuario.getApellidos());
            pstmt.setString(5, elUsuario.getEmail());
            pstmt.setString(6, elUsuario.getFecha());
            pstmt.setString(7, elUsuario.getDireccion());
            pstmt.setInt(8, (int) elUsuario.getTelefonoTrabajo());
            pstmt.setInt(9, (int) elUsuario.getCelular());
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

    public void eliminarUsuario(String codigo) throws GlobalException, NoDataException {
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

    public ArrayList<Usuario> listarUsuario() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Usuario usuario = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARVUELO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                usuario = new Usuario(
                        rs.getString("Usuario"),
                        rs.getString("Contrasena"),
                        rs.getString("Nombre"),
                        rs.getString("Apellidos"),
                        rs.getString("Mail"),
                        rs.getString("Fecha"),
                        rs.getString("Direccion"),
                        rs.getInt("Telefono"),
                        rs.getInt("Celular"));
           coleccion.add(usuario);
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

    public Usuario buscarUsuario(String nombre) throws GlobalException, NoDataException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Usuario elUsuario = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(BUSCARVUELO);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.setString(2, nombre);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elUsuario = new Usuario(rs.getString("Usuario"),
                        rs.getString("Contrasena"),
                        rs.getString("Nombre"),
                        rs.getString("Apellidos"),
                        rs.getString("Mail"),
                        rs.getString("Fecha"),
                        rs.getString("Direccion"),
                        rs.getInt("Telefono"),
                        rs.getInt("Celular")) ;
                        
                        

                coleccion.add(elUsuario);
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
        return elUsuario;
    }

    public static ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }

}
