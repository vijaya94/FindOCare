/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author Vijaya B.
=======
 * @author HP
>>>>>>> bb42f3c4d4219cd98ffd7e1e4a384665c700ce6f
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
    
<<<<<<< HEAD
     public Doctor addNewDoctor(){
=======
     public Doctor addNewEmployee(){
>>>>>>> bb42f3c4d4219cd98ffd7e1e4a384665c700ce6f
        Doctor newDoctor = new Doctor();
        history.add(newDoctor);
        return newDoctor;
    }
    
<<<<<<< HEAD
    public void deleteDoctor(Doctor d){
        history.remove(d);
    }   
=======
    public void deleteEmployee(Doctor d){
        history.remove(d);
    }
    
>>>>>>> bb42f3c4d4219cd98ffd7e1e4a384665c700ce6f
    
}
