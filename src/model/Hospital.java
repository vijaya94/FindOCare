/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Hospital {
    private String hName;
    private String hCity;
    private String hCountry;

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    public String gethCountry() {
        return hCountry;
    }

    public void sethCountry(String hCountry) {
        this.hCountry = hCountry;
    }
    
      @Override
    public String toString(){
        return hName;
    }
    
    
}
