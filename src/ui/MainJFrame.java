/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
import model.DoctorHistory;
import model.HospitalHistory;
import model.PatientHistory;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
/**
 *
 * @author HP
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public MainJFrame() {
        initComponents();
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    DoctorHistory history;
    PatientHistory historyP;
    HospitalHistory historyH;
    
    public MainJFrame() {
        initComponents();
        history = new DoctorHistory();
        historyP = new PatientHistory();
        historyH = new HospitalHistory();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
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
        PatientPanel = new javax.swing.JButton();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        DoctorJPanel = new javax.swing.JButton();
        SAJPanel = new javax.swing.JButton();
        CAJPanel = new javax.swing.JButton();
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        jBtnDoctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBtnHospitalAdmn = new javax.swing.JButton();
        jBtnAdminPatient = new javax.swing.JButton();
        jBtnCommAdmn = new javax.swing.JButton();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        jWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        PatientPanel.setText("Are you a patient?");
=======
        jBtnPanel.setBackground(new java.awt.Color(255, 153, 153));

        PatientPanel.setText("Patient Register");
>>>>>>> Stashed changes
=======
        jBtnPanel.setBackground(new java.awt.Color(255, 153, 153));

        PatientPanel.setText("Patient Register");
>>>>>>> Stashed changes
=======
        jBtnPanel.setBackground(new java.awt.Color(255, 153, 153));

        PatientPanel.setText("Patient Register");
>>>>>>> Stashed changes
        PatientPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientPanelActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        DoctorJPanel.setText("Are you a doctor?");

        SAJPanel.setText("System Admin");

        CAJPanel.setText("Community Admin");
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        jBtnDoctor.setText("Are you a doctor?");
        jBtnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDoctorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Optimized-FindOCare.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setText("Patient's Booking Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBtnHospitalAdmn.setText("Hospital admin - Doctor Details");
        jBtnHospitalAdmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHospitalAdmnActionPerformed(evt);
            }
        });

        jBtnAdminPatient.setText("Hospital Admin - Patient Details");
        jBtnAdminPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdminPatientActionPerformed(evt);
            }
        });

        jBtnCommAdmn.setText("Community Admin");
        jBtnCommAdmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCommAdmnActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

        javax.swing.GroupLayout jBtnPanelLayout = new javax.swing.GroupLayout(jBtnPanel);
        jBtnPanel.setLayout(jBtnPanelLayout);
        jBtnPanelLayout.setHorizontalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CAJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SAJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoctorJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBtnPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(PatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCommAdmn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnHospitalAdmn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAdminPatient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                .addContainerGap())
        );
        jBtnPanelLayout.setVerticalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .addGap(160, 160, 160)
                .addComponent(PatientPanel)
                .addGap(18, 18, 18)
                .addComponent(DoctorJPanel)
                .addGap(27, 27, 27)
                .addComponent(SAJPanel)
                .addGap(26, 26, 26)
                .addComponent(CAJPanel)
                .addContainerGap(235, Short.MAX_VALUE))
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PatientPanel)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jBtnDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCommAdmn)
                .addGap(18, 18, 18)
                .addComponent(jBtnHospitalAdmn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAdminPatient)
                .addContainerGap(171, Short.MAX_VALUE))
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        );

        SplitPanel.setLeftComponent(jBtnPanel);

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
        jWorkArea.setBackground(new java.awt.Color(255, 153, 153));

>>>>>>> Stashed changes
=======
        jWorkArea.setBackground(new java.awt.Color(255, 153, 153));

>>>>>>> Stashed changes
=======
        jWorkArea.setBackground(new java.awt.Color(255, 153, 153));

>>>>>>> Stashed changes
        javax.swing.GroupLayout jWorkAreaLayout = new javax.swing.GroupLayout(jWorkArea);
        jWorkArea.setLayout(jWorkAreaLayout);
        jWorkAreaLayout.setHorizontalGroup(
            jWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
            .addGap(0, 714, Short.MAX_VALUE)
=======
            .addGap(0, 921, Short.MAX_VALUE)
>>>>>>> Stashed changes
=======
            .addGap(0, 921, Short.MAX_VALUE)
>>>>>>> Stashed changes
=======
            .addGap(0, 921, Short.MAX_VALUE)
>>>>>>> Stashed changes
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

    private void PatientPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientPanelActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        PatientJPanel patient = new PatientJPanel();
        SplitPanel.setRightComponent(patient);
    }//GEN-LAST:event_PatientPanelActionPerformed

=======
=======
>>>>>>> Stashed changes
        PatientJPanel patient = new PatientJPanel(historyP);
=======
        MenuJPanel patient = new MenuJPanel(historyP);
>>>>>>> Stashed changes
        SplitPanel.setRightComponent(patient);
    }//GEN-LAST:event_PatientPanelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
        AppointmentBookingDetails patientDetails=new AppointmentBookingDetails(historyP);
=======
        PatientDetails patientDetails=new PatientDetails(historyP);
>>>>>>> Stashed changes
        SplitPanel.setRightComponent(patientDetails);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnHospitalAdmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHospitalAdmnActionPerformed
        // TODO add your handling code here:
        HospitalAdminJPanel hospitalAdmn = new HospitalAdminJPanel(history);
        SplitPanel.setRightComponent(hospitalAdmn);
    }//GEN-LAST:event_jBtnHospitalAdmnActionPerformed

    private void jBtnAdminPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdminPatientActionPerformed
        // TODO add your handling code here:
        PatientAdminAcess pa=new PatientAdminAcess(historyP);
        SplitPanel.setRightComponent(pa);
    }//GEN-LAST:event_jBtnAdminPatientActionPerformed

    private void jBtnCommAdmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCommAdmnActionPerformed
        // TODO add your handling code here:
        CommunityAdminJPanel commAdmn = new CommunityAdminJPanel(historyH);
        SplitPanel.setRightComponent(commAdmn);

    }//GEN-LAST:event_jBtnCommAdmnActionPerformed

    private void jBtnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorpanel dp= new ViewDoctorpanel(historyP);
        SplitPanel.setRightComponent(dp);
        
    }//GEN-LAST:event_jBtnDoctorActionPerformed

<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    private javax.swing.JButton CAJPanel;
    private javax.swing.JButton DoctorJPanel;
    private javax.swing.JButton PatientPanel;
    private javax.swing.JButton SAJPanel;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel jBtnPanel;
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    private javax.swing.JButton PatientPanel;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JButton jBtnAdminPatient;
    private javax.swing.JButton jBtnCommAdmn;
    private javax.swing.JButton jBtnDoctor;
    private javax.swing.JButton jBtnHospitalAdmn;
    private javax.swing.JPanel jBtnPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    private javax.swing.JPanel jWorkArea;
    // End of variables declaration//GEN-END:variables
}
