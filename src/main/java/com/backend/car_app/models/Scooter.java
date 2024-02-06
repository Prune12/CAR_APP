package com.backend.car_app.models;

import jakarta.persistence.Entity;

@Entity
public class Scooter extends Car{

    public Scooter(  String photocar,
                 String modele,
                 String marque,
                 String anneefabriq,
                 Double prix,
                 String description,
                 String typecarburant,
                 String etat,
                 String localisation,
                 String typeVehicule

    ){
        this.setPhotocar(photocar);
        this.setModele(modele);
        this.setMarque(marque);
        this.setAnneefabriq(anneefabriq);
        this.setPrix(prix);
        this.setDescription(description);
        this.setTypecarburant(typecarburant);
        this.setEtat(etat);
        this.setLocalisation(localisation);
        this.setTypeVehicule(typeVehicule);
    }
    public Scooter(){

    }
}
