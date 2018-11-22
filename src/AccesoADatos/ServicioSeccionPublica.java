/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Logica.Vuelo;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import oracle.jdbc.internal.OracleTypes;

public class ServicioSeccionPublica extends Servicio {

   
    private static final String LISTARVUELO = "{?=call listarVuelo()}";
    private static ServicioSeccionPublica servicioSeccionPublica = new ServicioSeccionPublica();

    private ServicioSeccionPublica() {
    }

//    public ArrayList<Vuelo> listarVuelo() throws GlobalException, NoDataException {
//        try {
//            conectar();
//        } catch (ClassNotFoundException e) {
//            throw new GlobalException("No se ha localizado el driver");
//        } catch (SQLException e) {
//            throw new NoDataException("La base de datos no se encuentra disponible");
//        }
//        ResultSet rs = null;
//        ArrayList coleccion = new ArrayList();
//        Vuelo vuelo = null;
//        CallableStatement pstmt = null;
//        try {
//            pstmt = conexion.prepareCall(LISTARVUELO);
//            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
//            pstmt.execute();
//            rs = (ResultSet) pstmt.getObject(1);
//
//            while (rs.next()) {
//                vuelo = new Vuelo(
//                        rs.getString("Origen"),
//                        rs.getString("Destino"),
//                        rs.getString("FechaIda"),
//                        rs.getString("FechaRegreso"),
//                        rs.getInt("CantidadPasajeros"),
//                        rs.getInt("Descuento"));
//                coleccion.add(vuelo);
//            }
//        } catch (SQLException e) {
//            throw new GlobalException("Sentencia no valida");
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (pstmt != null) {
//                    pstmt.close();
//                }
//                desconectar();
//            } catch (SQLException e) {
//                throw new GlobalException("Estatutos invalidos o nulos");
//            }
//        }
//        return coleccion;
//    }
  
    public Collection listarVuelo() throws GlobalException, NoDataException
	{
		try
		{
			conectar();
		}
		catch (ClassNotFoundException ex)
		{
			throw new GlobalException("No se ha localizado el Driver");
		}

		catch (SQLException e)
		{
			throw new NoDataException("La base de datos no se encuentra disponible");
		}

		ResultSet rs = null;
		ArrayList coleccion = new ArrayList();
		Vuelo elVuelo = null;
		CallableStatement pstmt = null;
		try
		{
			pstmt = conexion.prepareCall(LISTARVUELO);
			pstmt.registerOutParameter(1, OracleTypes.CURSOR);
			pstmt.execute();
			rs = (ResultSet)pstmt.getObject(1);
			while (rs.next()) {
                elVuelo = new Vuelo(
                        rs.getString("Origen"),
                        rs.getString("Destino"),
                        rs.getString("FechaIda"),
                        rs.getString("FechaRegreso"),
                        rs.getInt("CantidadPasajeros"),
                        rs.getInt("Descuento"));
                coleccion.add(elVuelo);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();

			throw new GlobalException("Sentencia no valida");
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (pstmt != null)
				{
					pstmt.close();
				}
				desconectar();
			}
			catch (SQLException e)
			{
				throw new GlobalException("Estatutos invalidos o nulos");
			}
		}
		if (coleccion == null || coleccion.size() == 0)
		{
			throw new NoDataException("No hay datos");
		}
		return coleccion;
	}
    
     public static ServicioSeccionPublica getServicioSeccionPublica() {
        return servicioSeccionPublica;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}