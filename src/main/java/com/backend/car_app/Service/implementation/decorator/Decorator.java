package com.backend.car_app.Service.implementation.decorator;

public class Decorator extends ComposantGraphiqueVehicule {

    private ComposantGraphiqueVehicule composant;

    public Decorator(ComposantGraphiqueVehicule composant) {
        this.composant = composant;
    }

    @Override
    public void affiche() {
        composant.affiche();
    }
    
}
