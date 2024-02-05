package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idclient;

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public Long getIdclient() {
        return idclient;
    }
}
