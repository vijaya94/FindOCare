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
    
    public void deletePatient(Patient p){
        historyP.remove(p);
    }  
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======

    
>>>>>>> Stashed changes
=======

    
>>>>>>> Stashed changes
}
