/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.PatientHistory;

/**
 *
 * @author HP
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */ 
    PatientHistory historyP;
    
    public MainJFrame() {
        initComponents();
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

        SplitPanel = new javax.swing.JSplitPane();
        jBtnPanel = new javax.swing.JPanel();
        btnPatient = new javax.swing.JButton();
        DoctorJPanel = new javax.swing.JButton();
        SAJPanel = new javax.swing.JButton();
        btnPatientDetails = new javax.swing.JButton();
        SAJPanel = new javax.swing.JButton();
        CAJPanel = new javax.swing.JButton();
        jWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        btnPatient.setText("Are you a patient?");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        DoctorJPanel.setText("Are you a doctor?");

        SAJPanel.setText("System Admin");
        SAJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAJPanelActionPerformed(evt);
            }
        });
        

        btnPatientDetails.setText("See Patient Details");
        btnPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDetailsActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jBtnPanelLayout = new javax.swing.GroupLayout(jBtnPanel);
        jBtnPanel.setLayout(jBtnPanelLayout);
        jBtnPanelLayout.setHorizontalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SAJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DoctorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btnPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addContainerGap())
        );
        jBtnPanelLayout.setVerticalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnPatient)
                .addGap(18, 18, 18)
                .addComponent(btnPatientDetails)
                .addGap(17, 17, 17)
                .addComponent(DoctorJPanel)
                .addGap(18, 18, 18)
                .addComponent(SAJPanel)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        SplitPanel.setLeftComponent(jBtnPanel);

        javax.swing.GroupLayout jWorkAreaLayout = new javax.swing.GroupLayout(jWorkArea);
        jWorkArea.setLayout(jWorkAreaLayout);
        jWorkAreaLayout.setHorizontalGroup(
            jWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jWorkAreaLayout.setVerticalGroup(
            jWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        SplitPanel.setRightComponent(jWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        
        // TODO add your handling code here:
        PatientJPanel patient= new PatientJPanel(historyP);
                
        SplitPanel.setRightComponent(patient);
    }//GEN-LAST:event_btnPatientActionPerformed
    
    private void SAJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAJPanelActionPerformed
        // TODO add your handling code here:
       /* SytemAdmJPanel sa = new SytemAdmJPanel();
        SplitPanel.setRightComponent(sa);*/
       SystemAdminJPanel sa = new SystemAdminJPanel();
       SplitPanel.setRightComponent(sa);
    }//GEN-LAST:event_SAJPanelActionPerformed

    private void btnPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDetailsActionPerformed
//        PatientHistory historyP = null;
        // TODO add your handling code here:
        PatientDetails patientDetails=new PatientDetails(historyP);
        SplitPanel.setRightComponent(patientDetails);
    }//GEN-LAST:event_btnPatientDetailsActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoctorJPanel;
    private javax.swing.JButton SAJPanel;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPatientDetails;
    private javax.swing.JPanel jBtnPanel;
    private javax.swing.JPanel jWorkArea;
    // End of variables declaration//GEN-END:variables
}
