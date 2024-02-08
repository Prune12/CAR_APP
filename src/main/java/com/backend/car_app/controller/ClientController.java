package com.backend.car_app.controller;

import com.backend.car_app.Service.ClientService;
import com.backend.car_app.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class ClientController {
    @Autowired
    ClientService clientServ;

    //fonction permettant la creation d'un compte client
    @PostMapping(path = "/createclient", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createclient(
                                      @RequestParam(required = false) String name,
                                      @RequestParam(required = false) String surname,
                                      @RequestParam(required = false) String password,
                                      @RequestParam(required = false) String email,
                                      @RequestParam(required = false) String username,
                                      @RequestParam(required = false) Long tel){

        Client client= clientServ.createclient(name,surname,password,email,username,tel);
        return ResponseEntity.ok(client);

    }
    //connexion de l'utilisateur
    @PostMapping(path = "/loginclient",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> loginUser(
            @RequestParam String password,
            @RequestParam String email
    ) {

        Client user = clientServ.loginUser(email, password);
        if (user != null) {
            // Retourne l'utilisateur s'il est trouvé
            return ResponseEntity.ok(user);
        } else {
            // Retourne une réponse d'erreur si les informations d'identification sont incorrectes
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Informations d'identification incorrectes.");
        }
    }
}
