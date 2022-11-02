/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vijaya B.
 */
public class Doctor {
    private String dname;
    private int dcontact;
    private String ddegree;
    private String ddepartment;
    private String hospitalName;
    private String cityName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDcontact() {
        return dcontact;
    }

    public void setDcontact(int dcontact) {
        this.dcontact = dcontact;
    }

    public String getDdegree() {
        return ddegree;
    }

    public void setDdegree(String ddegree) {
        this.ddegree = ddegree;
    }

    public String getDdepartment() {
        return ddepartment;
    }

    public void setDdepartment(String ddepartment) {
        this.ddepartment = ddepartment;
    }
    
    @Override
    public String toString(){
        return dname;
    }
    
}
