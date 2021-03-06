/*
 * ServicioLogueo.java
 *
 * Created on 8 de junio de 2007, 22:53
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AccesoADatos;

import Logica.Usuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.internal.OracleTypes;

public class ServicioLogin extends Servicio {
    private static final String login = "{?=call login(?,?)}";
    private static ServicioLogin servicioLogin = new ServicioLogin();

   
    public ServicioLogin() {
        super();
    }
    
    public Usuario loginCliente(String id, String contrasena) throws NoDataException, GlobalException {
        Usuario funcionario = null;
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }

        ResultSet rs = null;
        CallableStatement pstmt = null;
        int respuesta = 0;
        try {
            pstmt = conexion.prepareCall(login);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, id);
            pstmt.setString(3, contrasena);
            pstmt.execute();

            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                respuesta = rs.getInt("esta");
            }
            if (respuesta != 0) {
//                funcionario = ServicioUsuario.getServicioUsuario().consultarUsuario(id);
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
        return funcionario;
    }

    public static ServicioLogin getServicioLogin() {
        return servicioLogin;
    }
    
}



