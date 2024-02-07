package com.backend.car_app.controller;

import com.backend.car_app.Service.CarService;
import com.backend.car_app.Service.VehiculeDocumentsService;
import com.backend.car_app.models.Car;
import com.backend.car_app.models.VehiculeDocuments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

// controller qui retourne les api les fonctionalités d'un vehicule
@RestController
@RequestMapping("/api/vehicule/")
public class CarController {
    @Autowired
    CarService carServ;
    @Autowired
    VehiculeDocumentsService builder;
    @PostMapping(path = "/abstractfactory/createvehicule", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> creerVehicule(
          @RequestParam(required = false) MultipartFile photocar,
          @RequestParam(required = false)  String typeVehicule,
          @RequestParam(required = false)  String typeCarburant,
          @RequestParam(required = false)  String modele,
          @RequestParam(required = false)  String marque,
          @RequestParam(required = false)  String anneeFab,
          @RequestParam(required = false)  Double prix,
          @RequestParam(required = false)  String description,
          @RequestParam(required = false)  String etat,
          @RequestParam(required = false)  String localisation
    ) throws IOException {
        Car vehicule= carServ.creerVehicule(photocar,typeVehicule,typeCarburant,modele,marque,anneeFab,prix,description,etat,localisation);
        return ResponseEntity.ok(vehicule);

    }

    //fonction permettant de creer un objet document constitué d'une liasse de document
    @PostMapping(path = "/builder/createdocuments", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> buildAndSaveVehicleDocuments(@RequestParam(required = false) MultipartFile docImmatriculation,
                                                          @RequestParam(required = false) MultipartFile docCertificat,
                                                          @RequestParam(required = false) MultipartFile BonCommande
    ) throws IOException {
        if (!Arrays.stream(new MultipartFile[]{docImmatriculation,docCertificat,BonCommande})
                .filter(Objects::nonNull)
                .allMatch(file -> Arrays.asList("application/pdf","text/html").contains(file.getContentType()))) {
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Seulement les fichiers pdf ou Html sont acceptees");

        }
        VehiculeDocuments vehicleDocuments = builder.buildAndSaveVehicleDocuments(docImmatriculation,docCertificat,BonCommande);
        return ResponseEntity.ok(vehicleDocuments);
    }
}
