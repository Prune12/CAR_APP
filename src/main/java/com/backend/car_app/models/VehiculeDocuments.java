package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class VehiculeDocuments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddoc;
    private String demandeImmatriculation;
    private String certificatCession;
    private String bonCommande;

    public void setDemandeImmatriculation(String demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    public void setCertificatCession(String certificatCession) {
        this.certificatCession = certificatCession;
    }

    public void setBonCommande(String bonCommande) {
        this.bonCommande = bonCommande;
    }
}
