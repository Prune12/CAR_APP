package com.backend.car_app.Service.implementation.builder;

import com.backend.car_app.models.VehiculeDocuments;
import com.backend.car_app.repository.VehiculeDocumentRepository;
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
// Monteur concret
public class VehicleDocumentsBuilderImpl extends VehicleDocumentsBuilder {



    @Autowired
    VehiculeDocumentRepository repository;


    public VehiculeDocuments construct(MultipartFile docImmatriculation, MultipartFile docCertificat, MultipartFile docBonCommande)throws IOException {
        VehiculeDocuments vehicleDocuments = new VehiculeDocuments();
        buildDemandeImmatriculation(vehicleDocuments, docImmatriculation);
        buildCertificatCession(vehicleDocuments, docCertificat);
        buildBonCommande(vehicleDocuments, docBonCommande);
        return repository.save(vehicleDocuments);
    }
    public void buildDemandeImmatriculation(VehiculeDocuments vehicleDocuments,MultipartFile docImmatriculation) throws IOException {
        final String folder1 = new ClassPathResource("static/docImmatriculation/").getFile().getAbsolutePath();
        final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docImmatriculation/").path(docImmatriculation.getOriginalFilename()).toUriString();
        byte[] bytes1 = docImmatriculation.getBytes();
        Path path1 = Paths.get(folder1 + File.separator + docImmatriculation.getOriginalFilename());
        Files.write(path1, bytes1);
        System.out.println(route1);
        vehicleDocuments.setDemandeImmatriculation("/docImmatriculation/" + docImmatriculation.getOriginalFilename());
    }

    public void buildCertificatCession(VehiculeDocuments vehicleDocuments,MultipartFile docCertificat) throws IOException {
        final String folder1 = new ClassPathResource("static/docCertificat/").getFile().getAbsolutePath();
        final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docCertificat/").path(docCertificat.getOriginalFilename()).toUriString();
        byte[] bytes1 = docCertificat.getBytes();
        Path path1 = Paths.get(folder1 + File.separator + docCertificat.getOriginalFilename());
        Files.write(path1, bytes1);
        System.out.println(route1);
        vehicleDocuments.setCertificatCession("/docCertificat/" + docCertificat.getOriginalFilename());
    }

    public void buildBonCommande(VehiculeDocuments vehicleDocuments,MultipartFile docBonCommande) throws IOException {
        final String folder1 = new ClassPathResource("static/docBonCommande/").getFile().getAbsolutePath();
        final String route1 = ServletUriComponentsBuilder.fromCurrentContextPath().path("/docBonCommande/").path(docBonCommande.getOriginalFilename()).toUriString();
        byte[] bytes1 = docBonCommande.getBytes();
        Path path1 = Paths.get(folder1 + File.separator + docBonCommande.getOriginalFilename());
        Files.write(path1, bytes1);
        System.out.println(route1);
        vehicleDocuments.setBonCommande("/docBonCommande/" + docBonCommande.getOriginalFilename());
    }

    /*public VehiculeDocuments getResult() {
        return vehicleDocuments;
    }*/




}