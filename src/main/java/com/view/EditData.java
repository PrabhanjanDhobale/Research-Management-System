/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author prabhanjan
 */
public class EditData extends javax.swing.JFrame {

    /**
     * Creates new form EditData
     */
    public EditData() {
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

        PnlAddData = new javax.swing.JPanel();
        TbpEditData = new javax.swing.JTabbedPane();
        PnlEditText = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddText = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSearchTopic = new javax.swing.JLabel();
        cmbSelectTopic = new javax.swing.JComboBox<>();
        btnGetText = new javax.swing.JButton();
        PnlEditLinks = new javax.swing.JPanel();
        lblLinkTitle = new javax.swing.JLabel();
        txtLinkTitle = new javax.swing.JTextField();
        lblLinks = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLinks = new javax.swing.JTextArea();
        btnSaveLinks = new javax.swing.JButton();
        btnClearLinks = new javax.swing.JButton();
        PnlEditMedia = new javax.swing.JPanel();
        lblAddMedia = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        btnChooseFile = new javax.swing.JButton();
        btnMediaName = new javax.swing.JLabel();
        txtMediaName = new javax.swing.JTextField();
        btnSaveMedia = new javax.swing.JButton();
        btnClearMedia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Data");

        PnlAddData.setBackground(new java.awt.Color(52, 73, 94));
        PnlAddData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TbpEditData.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        PnlEditText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        txtAddText.setColumns(20);
        txtAddText.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        txtAddText.setLineWrap(true);
        txtAddText.setRows(5);
        jScrollPane1.setViewportView(txtAddText);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblSearchTopic.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblSearchTopic.setText("Select Topic");

        cmbSelectTopic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGetText.setText("Select");

        javax.swing.GroupLayout PnlEditTextLayout = new javax.swing.GroupLayout(PnlEditText);
        PnlEditText.setLayout(PnlEditTextLayout);
        PnlEditTextLayout.setHorizontalGroup(
            PnlEditTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditTextLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEditTextLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PnlEditTextLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblSearchTopic)
                .addGap(74, 74, 74)
                .addComponent(cmbSelectTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGetText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlEditTextLayout.setVerticalGroup(
            PnlEditTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditTextLayout.createSequentialGroup()
                .addGroup(PnlEditTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlEditTextLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PnlEditTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchTopic)
                            .addComponent(cmbSelectTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEditTextLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnGetText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(PnlEditTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TbpEditData.addTab("Edit Text", PnlEditText);

        PnlEditLinks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Links", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        lblLinkTitle.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblLinkTitle.setText("Link Title");

        lblLinks.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblLinks.setText("Links");

        txtLinks.setColumns(20);
        txtLinks.setLineWrap(true);
        txtLinks.setRows(5);
        jScrollPane2.setViewportView(txtLinks);

        btnSaveLinks.setText("Save");

        btnClearLinks.setText("Clear");

        javax.swing.GroupLayout PnlEditLinksLayout = new javax.swing.GroupLayout(PnlEditLinks);
        PnlEditLinks.setLayout(PnlEditLinksLayout);
        PnlEditLinksLayout.setHorizontalGroup(
            PnlEditLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditLinksLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PnlEditLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLinks)
                    .addComponent(lblLinkTitle)
                    .addComponent(txtLinkTitle)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PnlEditLinksLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnSaveLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnClearLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        PnlEditLinksLayout.setVerticalGroup(
            PnlEditLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditLinksLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblLinkTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLinkTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblLinks)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(PnlEditLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        TbpEditData.addTab("Edit Links", PnlEditLinks);

        PnlEditMedia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Media", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        lblAddMedia.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblAddMedia.setText("Select Media");

        btnChooseFile.setText("Choose File");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        btnMediaName.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        btnMediaName.setText("Media Name");

        btnSaveMedia.setText("Save");

        btnClearMedia.setText("Clear");

        javax.swing.GroupLayout PnlEditMediaLayout = new javax.swing.GroupLayout(PnlEditMedia);
        PnlEditMedia.setLayout(PnlEditMediaLayout);
        PnlEditMediaLayout.setHorizontalGroup(
            PnlEditMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditMediaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PnlEditMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlEditMediaLayout.createSequentialGroup()
                        .addComponent(btnSaveMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(btnClearMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlEditMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMediaName, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addComponent(btnMediaName)
                        .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFilePath)
                        .addComponent(lblAddMedia)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        PnlEditMediaLayout.setVerticalGroup(
            PnlEditMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditMediaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblAddMedia)
                .addGap(28, 28, 28)
                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnMediaName)
                .addGap(18, 18, 18)
                .addComponent(txtMediaName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(PnlEditMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        TbpEditData.addTab("Edit Media", PnlEditMedia);

        javax.swing.GroupLayout PnlAddDataLayout = new javax.swing.GroupLayout(PnlAddData);
        PnlAddData.setLayout(PnlAddDataLayout);
        PnlAddDataLayout.setHorizontalGroup(
            PnlAddDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddDataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TbpEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlAddDataLayout.setVerticalGroup(
            PnlAddDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TbpEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        String filename = f.getName();
        txtFilePath.setText(path);
        txtMediaName.setText(filename);
    }//GEN-LAST:event_btnChooseFileActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlAddData;
    private javax.swing.JPanel PnlEditLinks;
    private javax.swing.JPanel PnlEditMedia;
    private javax.swing.JPanel PnlEditText;
    private javax.swing.JTabbedPane TbpEditData;
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearLinks;
    private javax.swing.JButton btnClearMedia;
    private javax.swing.JButton btnGetText;
    private javax.swing.JLabel btnMediaName;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveLinks;
    private javax.swing.JButton btnSaveMedia;
    private javax.swing.JComboBox<String> cmbSelectTopic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddMedia;
    private javax.swing.JLabel lblLinkTitle;
    private javax.swing.JLabel lblLinks;
    private javax.swing.JLabel lblSearchTopic;
    private javax.swing.JTextArea txtAddText;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtLinkTitle;
    private javax.swing.JTextArea txtLinks;
    private javax.swing.JTextField txtMediaName;
    // End of variables declaration//GEN-END:variables
}
