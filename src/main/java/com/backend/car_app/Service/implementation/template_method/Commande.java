package com.backend.car_app.Service.implementation.template_method;

import com.backend.car_app.models.Car;
import com.backend.car_app.models.User;

public abstract class Commande {
    private Car vehicule;
    private Integer quantity;

    private User client;

    private Etat etat;

    private Double totale;

    public Commande(){
    }

    public Commande(Car vehicule,User client, Integer quantity, Etat etat) {
        this.vehicule = vehicule;
        this.quantity = quantity;
        this.client = client;
        this.etat = etat;
        this.totale = vehicule.getPrix() * quantity;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getClient() {
        return client;
    }


    public abstract Double calculerTva();
    public Double calculerTotale(){
        return this.totale + calculerTva();
    }
    public Car getVehicule() {
        return vehicule;
    }

    public void setVehicule(Car vehicule) {
        this.vehicule = vehicule;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Double getTotale() {
        return totale;
    }
}
