package com.backend.car_app.models;

import jakarta.persistence.*;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcommand;
    private String datecommand;
    @ManyToOne
    private Client idclient;
    private String etatcommand;
   //<--les 03 documents demandés pour faire une commande
    private String docImatriculation;
    private String docCertificat;
    private String bonCommand;
    //-->
    private String typeCommande;
    public void setIdcommand(Long idcommand) {
        this.idcommand = idcommand;
    }

    public Long getIdcommand() {
        return idcommand;
    }

    public void setDatecommand(String datecommand) {
        this.datecommand = datecommand;
    }

    public String getDatecommand() {
        return datecommand;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

    public Client getIdclient() {
        return idclient;
    }

    public void setEtatcommand(String etatcommand) {
        this.etatcommand = etatcommand;
    }

    public String getEtatcommand() {
        return etatcommand;
    }

    public void setDocImatriculation(String docImatriculation) {
        this.docImatriculation = docImatriculation;
    }

    public String getDocImatriculation() {
        return docImatriculation;
    }

    public void setDocCertificat(String docCertificat) {
        this.docCertificat = docCertificat;
    }

    public String getDocCertificat() {
        return docCertificat;
    }

    public void setBonCommand(String bonCommand) {
        this.bonCommand = bonCommand;
    }

    public String getBonCommand() {
        return bonCommand;
    }

    public void setTypeCommande(String typeCommande) {
        this.typeCommande = typeCommande;
    }

    public String getTypeCommande() {
        return typeCommande;
    }

    public Commande(){

    }

    public Commande(

    String datecommand,

    Client idclient,
    String etatcommand,

    String docImatriculation,
    String docCertificat,
    String bonCommand
    ){
        this.datecommand=datecommand;
        this.idclient=idclient;
        this.etatcommand=etatcommand;
        this.docImatriculation=docImatriculation;
        this.docCertificat=docCertificat;
        this.bonCommand=bonCommand;
    }
}
