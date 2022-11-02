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
 * @author Vijaya B.
 */
public class PatientAdminAcess extends javax.swing.JPanel {

    /**
     * Creates new form PatientAdminAcess
     */
    PatientHistory historyP;
    
    public PatientAdminAcess(PatientHistory historyP) {
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

        jTextPName = new javax.swing.JTextField();
        jBtnView = new javax.swing.JButton();
        jTextCN = new javax.swing.JTextField();
        jBtnUpdatePatient = new javax.swing.JButton();
        jTextPFather = new javax.swing.JTextField();
        jBtnDltPatient = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextPSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPChoose = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextPIll = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        jTextPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPNameActionPerformed(evt);
            }
        });

        jBtnView.setText("View Patient");
        jBtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewActionPerformed(evt);
            }
        });

        jBtnUpdatePatient.setText("Update Patient");
        jBtnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdatePatientActionPerformed(evt);
            }
        });

        jBtnDltPatient.setText("Delete Patient");
        jBtnDltPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDltPatientActionPerformed(evt);
            }
        });

        jLabel7.setText("Chosen Dotor");

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

        jLabel2.setText("Search Patient");

        jLabel3.setText("Patient Name");

        jLabel4.setText("Father's Name");

        jLabel5.setText("CNIC Number");

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Father's Name", "CNIC", "Patient Illness", "Choosen Doctor"
            }
        ));
        jScrollPane1.setViewportView(tblPatient);

        jLabel6.setText("Patient Illness");

        jTextPIll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPIllActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Patient Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnView)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnUpdatePatient)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnDltPatient)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jTextPName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(95, 95, 95)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextPFather, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jTextCN)
                                    .addComponent(jTextPIll)
                                    .addComponent(jTextPChoose)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
=======
>>>>>>> Stashed changes
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)
                                    .addComponent(jTextPName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(95, 95, 95)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextPFather, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextCN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextPIll, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextPChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnView)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnUpdatePatient)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtnDltPatient)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnView)
                    .addComponent(jBtnUpdatePatient)
                    .addComponent(jBtnDltPatient)
                    .addComponent(jTextPSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .addGap(25, 25, 25)
=======
                .addGap(18, 18, 18)
>>>>>>> Stashed changes
=======
                .addGap(18, 18, 18)
>>>>>>> Stashed changes
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextPIll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextPChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .addContainerGap(38, Short.MAX_VALUE))
=======
                .addContainerGap(45, Short.MAX_VALUE))
>>>>>>> Stashed changes
=======
                .addContainerGap(45, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPNameActionPerformed

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
       jTextPChoose.setText(String.valueOf(p.getChooseDoctor()));
    }//GEN-LAST:event_jBtnViewActionPerformed

    private void jBtnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdatePatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex, 0);

        if(tblPatient.getSelectedRowCount()==1){
            model.setValueAt(jTextCN.getText(), selectedRowIndex, 0);
            model.setValueAt(jTextPChoose.getText(), selectedRowIndex, 1);
            model.setValueAt(jTextPFather.getText(), selectedRowIndex, 2);
            model.setValueAt(jTextPIll.getText(), selectedRowIndex, 3);
            model.setValueAt(jTextPName.getText(), selectedRowIndex, 4);
        }
        
                
        p.setPatientName(jTextPName.getText());
        p.setFName(jTextPFather.getText());
        p.setCnic(jTextCN.getText());
        p.setPIllness(jTextPIll.getText());
        p.setChooseDoctor(jTextPChoose.getText());
     
     
        JOptionPane.showMessageDialog(null, "Selected Patient's Data are updated.");
    }//GEN-LAST:event_jBtnUpdatePatientActionPerformed

    private void jTextPSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPSearchActionPerformed

    private void jTextPIllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPIllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPIllActionPerformed

    private void jTextPSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPSearchKeyPressed
        // TODO add your handling code here:
        jTextCN.setText("");
        jTextPName.setText("");
        jTextPIll.setText(""); 
        jTextPFather.setText("");
        jTextPChoose.setText("");        
        
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        TableRowSorter<DefaultTableModel> ts = new TableRowSorter<DefaultTableModel>(model);
        tblPatient.setRowSorter(ts);
        ts.setRowFilter(RowFilter.regexFilter(jTextPSearch.getText().trim()));
    }//GEN-LAST:event_jTextPSearchKeyPressed

    private void jBtnDltPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDltPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
       if (selectedRowIndex <0){
           JOptionPane.showMessageDialog(this, "Please select a row to delete.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
       Patient p = (Patient) model.getValueAt(selectedRowIndex, 0);
       
       historyP.deletePatient(p);
       JOptionPane.showMessageDialog(this, "Selected patient details are deleted.");
       
       populateTablePatient();
    }//GEN-LAST:event_jBtnDltPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDltPatient;
    private javax.swing.JButton jBtnUpdatePatient;
    private javax.swing.JButton jBtnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCN;
    private javax.swing.JTextField jTextPChoose;
    private javax.swing.JTextField jTextPFather;
    private javax.swing.JTextField jTextPIll;
    private javax.swing.JTextField jTextPName;
    private javax.swing.JTextField jTextPSearch;
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
        }
    }
}
