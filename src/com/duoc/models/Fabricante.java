package com.duoc.models;

import com.duoc.generics.Generics;
import com.duoc.controllers.FabricaController;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fabricante {

    private static FabricaController fc = new FabricaController();
    private int ID;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(String nombre) {
        this.nombre = nombre;
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

    public static void cargarTablaFabrica(javax.swing.JTable tablaFabricas) {

        try {
            ArrayList<Fabricante> fabricas = fc.obtenerFabricantes();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            for (Fabricante f : fabricas) {
                Object fila[] = new Object[2];
                fila[0] = f.getID();
                fila[1] = f.getNombre();
                modelo.addRow(fila);
            }
            tablaFabricas.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void registrarFabricante(javax.swing.JTextField txtNombre, javax.swing.JInternalFrame Fabricantes,javax.swing.JTable tablaFabricas) {
        try {
            String nombreFabricante = txtNombre.getText();
            Fabricante fabricante = new Fabricante(nombreFabricante);
            if (fc.crearFabricante(fabricante)) {
                JOptionPane.showMessageDialog(null, "Fabricante registrado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                Generics.limpiezaDatos(txtNombre);
                if (Fabricantes.isVisible()) {
                    cargarTablaFabrica(tablaFabricas);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el fabricante.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void modificarFabricante(javax.swing.JTextField txtID,javax.swing.JTextField txtNombre,javax.swing.JInternalFrame Fabricantes,javax.swing.JTable tablaFabricas){
        
        if(txtID.getText().equals("") || txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione fabricante de la tabla FABRICANTES", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }else{
            try 
            {
                int IDF = Integer.parseInt(txtID.getText());
                String nombreFabricante = txtNombre.getText();
                Fabricante fabricante = new Fabricante(IDF,nombreFabricante);
                if(fc.actualizarFabricante(fabricante))
                {
                    JOptionPane.showMessageDialog(null, "Fabricante modificado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    Generics.limpiezaDatos(txtID, txtNombre);
                    if(Fabricantes.isVisible())
                    {
                        cargarTablaFabrica(tablaFabricas);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el fabricante", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }

    public static void eliminarFabricante(javax.swing.JTextField txtID,javax.swing.JTextField txtNombre,javax.swing.JInternalFrame Fabricantes,javax.swing.JTable tablaFabricas, javax.swing.JTextField txtBC){
        
        if(txtID.getText().equals("") || txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione fabricante de la tabla FABRICANTES", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }else{
            try 
            {
                int IDF = Integer.parseInt(txtID.getText());
                String nombreFabricante = txtNombre.getText();
                Fabricante fabricante = new Fabricante(IDF,nombreFabricante);
                if(fc.eliminarFabricante(fabricante))
                {
                    JOptionPane.showMessageDialog(null, "Fabricante eliminado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    Generics.limpiezaDatos(txtID, txtNombre, txtBC);
                    if(Fabricantes.isVisible())
                    {
                        cargarTablaFabrica(tablaFabricas);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el fabricante", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
}
