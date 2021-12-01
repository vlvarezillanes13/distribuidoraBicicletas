package com.duoc.models;

import com.duoc.controllers.FabricaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fabricante {
    private static FabricaController fc = new FabricaController();
    private int ID;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public static void cargarTablaFabrica(javax.swing.JTable tablaFabricas){
       
        try
        {
            ArrayList<Fabricante> fabricas = fc.obtenerFabricantes();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            for(Fabricante f: fabricas)
            {
                Object fila[] = new Object[2];
                fila[0] = f.getID();
                fila[1] = f.getNombre();
                modelo.addRow(fila);
            }
            tablaFabricas.setModel(modelo);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }

}
