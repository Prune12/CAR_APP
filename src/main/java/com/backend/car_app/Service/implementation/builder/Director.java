package com.backend.car_app.Service.implementation.builder;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
// Directeur
public class Director {

        private VehicleDocumentsBuilder builder;



        public void construct(MultipartFile docImmatriculation,MultipartFile docCertificat,MultipartFile docBonCommande)throws IOException {
            builder.buildDemandeImmatriculation(docImmatriculation);
            builder.buildCertificatCession(docCertificat);
            builder.buildBonCommande(docBonCommande);
        }

}
