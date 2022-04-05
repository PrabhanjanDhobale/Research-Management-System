/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.controller.CreateTopicController;
import com.controller.DataOperationsController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prabhanjan
 */
public class ShowAllData extends javax.swing.JFrame {

    /**
     * Creates new form ShowAllData
     */
    ArrayList<String> topics;
    DefaultTableModel textmodel;
    DefaultTableModel linksmodel;
    DefaultTableModel mediamodel;
    public ShowAllData() {
        initComponents();
        textmodel = (DefaultTableModel) tblTextData.getModel();
        linksmodel = (DefaultTableModel) tblTextLinks.getModel();
        mediamodel = (DefaultTableModel) tblMediaData.getModel();
        addinCmbTopic();
    }
    
    public void addinCmbTopic() {
         try {
            topics = new CreateTopicController().getTopic();
            System.out.println(topics.size());
            if(topics.size() <=0){
                JOptionPane.showMessageDialog(this, "No Data Found");
                return;
            } else {
                cmbTopicName.addItem("Select");
                cmbTopicNameLink.addItem("Select");
                cmbTopicNameMedia.addItem("Select");
                for (String topic : topics) {
                    cmbTopicName.addItem(topic);
                    cmbTopicNameLink.addItem(topic);
                    cmbTopicNameMedia.addItem(topic);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private int getId(String topic) throws SQLException {
        ArrayList dt = new CreateTopicController().getTopicData(topic);
        int id = (int)dt.get(0);
        System.out.println(id);
        return id;
    }
    
    private void showMessage() {
        JOptionPane.showMessageDialog(this, "No Data Found.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlShowAllData = new javax.swing.JPanel();
        TbpShowData = new javax.swing.JTabbedPane();
        PnlAddText = new javax.swing.JPanel();
        btnSearchTxt = new javax.swing.JButton();
        lblTopicNameText = new javax.swing.JLabel();
        cmbTopicName = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTextData = new javax.swing.JTable();
        btnShowData = new javax.swing.JButton();
        PnlAddLinks = new javax.swing.JPanel();
        btnSearchLinks = new javax.swing.JButton();
        lblTopicNameLink = new javax.swing.JLabel();
        cmbTopicNameLink = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTextLinks = new javax.swing.JTable();
        btnShowLinks = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSearchMedia = new javax.swing.JButton();
        lblTopicNameMedia = new javax.swing.JLabel();
        cmbTopicNameMedia = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMediaData = new javax.swing.JTable();
        btnShowImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("All Research Data");

        PnlShowAllData.setBackground(new java.awt.Color(52, 73, 94));
        PnlShowAllData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Research Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TbpShowData.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        PnlAddText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        btnSearchTxt.setText("Search");
        btnSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTxtActionPerformed(evt);
            }
        });

        lblTopicNameText.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblTopicNameText.setText("Topic");

        tblTextData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Topic", "Title", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTextData);

        btnShowData.setText("Show Data");

        javax.swing.GroupLayout PnlAddTextLayout = new javax.swing.GroupLayout(PnlAddText);
        PnlAddText.setLayout(PnlAddTextLayout);
        PnlAddTextLayout.setHorizontalGroup(
            PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddTextLayout.createSequentialGroup()
                .addGroup(PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAddTextLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTopicNameText)
                        .addGap(28, 28, 28)
                        .addComponent(cmbTopicName, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlAddTextLayout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlAddTextLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PnlAddTextLayout.setVerticalGroup(
            PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddTextLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopicNameText)
                    .addComponent(cmbTopicName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(PnlAddTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlAddTextLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        TbpShowData.addTab("Show Text", PnlAddText);

        PnlAddLinks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Links", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        btnSearchLinks.setText("Search");
        btnSearchLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLinksActionPerformed(evt);
            }
        });

        lblTopicNameLink.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblTopicNameLink.setText("Topic");

        tblTextLinks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Topic", "Title", "Links"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTextLinks);

        btnShowLinks.setText("Show Links");

        javax.swing.GroupLayout PnlAddLinksLayout = new javax.swing.GroupLayout(PnlAddLinks);
        PnlAddLinks.setLayout(PnlAddLinksLayout);
        PnlAddLinksLayout.setHorizontalGroup(
            PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddLinksLayout.createSequentialGroup()
                .addGroup(PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAddLinksLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTopicNameLink)
                        .addGap(48, 48, 48)
                        .addComponent(cmbTopicNameLink, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlAddLinksLayout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(btnShowLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlAddLinksLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PnlAddLinksLayout.setVerticalGroup(
            PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAddLinksLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopicNameLink)
                    .addComponent(cmbTopicNameLink, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(362, 362, 362)
                .addComponent(btnShowLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(PnlAddLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlAddLinksLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(99, Short.MAX_VALUE)))
        );

        TbpShowData.addTab("Show Links", PnlAddLinks);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Media", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 3, 24))); // NOI18N

        btnSearchMedia.setText("Search");
        btnSearchMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMediaActionPerformed(evt);
            }
        });

        lblTopicNameMedia.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblTopicNameMedia.setText("Topic");

        tblMediaData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Topic", "Image Name", "Image Link"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMediaData);

        btnShowImage.setText("Show Image");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTopicNameMedia)
                        .addGap(29, 29, 29)
                        .addComponent(cmbTopicNameMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btnShowImage, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopicNameMedia)
                    .addComponent(cmbTopicNameMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(363, 363, 363)
                .addComponent(btnShowImage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        TbpShowData.addTab("Show Media", jPanel3);

        javax.swing.GroupLayout PnlShowAllDataLayout = new javax.swing.GroupLayout(PnlShowAllData);
        PnlShowAllData.setLayout(PnlShowAllDataLayout);
        PnlShowAllDataLayout.setHorizontalGroup(
            PnlShowAllDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlShowAllDataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TbpShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PnlShowAllDataLayout.setVerticalGroup(
            PnlShowAllDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlShowAllDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TbpShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlShowAllData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlShowAllData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTxtActionPerformed
        try {
            int id = getId(cmbTopicName.getSelectedItem().toString());
            ArrayList data = new DataOperationsController().getAllData("TextData", id);
            if(data.isEmpty()) {
                showMessage();
                return;
            }
            
            for(var a : data) {
                System.out.println(a);
                ArrayList dt = (ArrayList)a;
            
            
                textmodel.insertRow(tblTextData.getRowCount(), new Object[] {
                    dt.get(0),
                    cmbTopicName.getSelectedItem(),
                    dt.get(2),
                    dt.get(3)
                });
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchTxtActionPerformed

    private void btnSearchLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLinksActionPerformed
        try {
            int id = getId(cmbTopicNameLink.getSelectedItem().toString());
            ArrayList data = new DataOperationsController().getAllData("TextLinks", id);
            if(data.isEmpty()) {
                showMessage();
                return;
            }
            
            for(var a : data) {
                System.out.println(a);
                ArrayList dt = (ArrayList)a;
            
            
                linksmodel.insertRow(tblTextLinks.getRowCount(), new Object[] {
                    dt.get(0),
                    cmbTopicNameLink.getSelectedItem(),
                    dt.get(2),
                    dt.get(3)
                });
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchLinksActionPerformed

    private void btnSearchMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMediaActionPerformed
        try {
            int id = getId(cmbTopicNameMedia.getSelectedItem().toString());
            ArrayList data = new DataOperationsController().getAllData("MediaData", id);
            if(data.isEmpty()) {
                showMessage();
                return;
            }
            
            for(var a : data) {
                System.out.println(a);
                ArrayList dt = (ArrayList)a;
            
            
                mediamodel.insertRow(tblMediaData.getRowCount(), new Object[] {
                    dt.get(0),
                    cmbTopicNameMedia.getSelectedItem(),
                    dt.get(2),
                    dt.get(3)
                });
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchMediaActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create PnlShowAllDataplay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlAddLinks;
    private javax.swing.JPanel PnlAddText;
    private javax.swing.JPanel PnlShowAllData;
    private javax.swing.JTabbedPane TbpShowData;
    private javax.swing.JButton btnSearchLinks;
    private javax.swing.JButton btnSearchMedia;
    private javax.swing.JButton btnSearchTxt;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton btnShowImage;
    private javax.swing.JButton btnShowLinks;
    private javax.swing.JComboBox<String> cmbTopicName;
    private javax.swing.JComboBox<String> cmbTopicNameLink;
    private javax.swing.JComboBox<String> cmbTopicNameMedia;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTopicNameLink;
    private javax.swing.JLabel lblTopicNameMedia;
    private javax.swing.JLabel lblTopicNameText;
    private javax.swing.JTable tblMediaData;
    private javax.swing.JTable tblTextData;
    private javax.swing.JTable tblTextLinks;
    // End of variables declaration//GEN-END:variables
}