package com.backend.car_app.Service.implementation.abstract_factory;

import com.backend.car_app.models.Car;

public abstract class IfactoryCarburant {


        public abstract Car creerVehicule(String typeVehicule,String photocar,String modele, String marque, String anneeFab, Double prix,
                                          String description, String typeCarburant, String etat, String localisation);

        protected Car creerVehiculeBase(String typeVehicule,String photocar,String modele, String marque, String anneeFab, Double prix,
                                             String description, String typeCarburant, String etat, String localisation) {

            Car vehicule = new Car();
            vehicule.setPhotocar(photocar);
            vehicule.setModele(modele);
            vehicule.setMarque(marque);
            vehicule.setAnneefabriq(anneeFab);
            vehicule.setPrix(prix);
            vehicule.setDescription(description);
            vehicule.setTypecarburant(typeCarburant);
            vehicule.setEtat(etat);
            vehicule.setLocalisation(localisation);

            return vehicule;
        }
    }


