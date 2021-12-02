package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Bicicleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BicicletaController {
    private static final String SQL_READALL = "SELECT * FROM BICICLETA";
    private static final String SQL_INSERT = "INSERT INTO BICICLETA (MODELO,FABRICANTE,CATEGORIA,TALLA,SUSPENSION,TRANSMISION,FRENOS,STOCK,VALOR) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE BICICLETA SET MODELO = ?,FABRICANTE = ?,CATEGORIA = ?,TALLA = ?,SUSPENSION = ?,TRANSMISION = ?,FRENOS = ?,STOCK = ?,VALOR = ? WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM BICICLETA WHERE ID = ?";
    
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
    
    public boolean crearBicicleta(Bicicleta B) {
        try {
            ps = CONEXION.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, B.getModelo());
            ps.setInt(2, B.getFabricante());
            ps.setInt(3, B.getCategoria());
            ps.setString(4, B.getTalla());
            ps.setString(5, B.getSuspension());
            ps.setString(6, B.getTransmicion());
            ps.setString(7, B.getFrenos());
            ps.setInt(8, B.getStock());
            ps.setInt(9, B.getValor());
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
    
    public boolean actualizarBicicleta(Bicicleta B) {
        try {
            ps = CONEXION.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, B.getModelo());
            ps.setInt(2, B.getFabricante());
            ps.setInt(3, B.getCategoria());
            ps.setString(4, B.getTalla());
            ps.setString(5, B.getSuspension());
            ps.setString(6, B.getTransmicion());
            ps.setString(7, B.getFrenos());
            ps.setInt(8, B.getStock());
            ps.setInt(9, B.getValor());
            ps.setInt(10, B.getID());
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
    
    public boolean eliminarBicicleta(Bicicleta B) {
        try {
            ps = CONEXION.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, B.getID());
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
}
