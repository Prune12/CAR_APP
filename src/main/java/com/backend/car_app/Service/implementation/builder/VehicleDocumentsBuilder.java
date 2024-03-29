package com.backend.car_app.Service.implementation.builder;

import com.backend.car_app.models.VehiculeDocuments;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
// Monteur abstrait
public abstract class VehicleDocumentsBuilder {
    abstract void buildDemandeImmatriculation(VehiculeDocuments vehicleDocuments,MultipartFile docImmatriculation) throws IOException;
    abstract void buildCertificatCession(VehiculeDocuments vehicleDocuments,MultipartFile docCertificat) throws IOException;
    abstract void buildBonCommande(VehiculeDocuments vehicleDocuments,MultipartFile docBonCommande) throws IOException;
    //abstract VehiculeDocuments getResult();
    abstract public VehiculeDocuments construct(MultipartFile docImmatriculation, MultipartFile docCertificat, MultipartFile docBonCommande)throws IOException ;

}
