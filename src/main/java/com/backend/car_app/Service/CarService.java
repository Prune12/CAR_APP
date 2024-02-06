package com.backend.car_app.Service;

import com.backend.car_app.Service.implementation.abstract_factory.FactoryVehiculeElectrique;
import com.backend.car_app.Service.implementation.abstract_factory.FactoryVehiculeEssence;
import com.backend.car_app.models.*;
import com.backend.car_app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//service qui implemente les fonctionnalités d'un vehicule
@Service
public class CarService {


        @Autowired
        private CarRepository vehiculeRepository;

        @Autowired
        private FactoryVehiculeEssence fabriqueVehiculeEssence;

        @Autowired
        private FactoryVehiculeElectrique fabriqueVehiculeElectrique;

    public Car creerVehicule(MultipartFile photocar, String typeVehicule, String typeCarburant, String modele, String marque, String anneeFab, Double prix,
                             String description, String etat, String localisation) throws IOException {


        if (typeCarburant.equalsIgnoreCase("Essence")) {
            Car vehicule= fabriqueVehiculeEssence.creerVehicule(typeVehicule,photocar,modele,marque,anneeFab,prix,description,typeCarburant,etat,localisation);
            vehicule.setTypeVehicule(typeVehicule);
            final String folder1 = new ClassPathResource("static/photocar/").getFile().getAbsolutePath();
            final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/photouser/").path(photocar.getOriginalFilename()).toUriString();
            byte[] bytes1 = photocar.getBytes();
            Path path1 = Paths.get(folder1 + File.separator + photocar.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            vehicule.setPhotocar("/photocar/" + photocar.getOriginalFilename());
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
            final String folder1 = new ClassPathResource("static/photocar/").getFile().getAbsolutePath();
            final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/photouser/").path(photocar.getOriginalFilename()).toUriString();
            byte[] bytes1 = photocar.getBytes();
            Path path1 = Paths.get(folder1 + File.separator + photocar.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            vehicules.setPhotocar("/photocar/" + photocar.getOriginalFilename());
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
