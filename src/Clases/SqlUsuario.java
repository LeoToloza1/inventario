/*
Clase para insertar un usuario en la base de datos y para comprobar si el usuario existe y
poder iniciar sesion.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SqlUsuario extends Conexion {

    public boolean AgregarUsuario(Usuario usr) {
        PreparedStatement ps = null;
        Connection conn = getConexion();
        String sql = "INSERT INTO usuario (usuario , pass,tipousuario ) VALUES (?,?,?)";
        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPass());
            ps.setInt(3, usr.getTipoUsuario());
            ps.execute();
            return true;
            // JOptionPane.showMessageDialog(null, "SE AGREGÓ CON EXITO AL USUARIO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO: " + e.getMessage());
            return false;
        }

    }
      
    public void comprobarUsuario(){
        String usuario = null;
        String pass = null;
        if (usuario.equalsIgnoreCase("Admin")&& pass.equalsIgnoreCase("admin")) {
            
        }
    }
  
      
}
