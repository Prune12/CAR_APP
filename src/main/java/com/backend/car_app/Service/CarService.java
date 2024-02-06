package com.backend.car_app.Service;

import com.backend.car_app.Service.implementation.abstract_factory.FactoryVehiculeElectrique;
import com.backend.car_app.Service.implementation.abstract_factory.FactoryVehiculeEssence;
import com.backend.car_app.models.*;
import com.backend.car_app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {


        @Autowired
        private CarRepository vehiculeRepository;

        @Autowired
        private FactoryVehiculeEssence fabriqueVehiculeEssence;

        @Autowired
        private FactoryVehiculeElectrique fabriqueVehiculeElectrique;

    public Car creerVehicule(String photocar,String typeVehicule, String typeCarburant, String modele, String marque, String anneeFab, Double prix,
                                  String description, String etat, String localisation) {


        if (typeCarburant.equalsIgnoreCase("Essence")) {
            Car vehicule= fabriqueVehiculeEssence.creerVehicule(typeVehicule,photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation);
            vehicule.setTypeVehicule(typeVehicule);
            vehicule.setPhotocar(photocar);
            vehicule.setModele(modele);
            vehicule.setMarque(marque);
            vehicule.setAnneefabriq(anneeFab);
            vehicule.setPrix(prix);
            vehicule.setTypecarburant(typeCarburant);
            vehicule.setDescription(description);
            vehicule.setEtat(etat);
            vehicule.setLocalisation(localisation);
            vehiculeRepository.save(vehicule);
            return vehicule;
        } else if (typeCarburant.equalsIgnoreCase("Electrique")) {
            Car vehicules=fabriqueVehiculeElectrique.creerVehicule(typeVehicule,photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation);
            vehicules.setTypeVehicule(typeVehicule);
            vehicules.setPhotocar(photocar);
            vehicules.setModele(modele);
            vehicules.setMarque(marque);
            vehicules.setAnneefabriq(anneeFab);
            vehicules.setPrix(prix);
            vehicules.setTypecarburant(typeCarburant);
            vehicules.setDescription(description);
            vehicules.setEtat(etat);
            vehicules.setLocalisation(localisation);
            vehiculeRepository.save(vehicules);
            return vehicules;
        } else {
            throw new IllegalArgumentException("Type de carburant non supporté");
        }
    }

}
