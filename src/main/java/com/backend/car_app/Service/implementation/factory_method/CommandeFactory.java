package com.backend.car_app.Service.implementation.factory_method;

import com.backend.car_app.models.Client;
import com.backend.car_app.models.Commande;
import com.backend.car_app.models.CommandeAvecDemandeDeCredit;
import com.backend.car_app.models.CommandePayeeAuComptant;
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

@Service
public class CommandeFactory {


    private  CommandePayeeAuComptant commandePayee;
    private  CommandeAvecDemandeDeCredit commandeCredit;

    public Commande createCommande(String datecommand,

                                   Client idclient,
                                   String etatcommand,

                                   MultipartFile docImmatriculation,
                                   MultipartFile docCertificat,
                                   MultipartFile  docBonCommande,
                                   String typeCommande) throws IOException {
        if (typeCommande.equalsIgnoreCase("auComptant")) {
             commandePayee=new CommandePayeeAuComptant();
             commandePayee.setDatecommand(datecommand);
             commandePayee.setIdclient(idclient);
             commandePayee.setEtatcommand(etatcommand);
            final String folder1 = new ClassPathResource("static/docImmatriculation/").getFile().getAbsolutePath();
            final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docImmatriculation/").path(docImmatriculation.getOriginalFilename()).toUriString();
            byte[] bytes1 = docImmatriculation.getBytes();
            Path path1 = Paths.get(folder1 + File.separator + docImmatriculation.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            commandePayee.setDocImatriculation("/docImmatriculation/" + docImmatriculation.getOriginalFilename());

            final String folder2 = new ClassPathResource("static/docImmatriculation/").getFile().getAbsolutePath();
            final String route2 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docCertificat/").path(docCertificat.getOriginalFilename()).toUriString();
            byte[] bytes2 = docCertificat.getBytes();
            Path path2 = Paths.get(folder2 + File.separator + docCertificat.getOriginalFilename());
            Files.write(path2, bytes2);
            System.out.println(route2);
            commandePayee.setDocCertificat("/docCertificat/" + docCertificat.getOriginalFilename());

            final String folder3 = new ClassPathResource("static/docBonCommande/").getFile().getAbsolutePath();
            final String route3 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docCertificat/").path(docBonCommande.getOriginalFilename()).toUriString();
            byte[] bytes3 = docBonCommande.getBytes();
            Path path3 = Paths.get(folder3 + File.separator + docBonCommande.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            commandePayee.setBonCommand("/docBonCommande/" + docBonCommande.getOriginalFilename());
            commandePayee.setTypeCommande(typeCommande);
            return commandePayee;
        } else if (typeCommande.equalsIgnoreCase("avecCredit")) {
            commandeCredit=new CommandeAvecDemandeDeCredit();
            commandeCredit.setDatecommand(datecommand);
            commandeCredit.setIdclient(idclient);
            commandeCredit.setEtatcommand(etatcommand);
            final String folder1 = new ClassPathResource("static/docImmatriculation/").getFile().getAbsolutePath();
            final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docImmatriculation/").path(docImmatriculation.getOriginalFilename()).toUriString();
            byte[] bytes1 = docImmatriculation.getBytes();
            Path path1 = Paths.get(folder1 + File.separator + docImmatriculation.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            commandeCredit.setDocImatriculation("/docImmatriculation/" + docImmatriculation.getOriginalFilename());

            final String folder2 = new ClassPathResource("static/docImmatriculation/").getFile().getAbsolutePath();
            final String route2 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docCertificat/").path(docCertificat.getOriginalFilename()).toUriString();
            byte[] bytes2 = docCertificat.getBytes();
            Path path2 = Paths.get(folder2 + File.separator + docCertificat.getOriginalFilename());
            Files.write(path2, bytes2);
            System.out.println(route2);
            commandeCredit.setDocCertificat("/docCertificat/" + docCertificat.getOriginalFilename());

            final String folder3 = new ClassPathResource("static/docBonCommande/").getFile().getAbsolutePath();
            final String route3 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docCertificat/").path(docBonCommande.getOriginalFilename()).toUriString();
            byte[] bytes3 = docBonCommande.getBytes();
            Path path3 = Paths.get(folder3 + File.separator + docBonCommande.getOriginalFilename());
            Files.write(path1, bytes1);
            System.out.println(route1);
            commandeCredit.setBonCommand("/docBonCommande/" + docBonCommande.getOriginalFilename());
            commandeCredit.setTypeCommande(typeCommande);
            return commandeCredit;
        } else {
            return null;
        }
    }
}
