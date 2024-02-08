package com.backend.car_app.Service.implementation.template_method;

public class CommandeGabon extends Commande{
    @Override
    public Double calculerTva() {
        return (this.getTotale() * 0.15);
    }
}
