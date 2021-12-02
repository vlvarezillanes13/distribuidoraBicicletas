package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Fabricante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FabricaController {

    private static final String SQL_READALL = "SELECT * FROM FABRICANTE";
    private static final String SQL_INSERT = "INSERT INTO FABRICANTE (NOMBRE) VALUES (?)";
    private static final String SQL_UPDATE = "UPDATE FABRICANTE SET NOMBRE = ? WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM FABRICANTE WHERE ID = ?";

    //Definir un objeto Conexion para enlarzar este controlador con la BD
    private static final Conexion CONEXION = Conexion.obtenerConexion();

    //Definiar un objeto PreparedStatement para ejecutar las consultas.
    private PreparedStatement ps;

    //Definir un objeto ResultSet para almacenar en memoria en resultado de la ejecución de una consulta.
    private ResultSet rs;

    public ArrayList<Fabricante> obtenerFabricantes() {
        try {
            ArrayList<Fabricante> fabricantes = new ArrayList<>();
            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                fabricantes.add(new Fabricante(rs.getInt(1), rs.getString(2)));
            }
            return fabricantes;
        } catch (SQLException ex) {
            System.out.println("Error obtener fabricantes: " + ex);
            return null;
        } finally {
            CONEXION.cerrarConexion();
        }
    }

    public boolean crearFabricante(Fabricante F) {
        try {
            ps = CONEXION.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, F.getNombre());
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
    
    public boolean actualizarFabricante(Fabricante F) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, F.getNombre());
            ps.setInt(2, F.getID());
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
    
    public boolean eliminarFabricante(Fabricante F) {
        try
        {
            ps = CONEXION.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, F.getID());
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
