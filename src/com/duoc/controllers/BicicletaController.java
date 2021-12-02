package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Bicicleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BicicletaController {
    private static final String SQL_READALL = "SELECT * FROM BICICLETA";
    
    
    //Definir un objeto Conexion para enlarzar este controlador con la BD
    private static final Conexion CONEXION = Conexion.obtenerConexion();
    
    //Definiar un objeto PreparedStatement para ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto ResultSet para almacenar en memoria en resultado de la ejecución de una consulta.
    private ResultSet rs;
    
    public ArrayList<Bicicleta> obtenerBicicletas() {
        try
        {
            ArrayList<Bicicleta> bicicletas = new ArrayList<>();

            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next())
            {
                bicicletas.add(new Bicicleta(rs.getInt(1), rs.getString(2),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(4),rs.getInt(3)));
            }
            return bicicletas;
        }
        catch(SQLException ex)
        {
            System.out.println("Error obtener categorias: "+ex);
            return null;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
    }
}