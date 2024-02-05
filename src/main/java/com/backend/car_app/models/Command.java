package com.backend.car_app.models;

import jakarta.persistence.*;

@Entity
public class Command {
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
}
