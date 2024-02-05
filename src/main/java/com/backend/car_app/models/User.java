package com.backend.car_app.models;

public class User {

    private String name;
    private String surname;
    private String password;
    private  String email;
    private  String username;
    private Long tel;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getTel() {
        return tel;
    }
}
