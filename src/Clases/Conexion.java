/*--------- PRIMER PROYECTO REAL ----------------------------------
 Conexion a base de datos de stock de puertas de Aberturas Ranelagh
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conectar;
    private final String base = "stock";
    private final String usuario = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    
    

    public Connection getConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conectar = DriverManager.getConnection(url,usuario,pass);
          //  System.out.println("Conectado exitosamente!");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;

    }

}
