package com.backend.car_app.Service.implementation.decorator;

public class VueVehicle extends ComposantGraphiqueVehicule{

    private String informations;

    @Override
    public void affiche() {
        System.out.println("Informations : "+informations);
    }
    
}
