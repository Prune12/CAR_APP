package com.backend.car_app.Service.implementation.builder;

import com.backend.car_app.models.VehiculeDocuments;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
// Directeur
public class Director {

        private VehicleDocumentsBuilder builder;



        public void construct(MultipartFile docImmatriculation,MultipartFile docCertificat,MultipartFile docBonCommande)throws IOException {
            VehiculeDocuments vehicleDocuments = new VehiculeDocuments();
            builder.buildDemandeImmatriculation(vehicleDocuments,docImmatriculation);
            builder.buildCertificatCession(vehicleDocuments,docCertificat);
            builder.buildBonCommande(vehicleDocuments,docBonCommande);
        }

}
