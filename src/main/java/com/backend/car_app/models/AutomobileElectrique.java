package com.backend.car_app.models;

import jakarta.persistence.Entity;

@Entity
public class AutomobileElectrique extends Automobile {
    public AutomobileElectrique(String photocar, String modele, String marque, String anneeFab, Double prix, String description, String typeCarburant, String etat, String localisation,String typeVehicule) {
        super(photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation,typeVehicule);
    }

    public AutomobileElectrique(){
        super();
    }
}
