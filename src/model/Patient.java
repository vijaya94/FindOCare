/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sajja
 */
public class Patient {
    private String PatientName;
    private String Cnic;
    private String PIllness;
    private String ChooseDoctor;
    private String FName;

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String Cnic) {
        this.Cnic = Cnic;
    }

    public String getPIllness() {
        return PIllness;
    }

    public void setPIllness(String PIllness) {
        this.PIllness = PIllness;
    }

    public String getChooseDoctor() {
        return ChooseDoctor;
    }

    public void setChooseDoctor(String ChooseDoctor) {
        this.ChooseDoctor = ChooseDoctor;
    }
    
    @Override
    public String toString(){
        return PatientName;
    }

}

