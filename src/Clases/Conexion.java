/*--------- PRIMER PROYECTO REAL ----------------------------------
 Conexion a base de datos de stock de puertas de Aberturas Ranelagh
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar;

    public Connection Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "");
          //  System.out.println("Conectado exitosamente!");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;

    }

}
