/*
Interfaz de login para acceso al sistema de inventarios
 */
package Graficas;

import Clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    Conexion conn;
    public Login() {
        initComponents();
        this.setTitle("Login");
        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/login.png"));
        logo1.setIcon(new ImageIcon(logo.getScaledInstance(logo1.getWidth(), logo1.getHeight(),Image.SCALE_SMOOTH))); // setear una imagen a un label
        this.setIconImage(logo);
        this.setLocationRelativeTo(null);
        conn = new Conexion();
        conn.Conexion();
    }

    public void AgregarUsuario(){
        String pass = String.valueOf(txt_pass.getPassword());
        String sql = "INSERT INTO usuario (usuario , pass ) VALUES (?,?)";
        try {
            PreparedStatement pst = conn.Conexion().prepareStatement(sql);
            pst.setString(1, txt_usuario.getText());
            pst.setString(2, pass);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "SE AGREGÓ CON EXITO AL USUARIO: "+txt_usuario.getText());
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        botonConectar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        addUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(760, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de inventarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel3.setText("Usuario:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), java.awt.Color.white));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txt_pass)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_pass)
                        .addGap(7, 7, 7)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 480, 150));

        botonConectar.setText("Aceptar");
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 100, 30));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 30));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jPanel1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 50, 280, 220));

        addUsuario.setText("Agregar Usuario");
        addUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(addUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
        try {
            String user = txt_usuario.getText();
            String pass = String.valueOf(txt_pass.getPassword());
            String query = "SELECT * FROM usuario WHERE usuario= '" + user + "' and pass= '" + pass + "'";
            System.out.println(query);
            Statement st = conn.Conexion().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "USUARIO ENCONTRADO");
                JOptionPane.showMessageDialog(null, "INICIANDO SESION");
            }else 
                JOptionPane.showMessageDialog(null, "NO EXISTE EL USUARIO");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonConectarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelarActionPerformed

    private void addUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUsuarioActionPerformed
        AgregarUsuario();
        txt_usuario.setText("");
        txt_pass.setText("");
        
    }//GEN-LAST:event_addUsuarioActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

         UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); //selecion de tema de libreria JTatoo
        // https://malalanayake.wordpress.com/2012/10/16/java-themes-with-jtattoo/ link con los diseños disponibles
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUsuario;
    private javax.swing.JButton botonConectar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
