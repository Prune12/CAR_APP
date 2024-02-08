package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
//application du patron singleton à la classe vehiculeDocuments
public class VehiculeDocuments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddoc;
    private String demandeImmatriculation;
    private String certificatCession;
    private String bonCommande;
    // attribut stactic de type VehiculeDocuments qui retournera l'instance correspondante
    private static VehiculeDocuments instance;



    public void setDemandeImmatriculation(String demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    public void setCertificatCession(String certificatCession) {
        this.certificatCession = certificatCession;
    }

    public void setBonCommande(String bonCommande) {
        this.bonCommande = bonCommande;
    }
    public Long getIddoc() {
        return iddoc;
    }

    public String getDemandeImmatriculation() {
        return demandeImmatriculation;
    }

    public String getCertificatCession() {
        return certificatCession;
    }

    public String getBonCommande() {
        return bonCommande;
    }

    //constructeur contenant des valeurs

    private VehiculeDocuments ( String demandeImmatriculation,
     String certificatCession,
    String bonCommande) {
        this.bonCommande=bonCommande;
        this.certificatCession=demandeImmatriculation;
        this.certificatCession=certificatCession;
    }

    //constructeur vide
    private VehiculeDocuments (){

    }
     //methode pour obtenir l'instance de la classe

    public static VehiculeDocuments getInstance() {

            instance=new VehiculeDocuments();

        return instance;
    }
    public static VehiculeDocuments getInstance(String demandeImmatriculation,
                                                String certificatCession,
                                                String bonCommande) {
        if (instance==null){
            instance=new VehiculeDocuments(demandeImmatriculation,certificatCession,bonCommande);
        }
        return instance;
    }
}
