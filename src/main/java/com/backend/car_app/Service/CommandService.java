package com.backend.car_app.Service;

import com.backend.car_app.Service.implementation.factory_method.CommandeFactory;
import com.backend.car_app.models.Client;
import com.backend.car_app.models.Commande;
import com.backend.car_app.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CommandService {
    @Autowired
    CommandRepository commandRepo;
    @Autowired
    CommandeFactory factory;

    //fonction permettant de creer une commande
    public Commande createcommande(String datecommand,

                                   Client idclient,
                                   String etatcommand,

                                   MultipartFile docImmatriculation,
                                   MultipartFile docCertificat,
                                   MultipartFile  docBonCommande,
                                   String typeCommande) throws IOException {

        Commande cmd = factory.createCommande(datecommand,idclient,etatcommand,docImmatriculation,docCertificat,docBonCommande,typeCommande);
        commandRepo.save(cmd);
        return cmd;

    }

}
