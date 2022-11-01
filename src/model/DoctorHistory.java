/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Vijaya B.
 */
public class DoctorHistory {
    private ArrayList<Doctor> history;
    
    public DoctorHistory(){
        
    this.history = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getHistory() {
        return history;
    }
    
     public void setHistory(ArrayList<Doctor> history) {
        this.history = history;
    }
    
     public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        history.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor d){
        history.remove(d);
    }   
    
}
