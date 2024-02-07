package com.backend.car_app.Service;

import com.backend.car_app.Service.implementation.builder.Director;
import com.backend.car_app.Service.implementation.builder.VehicleDocumentsBuilder;
import com.backend.car_app.Service.implementation.builder.VehicleDocumentsBuilderImpl;
import com.backend.car_app.models.VehiculeDocuments;
import com.backend.car_app.repository.VehiculeDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class VehiculeDocumentsService {

    private final VehicleDocumentsBuilderImpl builder;
    private final VehiculeDocumentRepository repository;

    public VehiculeDocumentsService(VehicleDocumentsBuilderImpl builder, VehiculeDocumentRepository repository){
        this.builder=builder;
        this.repository=repository;

    }
    //fonction permettant de creer un objet document constitué d'une liasse de document
    public VehiculeDocuments buildAndSaveVehicleDocuments(MultipartFile docImmatriculation,MultipartFile docCertificat,MultipartFile BonCommande) throws IOException {
        VehiculeDocuments vehicleDocuments = builder.construct(docImmatriculation,docCertificat,BonCommande);

        return vehicleDocuments;
    }
}


