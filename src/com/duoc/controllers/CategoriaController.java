package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaController {
    private static final String SQL_READALL = "SELECT * FROM CATEGORIA";
    private static final String SQL_INSERT = "INSERT INTO CATEGORIA (DESCRIPCION) VALUES (?)";
    private static final String SQL_UPDATE = "UPDATE CATEGORIA SET DESCRIPCION = ? WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM CATEGORIA WHERE ID = ?";
    
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
    
    public boolean crearCategoria(Categoria C) {
        try {
            ps = CONEXION.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, C.getDescripcion());
            if (ps.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            return false;
        } finally {
            CONEXION.cerrarConexion();
        }
    }
    
    public boolean actualizarCategoria(Categoria C) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, C.getDescripcion());
            ps.setInt(2, C.getID());
            return ps.executeUpdate() > 0;
        }
        catch(SQLException ex)
        {
            return false;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }       
    }
    
    public boolean eliminarCategoria(Categoria C) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, C.getID());
            return ps.executeUpdate() > 0;
        }
        catch(SQLException ex)
        {
            return false;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }       
    }
}
