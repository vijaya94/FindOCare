/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.DoctorHistory;
import model.HospitalHistory;
import model.PatientHistory;

/**
 *
 * @author Vijaya B.
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdmin
     */
     DoctorHistory history;
     HospitalHistory historyH;
     PatientHistory historyP;
     
    public SystemAdminJPanel() {
        initComponents();
        history = new DoctorHistory();
        historyH = new HospitalHistory();
        historyP = new PatientHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSystemAdmin = new javax.swing.JPanel();
        jSplitPanel = new javax.swing.JSplitPane();
        jBtnPanel = new javax.swing.JPanel();
        jBtnHospitalAdmn = new javax.swing.JButton();
        jBtnCommAdmn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jWorkArea = new javax.swing.JPanel();

        jSystemAdmin.setBackground(new java.awt.Color(255, 153, 153));

        jBtnPanel.setBackground(new java.awt.Color(255, 153, 153));

        jBtnHospitalAdmn.setText("Hospital admin - Doctor Details");
        jBtnHospitalAdmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHospitalAdmnActionPerformed(evt);
            }
        });

        jBtnCommAdmn.setText("Community Admin");
        jBtnCommAdmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCommAdmnActionPerformed(evt);
            }
        });

        jButton1.setText("Hospital Admin - Patient Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBtnPanelLayout = new javax.swing.GroupLayout(jBtnPanel);
        jBtnPanel.setLayout(jBtnPanelLayout);
        jBtnPanelLayout.setHorizontalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBtnPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1))
                    .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnCommAdmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnHospitalAdmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBtnPanelLayout.setVerticalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jBtnHospitalAdmn)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCommAdmn)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jSplitPanel.setLeftComponent(jBtnPanel);

        jWorkArea.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jWorkAreaLayout = new javax.swing.GroupLayout(jWorkArea);
        jWorkArea.setLayout(jWorkAreaLayout);
        jWorkAreaLayout.setHorizontalGroup(
            jWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jWorkAreaLayout.setVerticalGroup(
            jWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jSplitPanel.setRightComponent(jWorkArea);

        javax.swing.GroupLayout jSystemAdminLayout = new javax.swing.GroupLayout(jSystemAdmin);
        jSystemAdmin.setLayout(jSystemAdminLayout);
        jSystemAdminLayout.setHorizontalGroup(
            jSystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSystemAdminLayout.createSequentialGroup()
                .addComponent(jSplitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jSystemAdminLayout.setVerticalGroup(
            jSystemAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSystemAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCommAdmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCommAdmnActionPerformed
        // TODO add your handling code here:
        CommunityAdminJPanel commAdmn = new CommunityAdminJPanel(historyH);
        jSplitPanel.setRightComponent(commAdmn);
        
    }//GEN-LAST:event_jBtnCommAdmnActionPerformed

    private void jBtnHospitalAdmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHospitalAdmnActionPerformed
        // TODO add your handling code here:
        HospitalAdminJPanel hospitalAdmn = new HospitalAdminJPanel(history);
        jSplitPanel.setRightComponent(hospitalAdmn);
    }//GEN-LAST:event_jBtnHospitalAdmnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AppointmentBookingDetails patientDetails=new AppointmentBookingDetails(historyP);
        jSplitPanel.setRightComponent(patientDetails);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCommAdmn;
    private javax.swing.JButton jBtnHospitalAdmn;
    private javax.swing.JPanel jBtnPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane jSplitPanel;
    private javax.swing.JPanel jSystemAdmin;
    private javax.swing.JPanel jWorkArea;
    // End of variables declaration//GEN-END:variables

}
