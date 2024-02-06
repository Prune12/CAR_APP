package com.backend.car_app.models;

import jakarta.persistence.Entity;

@Entity
public class ScooterElectrique extends Scooter{
    public ScooterElectrique(String photocar,String modele, String marque, String anneeFab, Double prix, String description, String typeCarburant, String etat, String localisation,String typrVehicule) {
        super(photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation,typrVehicule);
    }

    public ScooterElectrique() {
        super();
    }
}
