
package com.duoc.controllers;

import com.douc.conexion.Conexion;
import com.duoc.models.Fabricante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FabricaController {
    private static final String SQL_READALL = "SELECT * FROM FABRICANTE";
    
    
    //Definir un objeto Conexion para enlarzar este controlador con la BD
    private static final Conexion CONEXION = Conexion.obtenerConexion();
    
    //Definiar un objeto PreparedStatement para ejecutar las consultas.
    private PreparedStatement ps;
    
    //Definir un objeto ResultSet para almacenar en memoria en resultado de la ejecución de una consulta.
    private ResultSet rs;
    
    
    
    public ArrayList<Fabricante> obtenerFabricantes() {
        try
        {
            ArrayList<Fabricante> fabricantes = new ArrayList<>();
            ps = CONEXION.getConexion().prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next())
            {
                fabricantes.add(new Fabricante(rs.getInt(1), rs.getString(2)));
            }
            return fabricantes;
        }
        catch(SQLException ex)
        {
            System.out.println("Error obtener fabricantes: "+ex);
            return null;
        }
        finally
        {
            CONEXION.cerrarConexion();
        }
    }
}
