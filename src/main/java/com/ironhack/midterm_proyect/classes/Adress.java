package com.ironhack.midterm_proyect.classes;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
    private String street;
    private String city;
    private String country;
    private Integer postalCode;

    public Adress() {
    }

    public Adress(String street, String city, String country, Integer postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }
}
