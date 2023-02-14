/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Buscador {
    private static String sql = "SELECT Cliente,Estado,Proveedor,Producto,Linea,Modelo,Hoja,Marco,Mano,Orden,FechaPedido,FechaRecibido,Valor,Ubicacion,Modulo,Fila,Observaciones,Descripcion ";
    private static String buscar_en = "FROM ";
    private static String donde = " WHERE ";
    private static String tabla1 = "puertas";
    private static String tabla2 = "productosvarios";
    private static String tabla3 = "pisos";
    private static String tabla4 = "aluminio";
    private static String tabla5 = "ofertas";
    private static String tabla6 = "pendienteingreso";
    private static String and = " and ";
    private Buscador() {
    }

    public static String mostrarPuerta() { //metodo para mostrar la tabla de puertas completa
        return sql + buscar_en + tabla1;
    }

    public static String mostrarVarios() { //metodo para mostrar la tabla de productos varios completa
        return sql + buscar_en + tabla2;
    }

    public static String mostrarPisos() { //metodo para mostrar la tabla de pisos completa
        return sql + buscar_en + tabla3;
    }

    public static String mostrarAluminio() { //metodo para mostrar la tabla de aluminio completa
        return sql + buscar_en + tabla4;
    }

    public static String mostrarOfertas() { //metodo para mostrar la tabla de productos en oferta completa
        return sql + buscar_en + tabla5;
    }

    public static String mostrarPendientes() { //metodo para mostrar la tabla productos pendientes completa
        return sql + buscar_en + tabla6;
    }
 
 public static String filtroCondicional() { 
        return mostrarPuerta()+ donde;
    }

 
}