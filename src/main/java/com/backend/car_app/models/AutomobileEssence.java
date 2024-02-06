package com.backend.car_app.models;

import jakarta.persistence.Entity;

@Entity
public class AutomobileEssence extends Automobile{
    public AutomobileEssence(String photocar, String modele, String marque, String anneeFab, Double prix, String description, String typeCarburant, String etat, String localisation,String typevehicule) {
        super(photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation,typevehicule);
    }

    public AutomobileEssence(){
        super();
    }
}
