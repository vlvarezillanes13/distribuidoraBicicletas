
package com.duoc.views;

import com.duoc.generics.Generics;
import com.duoc.models.Bicicleta;
import com.duoc.models.Categoria;
import com.duoc.models.Fabricante;
import com.duoc.models.Usuario;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.event.InternalFrameEvent;

public class vistaPrincipal extends javax.swing.JFrame {
    
    JScrollPane scrollpane;
    Usuario user;
    
    public vistaPrincipal(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menú Principal");
        setExtendedState(vistaPrincipal.MAXIMIZED_BOTH);
        //setExtendedState(this.ICONIFIED);
        
        //Usuario ingresado
        this.user = usuario;
        if(this.user.getCargo().equals("funcionario")){
            desactivarBtn();
        }
        
        //ESCONDER MENÚ
        this.jInternalFrameFabricante.setVisible(false);
        this.jInternalFrameCategorias.setVisible(false);
        this.jInternalFrameBicicletas.setVisible(false);
        this.txtIDOF.setVisible(false);
        this.txtIDOC.setVisible(false);
        this.txtIDOB.setVisible(false);
        
        
        //Agregar Scroll  a Jpanel Bicicletas
        scrollpane = new JScrollPane();
        scrollpane.setBounds(5,380, 1364, 230);
        scrollpane.setViewportView(jInternalFrameBicicletas);
        jInternalFrameBicicletas.setPreferredSize(new Dimension(350,350));
        this.add(scrollpane);
        scrollpane.setVisible(false);
        
        //Listar Fabricas
        Fabricante.cargarTablaFabrica(tablaFabricas);
        
        //Listar Categorias
        Categoria.cargarTablaCategoria(tablaCategoria);
        
        //Listar Bicicletas
        Bicicleta.cargarTablaBicicleta(tablaBicicleta);
        
        //AGREGAR CLICK A TABLA FABRICANTE
        Generics.mouseListerner(tablaFabricas,txtIDOF, txtIDF, txtNombreF, TXTIDF_BICI);
        
        //AGREGAR CLICK A TABLA CATEGOIAS
        Generics.mouseListerner(tablaCategoria,txtIDOC, txtIDC, txtNombreC, TXTIDC_BICI);
        
        //AGREGAR CLICK A TABLA BICICLETAS
        Generics.mouseListerner(tablaBicicleta,txtIDOB, txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI);
        
        listerClose();
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
        txtFiltrarFab = new javax.swing.JTextField();
        ComboBoxFab = new javax.swing.JComboBox<>();
        btnFiltrarFab = new javax.swing.JButton();
        txtIDOF = new javax.swing.JTextField();
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
        txtFiltrarCat = new javax.swing.JTextField();
        ComboBoxCat = new javax.swing.JComboBox<>();
        btnFiltrarCat = new javax.swing.JButton();
        txtIDOC = new javax.swing.JTextField();
        jInternalFrameBicicletas = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBicicleta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIDB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        btnModificarBicicleta = new javax.swing.JButton();
        txtFiltrarBici = new javax.swing.JTextField();
        ComboBoxBici = new javax.swing.JComboBox<>();
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
        btnFiltrarBici = new javax.swing.JButton();
        txtIDOB = new javax.swing.JTextField();
        MenuCategorias = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuFabricantes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuBicicletas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuIntegrantes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameFabricante.setClosable(true);
        jInternalFrameFabricante.setTitle("FABRICANTES");
        jInternalFrameFabricante.setVisible(true);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tablaFabricas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
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

        ComboBoxFab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre" }));

        btnFiltrarFab.setText("Filtrar");
        btnFiltrarFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarFabActionPerformed(evt);
            }
        });

        txtIDOF.setEditable(false);
        txtIDOF.setEnabled(false);
        txtIDOF.setFocusable(false);

        javax.swing.GroupLayout jInternalFrameFabricanteLayout = new javax.swing.GroupLayout(jInternalFrameFabricante.getContentPane());
        jInternalFrameFabricante.getContentPane().setLayout(jInternalFrameFabricanteLayout);
        jInternalFrameFabricanteLayout.setHorizontalGroup(
            jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFabricanteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                    .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                        .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnAgregarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnModificarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnEliminarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ComboBoxFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltrarFab, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFiltrarFab))
                            .addGroup(jInternalFrameFabricanteLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(48, 48, 48)
                                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreF, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtIDF))
                                .addGap(18, 18, 18)
                                .addComponent(txtIDOF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameFabricanteLayout.setVerticalGroup(
            jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFabricanteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jInternalFrameFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(ComboBoxFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrarFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarFab))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jInternalFrameCategorias.setClosable(true);
        jInternalFrameCategorias.setTitle("CATEGORIAS");
        jInternalFrameCategorias.setVisible(true);

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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

        ComboBoxCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Descripcion" }));

        btnFiltrarCat.setText("Filtrar");
        btnFiltrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCatActionPerformed(evt);
            }
        });

        txtIDOC.setEditable(false);
        txtIDOC.setEnabled(false);
        txtIDOC.setFocusable(false);

        javax.swing.GroupLayout jInternalFrameCategoriasLayout = new javax.swing.GroupLayout(jInternalFrameCategorias.getContentPane());
        jInternalFrameCategorias.getContentPane().setLayout(jInternalFrameCategoriasLayout);
        jInternalFrameCategoriasLayout.setHorizontalGroup(
            jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCategoriasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ComboBoxCat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                        .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(48, 48, 48)
                                        .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIDC, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(txtNombreC))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDOC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrameCategoriasLayout.createSequentialGroup()
                                        .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarCat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameCategoriasLayout.setVerticalGroup(
            jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCategoriasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jInternalFrameCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(ComboBoxCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarCat))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jInternalFrameBicicletas.setClosable(true);
        jInternalFrameBicicletas.setTitle("BICICLETAS");
        jInternalFrameBicicletas.setVisible(true);

        tablaBicicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
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
                false, false, false, false, false, false, false, false, false, false
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
            tablaBicicleta.getColumnModel().getColumn(2).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(3).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(4).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(5).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(6).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(7).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(8).setResizable(false);
            tablaBicicleta.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel5.setText("ID: ");

        jLabel6.setText("Modelo: ");

        btnModificarBicicleta.setText("Modificar");
        btnModificarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBicicletaActionPerformed(evt);
            }
        });

        txtFiltrarBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrarBiciActionPerformed(evt);
            }
        });

        ComboBoxBici.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Modelo", "Stock", "Valor" }));

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

        btnFiltrarBici.setText("Filtrar");
        btnFiltrarBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarBiciActionPerformed(evt);
            }
        });

        txtIDOB.setEditable(false);
        txtIDOB.setEnabled(false);
        txtIDOB.setFocusable(false);

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
                        .addGap(25, 25, 25)
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
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
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(txtFiltrarBici, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFiltrarBici)
                                .addGap(77, 77, 77)
                                .addComponent(btnAgregarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(btnModificarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtIDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxBici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel15))
                            .addGroup(jInternalFrameBicicletasLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel16)))
                        .addGap(0, 63, Short.MAX_VALUE)
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
                            .addComponent(txtFiltrarBici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrarBici))
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
                                .addGroup(jInternalFrameBicicletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboBoxBici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jMenu1.setText("Fabricante");

        MenuFabricantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/fab.jpg"))); // NOI18N
        MenuFabricantes.setText("VER FABRICANTES");
        MenuFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFabricantesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFabricantes);

        MenuCategorias.add(jMenu1);

        jMenu2.setText("Categoria");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/categoria.jpg"))); // NOI18N
        jMenuItem9.setText("VER CATEGORIAS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        MenuCategorias.add(jMenu2);

        jMenu3.setText("Bicicleta");

        MenuBicicletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/bici.jpg"))); // NOI18N
        MenuBicicletas.setText("VER BICICLETAS");
        MenuBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBicicletasActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBicicletas);

        MenuCategorias.add(jMenu3);

        jMenu5.setText("Acerca de");

        MenuIntegrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/acercaDe.jpg"))); // NOI18N
        MenuIntegrantes.setText("VER INTEGRANTES");
        MenuIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIntegrantesActionPerformed(evt);
            }
        });
        jMenu5.add(MenuIntegrantes);

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

        MenuCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/logout.jpg"))); // NOI18N
        MenuCerrarSesion.setText("Cerrar Sesion");
        MenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu4.add(MenuCerrarSesion);

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
                .addGap(151, 151, 151))
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
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAgregarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBicicletaActionPerformed
        Bicicleta.registrarBicicleta(txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI, jInternalFrameBicicletas, tablaBicicleta);
        limpiarFabCat();
    }//GEN-LAST:event_btnAgregarBicicletaActionPerformed

    private void btnAgregarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFabricanteActionPerformed
        Fabricante.registrarFabricante(txtIDF,txtNombreF, jInternalFrameFabricante, tablaFabricas);
    }//GEN-LAST:event_btnAgregarFabricanteActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
       Categoria.registrarCategoria(txtIDC,txtNombreC, jInternalFrameCategorias, tablaCategoria);
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnModificarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFabricanteActionPerformed
        Fabricante.modificarFabricante(txtIDOF,txtIDF, txtNombreF, jInternalFrameFabricante, tablaFabricas);
    }//GEN-LAST:event_btnModificarFabricanteActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        Categoria.modificarCategoria(txtIDOC, txtIDC, txtNombreC, jInternalFrameCategorias, tablaCategoria);
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnEliminarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFabricanteActionPerformed
        Fabricante.eliminarFabricante(txtIDF, txtNombreF, jInternalFrameFabricante, tablaFabricas, TXTIDF_BICI);
    }//GEN-LAST:event_btnEliminarFabricanteActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        Categoria.eliminarCategoria(txtIDC, txtNombreC, jInternalFrameCategorias, tablaCategoria, TXTIDC_BICI);
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnModificarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBicicletaActionPerformed
        Bicicleta.actualizarBicicleta(txtIDOB, txtIDB, txtModelo, txtTalla, txtSuspen, txtTrans, txtFrenos, txtStock, txtValor, TXTIDC_BICI, TXTIDF_BICI, jInternalFrameBicicletas, tablaBicicleta);
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
        scrollpane.setVisible(true);
    }//GEN-LAST:event_MenuBicicletasActionPerformed

    private void MenuIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIntegrantesActionPerformed
        acercaDe ad = new acercaDe();
        ad.setVisible(true);
    }//GEN-LAST:event_MenuIntegrantesActionPerformed

    private void MenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCerrarSesionActionPerformed
        this.setVisible(false);
        controlAcceso ca = new controlAcceso();
        ca.setVisible(true);
    }//GEN-LAST:event_MenuCerrarSesionActionPerformed

    private void txtFiltrarBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrarBiciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarBiciActionPerformed

    private void btnFiltrarFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarFabActionPerformed
        Fabricante.generarFiltroBusqueda(txtFiltrarFab, ComboBoxFab, tablaFabricas);
    }//GEN-LAST:event_btnFiltrarFabActionPerformed

    private void btnFiltrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCatActionPerformed
        Categoria.generarFiltroBusqueda(txtFiltrarCat, ComboBoxCat, tablaCategoria);
    }//GEN-LAST:event_btnFiltrarCatActionPerformed

    private void btnFiltrarBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarBiciActionPerformed
        Bicicleta.generarFiltroBusqueda(txtFiltrarBici, ComboBoxBici, tablaBicicleta);
    }//GEN-LAST:event_btnFiltrarBiciActionPerformed


    
    private void limpiarFabCat(){
        this.txtIDF.setText("");
        this.txtIDC.setText("");
        this.txtNombreF.setText("");
        this.txtNombreC.setText("");
    }
    
    
    private void desactivarBtn(){
        this.btnAgregarFabricante.setEnabled(false);
        this.btnAgregarCategoria.setEnabled(false);
        this.btnAgregarBicicleta.setEnabled(false);
        this.btnModificarFabricante.setEnabled(false);
        this.btnModificarCategoria.setEnabled(false);
        this.btnModificarBicicleta.setEnabled(false);
        this.btnEliminarFabricante.setEnabled(false);
        this.btnEliminarCategoria.setEnabled(false);
        this.btnEliminarBicicleta.setEnabled(false);
        this.txtIDF.setEnabled(false);
        this.txtIDC.setEnabled(false);
        this.txtIDB.setEnabled(false);
        this.txtNombreF.setEnabled(false);
        this.txtNombreC.setEnabled(false);
        this.txtModelo.setEnabled(false);
        this.txtTalla.setEnabled(false);
        this.txtSuspen.setEnabled(false);
        this.txtTrans.setEnabled(false);
        this.txtFrenos.setEnabled(false);
        this.txtStock.setEnabled(false);
        this.txtValor.setEnabled(false);
    }
    
    private void listerClose(){
        this.jInternalFrameBicicletas.addInternalFrameListener(new javax.swing.event.InternalFrameListener(){
            @Override
            public void internalFrameClosing(InternalFrameEvent ife) {
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent ife) { 
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent ife) {
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent ife) {
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent ife) {
            }

            @Override
            public void internalFrameOpened(InternalFrameEvent ife) {
                
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent ife) {
                scrollpane.setVisible(false);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxBici;
    private javax.swing.JComboBox<String> ComboBoxCat;
    private javax.swing.JComboBox<String> ComboBoxFab;
    private javax.swing.JMenuItem MenuBicicletas;
    private javax.swing.JMenuBar MenuCategorias;
    private javax.swing.JMenuItem MenuCerrarSesion;
    private javax.swing.JMenuItem MenuFabricantes;
    private javax.swing.JMenuItem MenuIntegrantes;
    private javax.swing.JTextField TXTIDC_BICI;
    private javax.swing.JTextField TXTIDF_BICI;
    private javax.swing.JButton btnAgregarBicicleta;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarFabricante;
    private javax.swing.JButton btnEliminarBicicleta;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnEliminarFabricante;
    private javax.swing.JButton btnFiltrarBici;
    private javax.swing.JButton btnFiltrarCat;
    private javax.swing.JButton btnFiltrarFab;
    private javax.swing.JButton btnModificarBicicleta;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnModificarFabricante;
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
    private javax.swing.JTable tablaBicicleta;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTable tablaFabricas;
    private javax.swing.JTextField txtFiltrarBici;
    private javax.swing.JTextField txtFiltrarCat;
    private javax.swing.JTextField txtFiltrarFab;
    private javax.swing.JTextField txtFrenos;
    private javax.swing.JTextField txtIDB;
    private javax.swing.JTextField txtIDC;
    private javax.swing.JTextField txtIDF;
    private javax.swing.JTextField txtIDOB;
    private javax.swing.JTextField txtIDOC;
    private javax.swing.JTextField txtIDOF;
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
