package com.duoc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public static Conexion instance; //aplicar el patrón SINGLETON
    private Connection conexion;
    private final String USER = "root";
    private final String PASSWORD = "admin123";//cambiar //para trabajar con workbench en duoc debemos poner "sanjoaquin"
    private final String SERVER = "localhost:3306";
    private final String BBDD = "BBDD_BIKES";
    
    private Conexion(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + SERVER + "/" + BBDD;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos" 
                    + "\nContáctese con el adminstrador:\n" + 
                    ex.getMessage(), "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public synchronized static Conexion obtenerConexion(){
        if(instance == null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
    
//    public static void main(String[] args) {
//        Conexion co = new Conexion();
//        Conexion.obtenerConexion();
//        co.getConexion();
//        if(Conexion.instance != null){
//            System.out.println("Hay conec");
//        }
//    }
}
