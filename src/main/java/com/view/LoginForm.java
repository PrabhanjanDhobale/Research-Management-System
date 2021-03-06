/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;


import com.controller.LoginController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author prabhanjan
 */
public class LoginForm extends javax.swing.JFrame {
    

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInFormPanel = new javax.swing.JPanel();
        LoginImagePanel = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        LogInSepretor = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        btnSignUp1 = new javax.swing.JButton();
        lblForgotPassword = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LogInFormPanel.setBackground(new java.awt.Color(52, 73, 94));
        LogInFormPanel.setForeground(new java.awt.Color(62, 62, 62));

        LoginImagePanel.setBackground(new java.awt.Color(52, 73, 94));
        LoginImagePanel.setForeground(new java.awt.Color(62, 62, 62));
        LoginImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setText("Name");
        LoginImagePanel.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 270, 48));

        txtPassword.setText("Password");
        LoginImagePanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 270, 43));
        LoginImagePanel.add(LogInSepretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, -1));

        lblPassword.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        LoginImagePanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 30));

        lblUsername1.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername1.setText("Name");
        LoginImagePanel.add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        LoginImagePanel.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 40));

        btnSignUp1.setText("Sign Up");
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });
        LoginImagePanel.add(btnSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 120, 40));

        lblForgotPassword.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblForgotPassword.setText("Forgot Password");
        lblForgotPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });
        LoginImagePanel.add(lblForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 190, 40));

        lblLoginTitle.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginTitle.setText("Log In");
        LoginImagePanel.add(lblLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        javax.swing.GroupLayout LogInFormPanelLayout = new javax.swing.GroupLayout(LogInFormPanel);
        LogInFormPanel.setLayout(LogInFormPanelLayout);
        LogInFormPanelLayout.setHorizontalGroup(
            LogInFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInFormPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(LoginImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LogInFormPanelLayout.setVerticalGroup(
            LogInFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInFormPanelLayout.createSequentialGroup()
                .addComponent(LoginImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogInFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        this.dispose();
        new RegistrationForm().setVisible(true);
    }//GEN-LAST:event_btnSignUp1ActionPerformed

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        this.dispose();
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        try {
            if(txtUserName.getText().isEmpty() || txtUserName.getText().equals("Name"))
                JOptionPane.showMessageDialog(LogInFormPanel, "Please Enter Name");
            else if(txtPassword.getText().isEmpty() || txtPassword.getText().equals("Password"))
                JOptionPane.showMessageDialog(LogInFormPanel, "Please Enter Password");
            else {
                ArrayList<String> data = new ArrayList<String>();
                data.add(txtUserName.getText());
                data.add(txtPassword.getText());
                int chk = new LoginController().login(data);
                AccountInfo.uname = txtUserName.getText();
                if(chk == 1) {
                    JOptionPane.showMessageDialog(LogInFormPanel, "Login Succesfull");
                    this.dispose();
                    new MainPage().setVisible(true);
                } else if(chk == 2) {
                    JOptionPane.showMessageDialog(LogInFormPanel, "Password Not Match");
                } else if(chk == 3) {
                    JOptionPane.showMessageDialog(LogInFormPanel, "Name Not Match");
                } else {
                    JOptionPane.showMessageDialog(LogInFormPanel, "Login Failed !");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(LogInFormPanel, ex.getMessage().toString());
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInFormPanel;
    private javax.swing.JSeparator LogInSepretor;
    private javax.swing.JPanel LoginImagePanel;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
