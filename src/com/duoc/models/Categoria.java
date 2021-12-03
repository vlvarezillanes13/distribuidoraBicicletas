package com.duoc.models;

import com.duoc.generics.Generics;
import com.duoc.controllers.CategoriaController;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Categoria {

    private static CategoriaController cc = new CategoriaController();
    private int ID;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(String descripcion) {
        this.descripcion = descripcion;
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

    public static void cargarTablaCategoria(javax.swing.JTable tablaCategoria) {

        try {
            ArrayList<Categoria> categorias = cc.obtenerCategorias();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Descripcion");
            for (Categoria c : categorias) {
                Object fila[] = new Object[2];
                fila[0] = c.getID();
                fila[1] = c.getDescripcion();
                modelo.addRow(fila);
            }
            tablaCategoria.setModel(modelo);
            modelo.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void registrarCategoria(javax.swing.JTextField txtNombre, javax.swing.JInternalFrame Categorias, javax.swing.JTable tablaCategorias) {
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Descripcion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                String nombreCategoria = txtNombre.getText();
                Categoria categoria = new Categoria(nombreCategoria);
                if (cc.crearCategoria(categoria)) {
                    JOptionPane.showMessageDialog(null, "Categoria registrado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaCategorias)) {
                        cargarTablaCategoria(tablaCategorias);
                        Generics.limpiezaDatos(txtNombre);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la categoria.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void modificarCategoria(javax.swing.JTextField txtID, javax.swing.JTextField txtNombre, javax.swing.JInternalFrame Categorias, javax.swing.JTable tablaCategorias) {

        if (txtID.getText().equals("") || txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione categoria de la tabla CATEGORIAS", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int IDC = Integer.parseInt(txtID.getText());
                String nombreCategoria = txtNombre.getText();
                Categoria categoria = new Categoria(IDC, nombreCategoria);
                if (cc.actualizarCategoria(categoria)) {
                    JOptionPane.showMessageDialog(null, "Categoria modificado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaCategorias)) {
                        cargarTablaCategoria(tablaCategorias);
                        Generics.limpiezaDatos(txtNombre);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el categoria", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void eliminarCategoria(javax.swing.JTextField txtID, javax.swing.JTextField txtNombre, javax.swing.JInternalFrame Categorias, javax.swing.JTable tablaCategorias, javax.swing.JTextField txtBC) {

        if (txtID.getText().equals("") || txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione categoria de la tabla CATEGORIAS", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int IDC = Integer.parseInt(txtID.getText());
                String nombreCategoria = txtNombre.getText();
                Categoria categoria = new Categoria(IDC, nombreCategoria);
                if (cc.eliminarCategoria(categoria)) {
                    JOptionPane.showMessageDialog(null, "Categoria eliminar satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaCategorias)) {
                        cargarTablaCategoria(tablaCategorias);
                        Generics.limpiezaDatos(txtNombre);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el categoria", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void generarFiltroBusqueda(javax.swing.JTextField txtFiltro, javax.swing.JComboBox tipo, javax.swing.JTable tablaCategoria) {
        if (txtFiltro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se ingreso filtro\n Se mostrar todos los registros", "Mensaje", JOptionPane.ERROR_MESSAGE);
            cargarTablaCategoria(tablaCategoria);
        } else {
            try {
                String busqueda = txtFiltro.getText();
                String filtro = tipo.getSelectedItem().toString();
                ArrayList<Categoria> categorias = cc.obtenerCategorias();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Codigo");
                modelo.addColumn("Nombre");
                for (Categoria c : categorias) {
                    if (filtro.equals("ID")) {
                        String ID = c.ID + "";
                        if (ID.contains(busqueda)) {
                            Object fila[] = new Object[2];
                            fila[0] = c.getID();
                            fila[1] = c.getDescripcion();
                            modelo.addRow(fila);
                        }
                    } else {
                        String nombre = c.descripcion;
                        if (nombre.contains(busqueda)) {
                            Object fila[] = new Object[2];
                            fila[0] = c.getID();
                            fila[1] = c.getDescripcion();
                            modelo.addRow(fila);
                        }
                    }

                }
                tablaCategoria.setModel(modelo);
                modelo.fireTableDataChanged();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
