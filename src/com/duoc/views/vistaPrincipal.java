
package com.duoc.views;

import com.douc.generics.Generics;
import com.duoc.models.Bicicleta;
import com.duoc.models.Categoria;
import com.duoc.models.Fabricante;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class vistaPrincipal extends javax.swing.JFrame {
    
    JScrollPane scrollpane;
    
    public vistaPrincipal() {
        initComponents();
        
        this.jInternalFrameFabricante.setVisible(false);
        this.jInternalFrameCategorias.setVisible(false);
        this.jInternalFrameBicicletas.setVisible(false);
        
        
        //Agregar Scroll  a Jpanel Bicicletas
        scrollpane = new JScrollPane();
        scrollpane.setBounds(5,380, 1364, 230);
        scrollpane.setViewportView(jInternalFrameBicicletas);
        jInternalFrameBicicletas.setPreferredSize(new Dimension(350,350));
        //this.add(scrollpane);
        
        //Listar Fabricas
        Fabricante.cargarTablaFabrica(tablaFabricas);
        
        //Listar Categorias
        Categoria.cargarTablaCategoria(tablaCategoria);
        
        //Listar Bicicletas
        Bicicleta.cargarTablaBicicleta(tablaBicicleta);
        
        //AGREGAR CLICK A TABLA FABRICANTE
        Generics.mouseListerner(tablaFabricas, txtIDF, txtNombreF, TXTIDF_BICI);
        
        //AGREGAR CLICK A TABLA CATEGOIAS
        Generics.mouseListerner(tablaCategoria, txtIDC, txtNombreC, TXTIDC_BICI);
        
        //AGREGAR CLICK A TABLA BICICLETAS
        Generics.mouseListerner(tablaBicicleta, txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameFabricante = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFabricas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtIDF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreF = new javax.swing.JTextField();
        btnAgregarFabricante = new javax.swing.JButton();
        btnModificarFabricante = new javax.swing.JButton();
        btnEliminarFabricante = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jInternalFrameCategorias = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtIDC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        btnAgregarCategoria = new javax.swing.JButton();
        btnModificarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jInternalFrameBicicletas = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBicicleta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIDB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        btnModificarBicicleta = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtFrenos = new javax.swing.JTextField();
        txtSuspen = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtTrans = new javax.swing.JTextField();
        btnEliminarBicicleta = new javax.swing.JButton();
        btnAgregarBicicleta = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TXTIDC_BICI = new javax.swing.JTextField();
        TXTIDF_BICI = new javax.swing.JTextField();
        MenuCategorias = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuFabricantes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuBicicletas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameFabricante.setTitle("FABRICANTES");
        jInternalFrameFabricante.setVisible(true);

        tablaFabricas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaFabricas);
        if (tablaFabricas.getColumnModel().getColumnCount() > 0) {
            tablaFabricas.getColumnModel().getColumn(0).setResizable(false);
            tablaFabricas.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setText("ID: ");

        txtIDF.setEditable(false);

        jLabel4.setText("Nombre: ");

        btnAgregarFabricante.setText("Agregar");
        btnAgregarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFabricanteActionPerformed(evt);
            }
        });

        btnModificarFabricante.setText("Modificar");
        btnModificarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFabricanteActionPerformed(evt);
            }
        });

        btnEliminarFabricante.setText("Eliminar");
        btnEliminarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFabricanteActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre" }));

        javax.swing.GroupLayout jInternalFrameFabricanteLayout = new javax.swing.GroupLayout(jInternalFrameFabricante.getContentPane());
        jInternalFrameFabricante.getContentPane().setLayout(jInternalFrameFabricanteLayout);
        jInternalFrameFabricanteLayout.setHorizontalGroup(
            jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFabricanteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnAgregarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnModificarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                        .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(48, 48, 48)
                                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreF, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtIDF)))
                            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameFabricanteLayout.setVerticalGroup(
            jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFabricanteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jInternalFrameCategorias.setTitle("CATEGORIAS");
        jInternalFrameCategorias.setVisible(true);

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaCategoria);
        if (tablaCategoria.getColumnModel().getColumnCount() > 0) {
            tablaCategoria.getColumnModel().getColumn(0).setResizable(false);
            tablaCategoria.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel7.setText("ID: ");

        txtIDC.setEditable(false);

        jLabel8.setText("Nombre: ");

        btnAgregarCategoria.setText("Agregar");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnModificarCategoria.setText("Modificar");
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });

        btnEliminarCategoria.setText("Eliminar");
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre" }));

        javax.swing.GroupLayout jInternalFrameCategoriasLayout = new javax.swing.GroupLayout(jInternalFrameCategorias.getContentPane());
        jInternalFrameCategorias.getContentPane().setLayout(jInternalFrameCategoriasLayout);
        jInternalFrameCategoriasLayout.setHorizontalGroup(
            jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCategoriasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(48, 48, 48)
                                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDC, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtNombreC)))
                            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameCategoriasLayout.setVerticalGroup(
            jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCategoriasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jInternalFrameBicicletas.setTitle("BICICLETAS");
        jInternalFrameBicicletas.setVisible(true);

        tablaBicicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Talla", "Suspencion", "Transmision", "Frenos", "Stock", "Valor", "Fabrica", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaBicicleta);
        if (tablaBicicleta.getColumnModel().getColumnCount() > 0) {
            tablaBicicleta.getColumnModel().getColumn(0).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText("ID: ");

        txtIDB.setEditable(false);

        jLabel6.setText("Modelo: ");

        btnModificarBicicleta.setText("Modificar");
        btnModificarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBicicletaActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre" }));

        jLabel9.setText("Talla:");

        jLabel10.setText("Suspención: ");

        jLabel11.setText("Transmisión: ");

        jLabel12.setText("Frenos: ");

        jLabel13.setText("Stock: ");

        jLabel14.setText("Valor: ");

        btnEliminarBicicleta.setText("Eliminar");
        btnEliminarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBicicletaActionPerformed(evt);
            }
        });

        btnAgregarBicicleta.setText("Agregar");
        btnAgregarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBicicletaActionPerformed(evt);
            }
        });

        jLabel15.setText("Categoria ID: ");

        jLabel16.setText("Fabricante ID: ");

        TXTIDC_BICI.setEditable(false);

        TXTIDF_BICI.setEditable(false);

        javax.swing.GroupLayout jInternalFrameBicicletasLayout = new javax.swing.GroupLayout(jInternalFrameBicicletas.getContentPane());
        jInternalFrameBicicletas.getContentPane().setLayout(jInternalFrameBicicletasLayout);
        jInternalFrameBicicletasLayout.setHorizontalGroup(
            jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)))
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txtSuspen))
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel12)))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addGap(467, 467, 467)
                                        .addComponent(btnAgregarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel9)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98)
                                .addComponent(btnModificarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel15))
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel16)))
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTIDF_BICI, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(TXTIDC_BICI))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        jInternalFrameBicicletasLayout.setVerticalGroup(
            jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSuspen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9))))
                                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16)
                                            .addComponent(TXTIDF_BICI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(TXTIDC_BICI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        jMenu1.setText("Fabricante");

        MenuFabricantes.setText("VER FABRICANTES");
        MenuFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFabricantesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFabricantes);

        MenuCategorias.add(jMenu1);

        jMenu2.setText("Categoria");

        jMenuItem9.setText("VER CATEGORIAS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        MenuCategorias.add(jMenu2);

        jMenu3.setText("Bicicleta");

        MenuBicicletas.setText("VER BICICLETAS");
        MenuBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBicicletasActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBicicletas);

        MenuCategorias.add(jMenu3);

        jMenu5.setText("Acerca de");
        MenuCategorias.add(jMenu5);

        jMenu4.setText("Salir");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/icon_salir_24x24.png"))); // NOI18N
        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        MenuCategorias.add(jMenu4);

        setJMenuBar(MenuCategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameBicicletas)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jInternalFrameFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrameCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jInternalFrameBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAgregarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBicicletaActionPerformed
        Bicicleta.registrarBicicleta(txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI, jInternalFrameBicicletas, tablaBicicleta);
        limpiarFabCat();
    }//GEN-LAST:event_btnAgregarBicicletaActionPerformed

    private void btnAgregarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFabricanteActionPerformed
        Fabricante.registrarFabricante(txtNombreF, jInternalFrameFabricante, tablaFabricas);
    }//GEN-LAST:event_btnAgregarFabricanteActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
       Categoria.registrarCategoria(txtNombreC, jInternalFrameCategorias, tablaCategoria);
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnModificarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFabricanteActionPerformed
        Fabricante.modificarFabricante(txtIDF, txtNombreF, jInternalFrameFabricante, tablaFabricas);
    }//GEN-LAST:event_btnModificarFabricanteActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        Categoria.modificarCategoria(txtIDC, txtNombreC, jInternalFrameCategorias, tablaCategoria);
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnEliminarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFabricanteActionPerformed
        Fabricante.eliminarFabricante(txtIDF, txtNombreF, jInternalFrameFabricante, tablaFabricas, TXTIDF_BICI);
    }//GEN-LAST:event_btnEliminarFabricanteActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        Categoria.eliminarCategoria(txtIDC, txtNombreC, jInternalFrameCategorias, tablaCategoria, TXTIDC_BICI);
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnModificarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBicicletaActionPerformed
        Bicicleta.actualizarBicicleta(txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI, jInternalFrameBicicletas, tablaBicicleta);
    }//GEN-LAST:event_btnModificarBicicletaActionPerformed

    private void btnEliminarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBicicletaActionPerformed
       Bicicleta.eliminarBicicleta(txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI, jInternalFrameBicicletas, tablaBicicleta);
    }//GEN-LAST:event_btnEliminarBicicletaActionPerformed

    private void MenuFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFabricantesActionPerformed
       this.jInternalFrameFabricante.setVisible(true);
    }//GEN-LAST:event_MenuFabricantesActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.jInternalFrameCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void MenuBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBicicletasActionPerformed
        this.jInternalFrameBicicletas.setVisible(true);
        this.add(scrollpane);
    }//GEN-LAST:event_MenuBicicletasActionPerformed


    
    private void limpiarFabCat(){
        this.txtIDF.setText("");
        this.txtIDC.setText("");
        this.txtNombreF.setText("");
        this.txtNombreC.setText("");
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuBicicletas;
    private javax.swing.JMenuBar MenuCategorias;
    private javax.swing.JMenuItem MenuFabricantes;
    private javax.swing.JTextField TXTIDC_BICI;
    private javax.swing.JTextField TXTIDF_BICI;
    private javax.swing.JButton btnAgregarBicicleta;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarFabricante;
    private javax.swing.JButton btnEliminarBicicleta;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnEliminarFabricante;
    private javax.swing.JButton btnModificarBicicleta;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnModificarFabricante;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JInternalFrame jInternalFrameBicicletas;
    private javax.swing.JInternalFrame jInternalFrameCategorias;
    private javax.swing.JInternalFrame jInternalFrameFabricante;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tablaBicicleta;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTable tablaFabricas;
    private javax.swing.JTextField txtFrenos;
    private javax.swing.JTextField txtIDB;
    private javax.swing.JTextField txtIDC;
    private javax.swing.JTextField txtIDF;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreF;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSuspen;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTrans;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
