package com.douc.generics;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Generics {
    
    
    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2, javax.swing.JTextField txt3) {
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
    }

    public static void limpiezaDatos(javax.swing.JTextField txt1, javax.swing.JTextField txt2) {
        txt1.setText(null);
        txt2.setText(null);
    }

    public static void limpiezaDatos(javax.swing.JTextField txt1) {
        txt1.setText(null);
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
}
