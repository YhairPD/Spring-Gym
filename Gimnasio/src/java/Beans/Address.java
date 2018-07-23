/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yhair
 */
@Entity
@Table( name = "direccion", catalog = "gimnasio")
public class Address {
    
    @GeneratedValue
    @Expose
    @Id 
    @Column(name="idDireccion", nullable = false )
    private Integer idAddress;
    
    @Expose
    @Column(name="calle", nullable = false )
    private String street;
    
    @Expose
    @Column(name="numero", nullable = false )
    private String number;
    
    @Expose
    @Column(name="codigo_postal", nullable = false )
    private String postalCode;
    
    @Expose
    @Column(name="ciudad", nullable = false )
    private String city;
    
    @Expose
    @Column(name="estado", nullable = false )
    private String state;
    
    @Expose
    @Column(name="pais", nullable = false )
    private String country;

    /**
     * @return the idAddress
     */
    public Integer getIdAddress() {
        return idAddress;
    }

    /**
     * @param idAddress the idAddress to set
     */
    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
 
}
