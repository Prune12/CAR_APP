package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendor extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvendor;

    public void setIdvendor(Long idvendor) {
        this.idvendor = idvendor;
    }

    public Long getIdvendor() {
        return idvendor;
    }
}
