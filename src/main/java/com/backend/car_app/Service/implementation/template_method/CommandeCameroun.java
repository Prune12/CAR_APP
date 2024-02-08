package com.backend.car_app.Service.implementation.template_method;

public class CommandeCameroun extends Commande{
    @Override
    public Double calculerTva() {
        return (this.getTotale()*0.196);
    }
}
