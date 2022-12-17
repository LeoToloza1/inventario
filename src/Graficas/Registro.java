/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Clases.Contrasenia_Hash;
import Clases.SqlUsuario;
import Clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setTitle("Registro de Usuarios");
        Image registro = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/registro.png"));
        registro1.setIcon(new ImageIcon(registro.getScaledInstance(registro1.getWidth(), registro1.getHeight(), Image.SCALE_SMOOTH))); // setear una imagen a un label
        this.setIconImage(registro);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtPassConfirma = new javax.swing.JPasswordField();
        registro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Usuarios a la base de datos");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 372, 45));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("<HTML>Nombre de usuario:<HTML>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("<HTML>Confirmar  contraseña:<HTML>");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 40));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, 30));

        txtPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, 30));

        txtPassConfirma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtPassConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 30));

        registro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        registro1.setText("jLabel5");
        registro1.setPreferredSize(new java.awt.Dimension(484, 300));
        jPanel1.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 130, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        SqlUsuario modSql = new SqlUsuario();
        Usuario mod = new Usuario();

        String pass = new String(txtPass.getPassword()); //sacar la contraseña desde el campo de contraseña
        String passCon = new String(txtPassConfirma.getPassword()); // se genera un nuevo string con la contraseña confirmada
        if (txtNombreUsuario.getText().equals("") || pass.equals("") || passCon.equals("")) { //validacion de los campos vacios
            JOptionPane.showMessageDialog(null, "Hay campos vacios, por favor complete todo"); // mensaje al usuario si hay campos vacio 
        } else {
            if (pass.equals(passCon)) { // validacion de contraseña si los campos de confirmar contraseña coinciden
                if (modSql.comprobarUsuario(txtNombreUsuario.getText()) == 0) { // validacion de si existe el usuario en la data base
                    String nuevoPass = Contrasenia_Hash.sha1(pass); // //generacion de la contraseña ingresada con cifrado hash
                    mod.setUsuario(txtNombreUsuario.getText()); //settear un nuevo usuario a partir del campo de nombre de usuario
                    mod.setPass(nuevoPass); //settear la contraseña cifrada
                    mod.setTipoUsuario(1); // settear el tipo de usuario 1 - para admin // 2 - para usuario sin privilegios
                    if (modSql.AgregarUsuario(mod)) { //validacion para agregar un usario a la db
                        JOptionPane.showMessageDialog(null, "Se guardó exitosamente el usuario"); 
                        limpiar(); // funcion para borrar los campos de texto y dejarlos listos para volver a agregar un usario
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error en el registro de usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Login.registrar = null; // permite cerrar y volver a iniciar el formulario
    }//GEN-LAST:event_formWindowClosing
/*
    Funcion para limpiar los campos de texto en el registro 
    */
    private void limpiar(){
    txtNombreUsuario.setText("");
    txtPass.setText("");
    txtPassConfirma.setText("");
    }
 
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
       
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); //selecion de tema de libreria JTatoo
        // https://malalanayake.wordpress.com/2012/10/16/java-themes-with-jtattoo/ link con los diseños disponibles
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel registro1;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassConfirma;
    // End of variables declaration//GEN-END:variables
}
