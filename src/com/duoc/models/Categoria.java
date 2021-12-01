package com.duoc.models;

import com.duoc.controllers.CategoriaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Categoria {
    private static CategoriaController cc = new CategoriaController();
    private int ID;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int ID, String descripcion) {
        this.ID = ID;
        this.descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public static void cargarTablaCategoria(javax.swing.JTable tablaCategoria){
       
        try
        {
            ArrayList<Categoria> categorias = cc.obtenerCategorias();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Descripcion");
            for(Categoria c: categorias)
            {
                Object fila[] = new Object[2];
                fila[0] = c.getID();
                fila[1] = c.getDescripcion();
                modelo.addRow(fila);
            }
            tablaCategoria.setModel(modelo);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
}
