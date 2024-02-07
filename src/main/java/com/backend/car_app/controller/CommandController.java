package com.backend.car_app.controller;

import com.backend.car_app.Service.CommandService;
import com.backend.car_app.models.Client;
import com.backend.car_app.models.Commande;
import com.backend.car_app.repository.ClientRepository;
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

@RestController
@RequestMapping("/api/vehicule/")
public class CommandController {

    @Autowired
    CommandService serv;
    @Autowired
    ClientRepository repo;

    //fonction permettant de creer une commande
    @PostMapping(path = "/factory/createcommande", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createcommande(@RequestParam(required = false) String datecommand,

                                         @RequestParam(required = false) String client,
                                         @RequestParam(required = false) String etatcommand,

                                         @RequestParam(required = false) MultipartFile docImmatriculation,
                                         @RequestParam(required = false) MultipartFile docCertificat,
                                         @RequestParam(required = false) MultipartFile  docBonCommande,
                                         @RequestParam(required = false) String typeCommande
    ) throws IOException {
        if (!Arrays.stream(new MultipartFile[]{docImmatriculation, docCertificat, docBonCommande})
                .filter(Objects::nonNull)
                .allMatch(file -> Arrays.asList("application/pdf", "text/html").contains(file.getContentType()))) {
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Seulement les fichiers pdf ou Html sont acceptees");

        }
        Client nameclient = repo.findByNameIgnoreCase(client).orElseThrow(() -> new RuntimeException("Niveau  is not found"));

        Commande cmd = serv.createcommande(datecommand, nameclient, etatcommand, docImmatriculation, docCertificat, docBonCommande, typeCommande);
        return  ResponseEntity.ok(cmd);

    }

}
