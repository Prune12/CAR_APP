package com.backend.car_app.Service.implementation.abstract_factory;

import com.backend.car_app.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//classe concrete de factory representant la famille des vehicules à essence
@Service
public class FactoryVehiculeEssence extends IfactoryCarburant{

    @Override
    public Car creerVehicule(String typeVehicule, MultipartFile photocar, String modele, String marque, String anneeFab, Double prix,
                             String description, String typeCarburant, String etat, String localisation) {

        Car vehiculeBase = creerVehiculeBase(typeVehicule, photocar, modele, marque, anneeFab, prix,
                description, typeCarburant, etat, localisation);

        if (typeCarburant.equalsIgnoreCase("Essence")) {
            if (vehiculeBase instanceof Automobile) {
                return new AutomobileEssence();
            } else if (vehiculeBase instanceof Scooter) {
                return new ScooterEssence();
            } else {
                throw new IllegalArgumentException("Type de véhicule non supporté");
            }
        } else {
            throw new IllegalArgumentException("Type de carburant non supporté");
        }
    }

    @Override
    protected Car creerVehiculeBase(String typeVehicule, MultipartFile photocar, String modele, String marque, String anneeFab, Double prix,
                                    String description, String typeCarburant, String etat, String localisation) {

        if (typeVehicule.equalsIgnoreCase("Automobile")) {
            return new Automobile();
        } else if (typeVehicule.equalsIgnoreCase("Scooter")) {
            return new Scooter();
        } else {
            throw new IllegalArgumentException("Type de véhicule non supporté");
        }
    }

    }




