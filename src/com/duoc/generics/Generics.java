package com.duoc.generics;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Generics {

    private TableRowSorter trs;

    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2, javax.swing.JTextField txt3, javax.swing.JTextField txt4, javax.swing.JTextField txt5, javax.swing.JTextField txt6, javax.swing.JTextField txt7, javax.swing.JTextField txt8, javax.swing.JTextField txt9, javax.swing.JTextField txt10) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");

    }

    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2, javax.swing.JTextField txt3, javax.swing.JTextField txt4, javax.swing.JTextField txt5, javax.swing.JTextField txt6, javax.swing.JTextField txt7, javax.swing.JTextField txt8, javax.swing.JTextField txt9) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
    }

    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2, javax.swing.JTextField txt3) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
    }

    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2) {
        txt1.setText("");
        txt2.setText("");
    }

    public static void limpiezaDatos(javax.swing.JTextField txt1) {
        txt1.setText("");
    }

    public static void mouseListerner(javax.swing.JTable tablaDatos, javax.swing.JTextField ID, javax.swing.JTextField NOMBRE, javax.swing.JTextField BC) {
        tablaDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {
                    ID.setText(tablaDatos.getValueAt(row, 0).toString());
                    NOMBRE.setText(tablaDatos.getValueAt(row, 1).toString());
                    BC.setText(tablaDatos.getValueAt(row, 0).toString());
                }
            }
        });
    }

    public static void mouseListerner(javax.swing.JTable tablaDatos, javax.swing.JTextField txtID, javax.swing.JTextField txtModelo, javax.swing.JTextField txtTalla, javax.swing.JTextField txtSuspen, javax.swing.JTextField txtTrans, javax.swing.JTextField txtFrenos, javax.swing.JTextField txtStock, javax.swing.JTextField txtValor, javax.swing.JTextField txtCat, javax.swing.JTextField txtFab) {
        tablaDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {
                    txtID.setText(tablaDatos.getValueAt(row, 0).toString());
                    txtModelo.setText(tablaDatos.getValueAt(row, 1).toString());
                    txtTalla.setText(tablaDatos.getValueAt(row, 2).toString());
                    txtSuspen.setText(tablaDatos.getValueAt(row, 3).toString());
                    txtTrans.setText(tablaDatos.getValueAt(row, 4).toString());
                    txtFrenos.setText(tablaDatos.getValueAt(row, 5).toString());
                    txtStock.setText(tablaDatos.getValueAt(row, 6).toString());
                    txtValor.setText(tablaDatos.getValueAt(row, 7).toString());
                    txtFab.setText(tablaDatos.getValueAt(row, 8).toString());
                    txtCat.setText(tablaDatos.getValueAt(row, 9).toString());

                }
            }
        });
    }

    public static boolean limpiarDatos(javax.swing.JTable tablaDatos) {

        try {
            DefaultTableModel modeloDatos = (DefaultTableModel) tablaDatos.getModel();

            if (tablaDatos.getRowCount() > 0) {
                for (int i = 0; i < tablaDatos.getRowCount(); i++) {
                    modeloDatos.removeRow(i);
                    i = i - 1;
                }
            }
            modeloDatos.fireTableDataChanged();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
