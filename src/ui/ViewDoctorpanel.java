/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Patient;
import model.PatientHistory;

/**
 *
 * @author Parth Gurjar
 */
public class ViewDoctorpanel extends javax.swing.JPanel {

    private final PatientHistory historyP;

    /**
     * Creates new form ViewDoctorpanel
     * @param historyP
     */
    public ViewDoctorpanel(PatientHistory historyP) {
        initComponents();
        
        this.historyP = historyP;
        populateTablePatient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPFather = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextPIll = new javax.swing.JTextField();
        jBtnView = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextPSearch = new javax.swing.JTextField();
        jLabeldiagnosis = new javax.swing.JLabel();
        jTextPdiagnosis = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Father's Name", "CNIC", "Patient Illness", "Diagnosis"
            }
        ));
        jScrollPane1.setViewportView(tblPatient);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Patients Details");

        jLabel3.setText("Patient Name");

        jTextPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Father's Name");

        jLabel5.setText("CNIC Number");

        jTextCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCNActionPerformed(evt);
            }
        });

        jLabel6.setText("Patient Illness");

        jTextPIll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPIllActionPerformed(evt);
            }
        });

        jBtnView.setText("View Patient");
        jBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search Patient");

        jTextPSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPSearchActionPerformed(evt);
            }
        });
        jTextPSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPSearchKeyPressed(evt);
            }
        });

        jLabeldiagnosis.setText("Add Diagnosis");

        jTextPdiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPdiagnosisActionPerformed(evt);
            }
        });

        btnSubmit.setText("Sumbit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabeldiagnosis)
                                    .addGap(305, 305, 305)
                                    .addComponent(btnSubmit))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(41, 41, 41)
                                    .addComponent(jTextPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(95, 95, 95)
                                    .addComponent(jBtnView))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(254, 254, 254)
                                    .addComponent(jTextPdiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(90, 90, 90)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextPName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextPFather, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(91, 91, 91)
                                    .addComponent(jTextPIll, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(90, 90, 90)
                                    .addComponent(jTextCN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPIll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeldiagnosis)
                    .addComponent(jTextPdiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnView))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPNameActionPerformed

    private void jTextPIllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPIllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPIllActionPerformed

    private void jTextCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCNActionPerformed

    private void jBtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex, 0);

        jTextPName.setText(String.valueOf(p.getPatientName()));
        jTextPFather.setText(String.valueOf(p.getFName()));
        jTextCN.setText(String.valueOf(p.getCnic()));
        jTextPIll.setText(String.valueOf(p.getPIllness()));
        
    }//GEN-LAST:event_jBtnViewActionPerformed

    private void jTextPSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPSearchActionPerformed

    private void jTextPSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPSearchKeyPressed
        // TODO add your handling code here:
        jTextCN.setText("");
        jTextPName.setText("");
        jTextPIll.setText("");
        jTextPFather.setText("");
        

        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        TableRowSorter<DefaultTableModel> ts = new TableRowSorter<DefaultTableModel>(model);
        tblPatient.setRowSorter(ts);
        ts.setRowFilter(RowFilter.regexFilter(jTextPSearch.getText().trim()));
    }//GEN-LAST:event_jTextPSearchKeyPressed

    private void jTextPdiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPdiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPdiagnosisActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String diagnosis=jTextPdiagnosis.getText();
        

        Patient p = historyP.addNewPatient();
        String dadd = null;

        p.setDiagnosis(dadd);
       

        JOptionPane.showMessageDialog(this, "\n\n Patient Diagnosis Added");

        jTextPdiagnosis.setText("");
        

        //JOptionPane.showMessageDialog(rootPane,"Patient Name: "+ pname+ "\nFather Name: "+fname+"\nCnic: "+Cnic+"\n\n Data has been Submitted");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jBtnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabeldiagnosis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCN;
    private javax.swing.JTextField jTextPFather;
    private javax.swing.JTextField jTextPIll;
    private javax.swing.JTextField jTextPName;
    private javax.swing.JTextField jTextPSearch;
    private javax.swing.JTextField jTextPdiagnosis;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables

    private void populateTablePatient() {
        
         DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        
        for(Patient p: historyP.getHistoryP()){
            
            Object[] rowp=new Object[5];
            rowp[0]=p;
            rowp[1]=p.getFName();
            rowp[2]=p.getCnic();
            rowp[3]=p.getPIllness();
            rowp[4]=p.getChooseDoctor();
            
            model.addRow(rowp);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  }
}
