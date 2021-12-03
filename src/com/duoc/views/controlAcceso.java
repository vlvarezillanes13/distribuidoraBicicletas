package com.duoc.views;

import com.duoc.models.Usuario;
import javax.swing.JOptionPane;

public class controlAcceso extends javax.swing.JFrame {
    private Usuario administrador = new Usuario("administrador","admin2021","administrador");
    private Usuario funcionario = new Usuario("funcionario","fun2021","funcionario");
    
    public controlAcceso() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Inicio de Sesión");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE DE USUARIO");

        jLabel2.setText("CONTRASEÑA");

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duoc/static/img/LogoDuoc.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario)
                    .addComponent(txtPassword)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nombre de usuario NO ingresado.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Contraseña NO ingresado.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }else{
            String nombreUsuario = txtUsuario.getText();
            String clave = txtPassword.getText();
            if(!nombreUsuario.equals(administrador.getNombreUsuario()) && !nombreUsuario.equals(funcionario.getNombreUsuario())){
                JOptionPane.showMessageDialog(null, "Usuario NO existe.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }else if(nombreUsuario.equals(administrador.getNombreUsuario()) && !clave.equals(administrador.getPassword())){
                JOptionPane.showMessageDialog(null, "Clave incorrecta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }else if(nombreUsuario.equals(administrador.getNombreUsuario()) && clave.equals(administrador.getPassword())){
                JOptionPane.showMessageDialog(null, "BIENVENIDO ADMINISTRADOR", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                vistaPrincipal vp = new vistaPrincipal(administrador);
                this.setVisible(false);
                vp.setVisible(true);
            }else if(nombreUsuario.equals(funcionario.getNombreUsuario()) && !clave.equals(funcionario.getPassword())){
                JOptionPane.showMessageDialog(null, "Clave incorrecta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }else if(nombreUsuario.equals(funcionario.getNombreUsuario()) && clave.equals(funcionario.getPassword())){
                JOptionPane.showMessageDialog(null, "BIENVENIDO FUNCIONARIO", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                vistaPrincipal vp = new vistaPrincipal(funcionario);
                this.setVisible(false);
                vp.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
