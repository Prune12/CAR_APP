package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vendor extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvendor;
    private String name;
    private String surname;
    private String password;
    private  String email;
    private  String username;
    private Long tel;

    public void setIdvendor(Long idvendor) {
        this.idvendor = idvendor;
    }

    public Long getIdvendor() {
        return idvendor;
    }
}
