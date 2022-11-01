/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sajja
 */
public class PatientHistory {
    private ArrayList<Patient> historyP;
    
    public PatientHistory(){
        
    this.historyP = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getHistoryP() {
        return historyP;
    }

    public void setHistoryP(ArrayList<Patient> historyP) {
        this.historyP = historyP;
    }
    
    public Patient addNewPatient(){
        
        Patient newPatient = new Patient();
        
        historyP.add(newPatient);
        return newPatient;
     }
<<<<<<< HEAD
    
    public void deletePatient(Patient p){
        historyP.remove(p);
    }  

    
=======
>>>>>>> bb42f3c4d4219cd98ffd7e1e4a384665c700ce6f
}
