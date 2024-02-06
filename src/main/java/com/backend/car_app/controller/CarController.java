package com.backend.car_app.controller;

import com.backend.car_app.Service.CarService;
import com.backend.car_app.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
// controller qui retourne les api les fonctionalités d'un vehicule
@RestController
@RequestMapping("/api/abstractfactory/")
public class CarController {
    @Autowired
    CarService carServ;
    @PostMapping(path = "/createvehicule", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
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
}
