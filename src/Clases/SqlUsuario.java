/*
Clase para insertar un usuario en la base de datos y para comprobar si el usuario existe y
poder iniciar sesion.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
      
    public int comprobarUsuario(String usuario){
        PreparedStatement ps = null;
        ResultSet rs;
        Connection conn = getConexion();
        String sql = "SELECT count(usuario) FROM usuario WHERE usuario = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
      
           rs= ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
           
            return 1;
        }
    }
  public boolean login(Usuario usr){
        PreparedStatement ps = null;
        ResultSet rs;
        Connection conn = getConexion();
        String sql = "SELECT id, usuario, pass , tipousuario FROM usuario WHERE usuario = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
      
           rs= ps.executeQuery();
            if (rs.next()) {
                if (usr.getPass().equals(rs.getString(3))) {
                    usr.setId(rs.getInt(1));
                    usr.setUsuario(rs.getString(2));
                    usr.setTipoUsuario(rs.getInt(4));
                    return true;
                }else{
                    return false;
                }
            } return false;
         
        } catch (SQLException e) {
           
            return false;
        }
    }
      
}
