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
<<<<<<< Updated upstream
    private String Cnic;
    private String PIllness;
    private String ChooseDoctor;
    private String FName;
    private String diagnosis;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
=======
    
    public String getChooseCity() {
        return ChooseCity;
    }

    public void setChooseCity(String ChooseCity) {
        this.ChooseCity = ChooseCity;
    }

    public String getChooseHospital() {
        return ChooseHospital;
    }

    public void setChooseHospital(String ChooseHospital) {
        this.ChooseHospital = ChooseHospital;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    private String ChooseCity;
    private String ChooseHospital;
    private String PhoneNumber;
    private String Address;
    private String Diagnosis;

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }
    
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
    
    @Override
=======
    private String FName;

   
    private String Cnic;
    private String PIllness;
    private String ChooseDoctor;
   
   @Override
>>>>>>> Stashed changes
    public String toString(){
        return PatientName;
    }

<<<<<<< Updated upstream
}

=======

}


>>>>>>> Stashed changes
