package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaController {
    private static final String SQL_READALL = "SELECT * FROM CATEGORIA";
    
    
    //Definir un objeto Conexion para enlarzar este controlador con la BD
    private static final Conexion CONEXION = Conexion.obtenerConexion();
    
    //Definiar un objeto PreparedStatement para ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto ResultSet para almacenar en memoria en resultado de la ejecución de una consulta.
    private ResultSet rs;
    
    
    public ArrayList<Categoria> obtenerCategorias() {
        try
        {
            ArrayList<Categoria> categoria = new ArrayList<>();
            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next())
            {
                categoria.add(new Categoria(rs.getInt(1), rs.getString(2)));
            }
            return categoria;
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
