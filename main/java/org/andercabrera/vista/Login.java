/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.andercabrera.vista;

import org.andercabrera.login.*;
import org.andercabrera.vista.*;
import java.awt.Color;

/**
 *
 * @author Deran
 */
public class Login extends javax.swing.JFrame {
    private controladorLogin controlador = controladorLogin.getInstance();
    private Menu menu = new Menu();

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        userTitle = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        passwordTitle = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        passwordSeparator = new javax.swing.JSeparator();
        enterButton = new javax.swing.JPanel();
        enterText = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AGENCIA DE VIAJES");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addContainerGap()));
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 532,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 98, Short.MAX_VALUE)));

        bg.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 630));

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("INICIAR SESIÓN");
        bg.add(loginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 50));

        userTitle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTitle.setForeground(new java.awt.Color(0, 0, 0));
        userTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userTitle.setText("USUARIO");
        bg.add(userTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        userTextField.setBackground(new java.awt.Color(255, 255, 255));
        userTextField.setText("Ingrese su nombre de usuario");
        userTextField.setBorder(null);
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextFieldMousePressed(evt);
            }
        });
        bg.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 350, -1));
        bg.add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 350, -1));

        passwordTitle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passwordTitle.setForeground(new java.awt.Color(0, 0, 0));
        passwordTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordTitle.setText("CONTRASEÑA");
        bg.add(passwordTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setText("********");
        passwordTextField.setBorder(null);
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });
        bg.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 350, -1));
        bg.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 350, -1));

        enterButton.setBackground(new java.awt.Color(51, 51, 51));
        enterButton.setToolTipText("");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        enterText.setBackground(new java.awt.Color(51, 51, 51));
        enterText.setFont(new java.awt.Font("Roboto Bk", 0, 12)); // NOI18N
        enterText.setForeground(new java.awt.Color(255, 255, 255));
        enterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterText.setText("ENTRAR");
        enterText.setToolTipText("");
        enterText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterTextMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterTextMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enterButtonLayout = new javax.swing.GroupLayout(enterButton);
        enterButton.setLayout(enterButtonLayout);
        enterButtonLayout.setHorizontalGroup(
                enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE));
        enterButtonLayout.setVerticalGroup(
                enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        bg.add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 50));

        createAccount.setBackground(new java.awt.Color(51, 153, 255));
        createAccount.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        createAccount.setForeground(new java.awt.Color(51, 153, 255));
        createAccount.setText("Crear cuenta");
        createAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                createAccountMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createAccountMouseReleased(evt);
            }
        });
        bg.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 811, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordTextFieldMousePressed
        if (String.valueOf(passwordTextField.getPassword()).equals("********")) {
            passwordTextField.setText("");
            passwordTextField.setForeground(Color.black);
        }
        if (userTextField.getText().isEmpty()) {
            userTextField.setText("Ingrese su nombre de usuario");
            userTextField.setForeground(Color.gray);
        }
    }// GEN-LAST:event_passwordTextFieldMousePressed

    private void createAccountMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createAccountMousePressed
        createAccount.setForeground(Color.black);
    }// GEN-LAST:event_createAccountMousePressed

    private void createAccountMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createAccountMouseReleased
        createAccount.setForeground(new Color(51, 153, 255));
    }// GEN-LAST:event_createAccountMouseReleased

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createAccountMouseClicked
        dataAccount getData = new dataAccount();
        this.setVisible(false);
        getData.setVisible(true);
    }// GEN-LAST:event_createAccountMouseClicked

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_userTextFieldActionPerformed

    private void enterTextMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_enterTextMouseClicked
        controlador.login(userTextField.getText(), String.valueOf(passwordTextField.getText()));
        if (controlador.getLogin() == true) {
            this.setVisible(false);
            menu.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cuenta inexistente o Usuario y contraseña incorrectos");
        }
    }// GEN-LAST:event_enterTextMouseClicked

    private void enterTextMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_enterTextMouseEntered
        enterButton.setBackground(new Color(64, 65, 75));
    }// GEN-LAST:event_enterTextMouseEntered

    private void enterTextMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_enterTextMouseExited
        enterButton.setBackground(new Color(51, 51, 51));
    }// GEN-LAST:event_enterTextMouseExited

    private void userTextFieldMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_userTextFieldMousePressed
        if (userTextField.getText().equals("Ingrese su nombre de usuario")) {
            userTextField.setText("");
            userTextField.setForeground(Color.black);
        }
        if (String.valueOf(passwordTextField.getPassword()).isEmpty()) {
            passwordTextField.setText("********");
            passwordTextField.setForeground(Color.gray);
        }
    }// GEN-LAST:event_userTextFieldMousePressed

    private void passwordTextFielMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordTextFielMousePressed
        if (String.valueOf(passwordTextField.getPassword()).equals("********")) {
            passwordTextField.setText("");
            passwordTextField.setForeground(Color.black);
        }
        if (userTextField.getText().isEmpty()) {
            userTextField.setText("Ingrese su nombre de usuario");
            userTextField.setForeground(Color.gray);
        }
    }// GEN-LAST:event_passwordTextFielMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel createAccount;
    private javax.swing.JPanel enterButton;
    private javax.swing.JLabel enterText;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel userTitle;
    // End of variables declaration//GEN-END:variables
}
