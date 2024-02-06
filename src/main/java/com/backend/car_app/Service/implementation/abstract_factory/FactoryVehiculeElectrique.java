package com.backend.car_app.Service.implementation.abstract_factory;

import com.backend.car_app.models.*;
import org.springframework.stereotype.Service;

@Service
public class FactoryVehiculeElectrique extends IfactoryCarburant {

    @Override
    public Car creerVehicule(String typeVehicule, String photocar, String modele, String marque, String anneeFab, Double prix,
                             String description, String typeCarburant, String etat, String localisation) {

        Car vehiculeBase = creerVehiculeBase(typeVehicule, photocar, modele, marque, anneeFab, prix,
                description, typeCarburant, etat, localisation);

        if (typeCarburant.equalsIgnoreCase("Electrique")) {
            if (vehiculeBase instanceof Automobile) {
                return new AutomobileElectrique(photocar, modele, marque, anneeFab, prix, description, typeCarburant, etat, localisation,typeVehicule);
            } else if (vehiculeBase instanceof Scooter) {
                return new ScooterElectrique(photocar, modele, marque, anneeFab, prix, description, typeCarburant, etat, localisation,typeVehicule);
            } else {
                throw new IllegalArgumentException("Type de véhicule non supporté");
            }
        } else {
            throw new IllegalArgumentException("Type de carburant non supporté");
        }
    }

    @Override
    protected Car creerVehiculeBase(String typeVehicule, String photocar, String modele, String marque, String anneeFab, Double prix,
                                    String description, String typeCarburant, String etat, String localisation) {

        if (typeVehicule.equalsIgnoreCase("Automobile")) {
            return new Automobile(photocar, modele, marque, anneeFab, prix, description, typeCarburant, etat, localisation,typeVehicule);
        } else if (typeVehicule.equalsIgnoreCase("Scooter")) {
            return new Scooter(photocar, modele, marque, anneeFab, prix, description, typeCarburant, etat, localisation,typeVehicule);
        } else {
            throw new IllegalArgumentException("Type de véhicule non supporté");
        }
    }
}

