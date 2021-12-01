package com.duoc.models;

import com.duoc.controllers.BicicletaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bicicleta {
    private static BicicletaController bc =  new BicicletaController();
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

    
    public static void cargarTablaBicicleta(javax.swing.JTable tablaBicicleta){
       
        try
        {
            ArrayList<Bicicleta> bicicletas = bc.obtenerBicicletas();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Modelo");
            modelo.addColumn("Talla");
            modelo.addColumn("Suspension");
            modelo.addColumn("Transmision");
            modelo.addColumn("Frenos");
            modelo.addColumn("Stock");
            modelo.addColumn("Valor");
            modelo.addColumn("Fabricante");
            modelo.addColumn("Categoria");
            for(Bicicleta c: bicicletas)
            {
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
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión a la base de datos", "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
    }
}
