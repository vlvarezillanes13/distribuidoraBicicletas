package com.duoc.models;

import com.duoc.generics.Generics;
import com.duoc.controllers.BicicletaController;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bicicleta {

    private static BicicletaController bc = new BicicletaController();
    private int ID;
    private String modelo;
    private String talla;
    private String suspension;
    private String transmicion;
    private String frenos;
    private int stock;
    private int valor;
    private int categoria;
    private int fabricante;

    public Bicicleta() {
    }

    public Bicicleta(String modelo, String talla, String suspension, String transmicion, String frenos, int stock, int valor, int categoria, int fabricante) {
        this.modelo = modelo;
        this.talla = talla;
        this.suspension = suspension;
        this.transmicion = transmicion;
        this.frenos = frenos;
        this.stock = stock;
        this.valor = valor;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    public Bicicleta(int ID, String modelo, String talla, String suspension, String transmicion, String frenos, int stock, int valor, int categoria, int fabricante) {
        this.ID = ID;
        this.modelo = modelo;
        this.talla = talla;
        this.suspension = suspension;
        this.transmicion = transmicion;
        this.frenos = frenos;
        this.stock = stock;
        this.valor = valor;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    public static void cargarTablaBicicleta(javax.swing.JTable tablaBicicleta) {

        try {
            ArrayList<Bicicleta> bicicletas = bc.obtenerBicicletas();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Modelo");
            modelo.addColumn("Talla");
            modelo.addColumn("Suspension");
            modelo.addColumn("Transmision");
            modelo.addColumn("Frenos");
            modelo.addColumn("Stock");
            modelo.addColumn("Valor");
            modelo.addColumn("Fabricante");
            modelo.addColumn("Categoria");
            for (Bicicleta c : bicicletas) {
                Object fila[] = new Object[10];
                fila[0] = c.getID();
                fila[1] = c.getModelo();
                fila[2] = c.getTalla();
                fila[3] = c.getSuspension();
                fila[4] = c.getTransmicion();
                fila[5] = c.getFrenos();
                fila[6] = c.getStock();
                fila[7] = c.getValor();
                fila[8] = c.getFabricante();
                fila[9] = c.getCategoria();
                modelo.addRow(fila);
            }
            tablaBicicleta.setModel(modelo);
            modelo.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void registrarBicicleta(javax.swing.JTextField txtID, javax.swing.JTextField txtModelo, javax.swing.JTextField txtTalla, javax.swing.JTextField txtSuspen, javax.swing.JTextField txtTrans, javax.swing.JTextField txtFrenos, javax.swing.JTextField txtStock, javax.swing.JTextField txtValor, javax.swing.JTextField txtCat, javax.swing.JTextField txtFab, javax.swing.JInternalFrame Bicicletas, javax.swing.JTable tablaBicicleta) {
        if (txtCat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar CATEGORIA de la tabla.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else if (txtFab.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar FABRICANTE de la tabla.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else if (txtID.getText().equals("") || txtModelo.getText().equals("") || txtTalla.getText().equals("") || txtSuspen.getText().equals("") || txtTrans.getText().equals("") || txtFrenos.getText().equals("") || txtStock.getText().equals("") || txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "RELLENAR TODOS LOS DATOS.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int IDBici = Integer.parseInt(txtID.getText());
                String modeloBici = txtModelo.getText();
                String tallaoBici = txtTalla.getText();
                String suspenBici = txtSuspen.getText();
                String transBici = txtTrans.getText();
                String frenosBici = txtFrenos.getText();
                int stockBici = Integer.parseInt(txtStock.getText());
                int valorBici = Integer.parseInt(txtValor.getText());
                int catBici = Integer.parseInt(txtCat.getText());
                int fabBici = Integer.parseInt(txtFab.getText());

                Bicicleta bici = new Bicicleta(IDBici,modeloBici, tallaoBici, suspenBici, transBici, frenosBici, stockBici, valorBici, catBici, fabBici);
                if (bc.crearBicicleta(bici)) {
                    JOptionPane.showMessageDialog(null, "Bicicleta registrado satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaBicicleta)) {
                        cargarTablaBicicleta(tablaBicicleta);
                        Generics.limpiezaDatos(txtID, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, txtCat, txtFab);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar el Bicicleta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void actualizarBicicleta(javax.swing.JTextField txtIDO,javax.swing.JTextField txtID, javax.swing.JTextField txtModelo, javax.swing.JTextField txtTalla, javax.swing.JTextField txtSuspen, javax.swing.JTextField txtTrans, javax.swing.JTextField txtFrenos, javax.swing.JTextField txtStock, javax.swing.JTextField txtValor, javax.swing.JTextField txtCat, javax.swing.JTextField txtFab, javax.swing.JInternalFrame Bicicletas, javax.swing.JTable tablaBicicleta) {
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar BICICLETA de la tabla.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else if (txtID.getText().equals("") || txtModelo.getText().equals("") || txtTalla.getText().equals("") || txtSuspen.getText().equals("") || txtTrans.getText().equals("") || txtFrenos.getText().equals("") || txtStock.getText().equals("") || txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "RELLENAR TODOS LOS DATOS.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int IDO = Integer.parseInt(txtIDO.getText());
                int IDBici = Integer.parseInt(txtID.getText());
                String modeloBici = txtModelo.getText();
                String tallaoBici = txtTalla.getText();
                String suspenBici = txtSuspen.getText();
                String transBici = txtTrans.getText();
                String frenosBici = txtFrenos.getText();
                int stockBici = Integer.parseInt(txtStock.getText());
                int valorBici = Integer.parseInt(txtValor.getText());
                int catBici = Integer.parseInt(txtCat.getText());
                int fabBici = Integer.parseInt(txtFab.getText());

                Bicicleta bici = new Bicicleta(IDBici, modeloBici, tallaoBici, suspenBici, transBici, frenosBici, stockBici, valorBici, catBici, fabBici);
                if (bc.actualizarBicicleta(bici,IDO)) {
                    JOptionPane.showMessageDialog(null, "Bicicleta actualizar satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaBicicleta)) {
                        cargarTablaBicicleta(tablaBicicleta);
                        Generics.limpiezaDatos(txtID,txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, txtCat, txtFab);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el bicicleta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void eliminarBicicleta(javax.swing.JTextField txtID, javax.swing.JTextField txtModelo, javax.swing.JTextField txtTalla, javax.swing.JTextField txtSuspen, javax.swing.JTextField txtTrans, javax.swing.JTextField txtFrenos, javax.swing.JTextField txtStock, javax.swing.JTextField txtValor, javax.swing.JTextField txtCat, javax.swing.JTextField txtFab, javax.swing.JInternalFrame Bicicletas, javax.swing.JTable tablaBicicleta) {
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar BICICLETA de la tabla.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int IDBici = Integer.parseInt(txtID.getText());
                String modeloBici = txtModelo.getText();
                String tallaoBici = txtTalla.getText();
                String suspenBici = txtSuspen.getText();
                String transBici = txtTrans.getText();
                String frenosBici = txtFrenos.getText();
                int stockBici = Integer.parseInt(txtStock.getText());
                int valorBici = Integer.parseInt(txtValor.getText());
                int catBici = Integer.parseInt(txtCat.getText());
                int fabBici = Integer.parseInt(txtFab.getText());

                Bicicleta bici = new Bicicleta(IDBici, modeloBici, tallaoBici, suspenBici, transBici, frenosBici, stockBici, valorBici, catBici, fabBici);
                if (bc.eliminarBicicleta(bici)) {
                    JOptionPane.showMessageDialog(null, "Bicicleta eliminada satisfactoriamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    if (Generics.limpiarDatos(tablaBicicleta)) {
                        cargarTablaBicicleta(tablaBicicleta);
                        Generics.limpiezaDatos(txtID,txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, txtCat, txtFab);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el bicicleta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void generarFiltroBusqueda(javax.swing.JTextField txtFiltro, javax.swing.JComboBox tipo, javax.swing.JTable tablaBicicletas) {
        if (txtFiltro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se ingreso filtro\n Se mostrar todos los registros", "Mensaje", JOptionPane.ERROR_MESSAGE);
            cargarTablaBicicleta(tablaBicicletas);
        } else {
            try {
                String busqueda = txtFiltro.getText();
                String filtro = tipo.getSelectedItem().toString();
                ArrayList<Bicicleta> bicis = bc.obtenerBicicletas();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Codigo");
                modelo.addColumn("Modelo");
                modelo.addColumn("Talla");
                modelo.addColumn("Suspension");
                modelo.addColumn("Transmision");
                modelo.addColumn("Frenos");
                modelo.addColumn("Stock");
                modelo.addColumn("Valor");
                modelo.addColumn("Fabricante");
                modelo.addColumn("Categoria");
                for (Bicicleta b : bicis) {
                    if (filtro.equals("ID")) {
                        String ID = b.ID + "";
                        if (ID.contains(busqueda)) {
                            Object fila[] = new Object[10];
                            fila[0] = b.getID();
                            fila[1] = b.getModelo();
                            fila[2] = b.getTalla();
                            fila[3] = b.getSuspension();
                            fila[4] = b.getTransmicion();
                            fila[5] = b.getFrenos();
                            fila[6] = b.getStock();
                            fila[7] = b.getValor();
                            fila[8] = b.getFabricante();
                            fila[9] = b.getCategoria();
                            modelo.addRow(fila);
                        }
                    } else if (filtro.equals("Modelo")) {
                        String modelo_b = b.modelo;
                        if (modelo_b.contains(busqueda)) {
                            Object fila[] = new Object[10];
                            fila[0] = b.getID();
                            fila[1] = b.getModelo();
                            fila[2] = b.getTalla();
                            fila[3] = b.getSuspension();
                            fila[4] = b.getTransmicion();
                            fila[5] = b.getFrenos();
                            fila[6] = b.getStock();
                            fila[7] = b.getValor();
                            fila[8] = b.getFabricante();
                            fila[9] = b.getCategoria();
                            modelo.addRow(fila);
                        }
                    } else if (filtro.equals("Stock")) {
                        String stock_b = b.stock + "";
                        if (stock_b.contains(busqueda)) {
                            Object fila[] = new Object[10];
                            fila[0] = b.getID();
                            fila[1] = b.getModelo();
                            fila[2] = b.getTalla();
                            fila[3] = b.getSuspension();
                            fila[4] = b.getTransmicion();
                            fila[5] = b.getFrenos();
                            fila[6] = b.getStock();
                            fila[7] = b.getValor();
                            fila[8] = b.getFabricante();
                            fila[9] = b.getCategoria();
                            modelo.addRow(fila);
                        }
                    } else {
                        String valor_b = b.valor + "";
                        if (valor_b.contains(busqueda)) {
                            Object fila[] = new Object[10];
                            fila[0] = b.getID();
                            fila[1] = b.getModelo();
                            fila[2] = b.getTalla();
                            fila[3] = b.getSuspension();
                            fila[4] = b.getTransmicion();
                            fila[5] = b.getFrenos();
                            fila[6] = b.getStock();
                            fila[7] = b.getValor();
                            fila[8] = b.getFabricante();
                            fila[9] = b.getCategoria();
                            modelo.addRow(fila);
                        }
                    }

                }
                tablaBicicletas.setModel(modelo);
                modelo.fireTableDataChanged();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
