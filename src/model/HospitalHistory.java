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
public class HospitalHistory {
    private ArrayList<Hospital> historyH;
    
    public HospitalHistory(){
        
    this.historyH = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHistory() {
        return historyH;
    }
    
     public void setHistory(ArrayList<Hospital> historyH) {
        this.historyH = historyH;
    }
    
     public Hospital addNewHospital(){
        Hospital newHosptl = new Hospital();
        historyH.add(newHosptl);
        return newHosptl;
    }
    
    public void deleteHospital(Hospital h){
        historyH.remove(h);
    }
    
}
