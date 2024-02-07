package com.backend.car_app.models;

import jakarta.persistence.Entity;

@Entity
public class CommandePayeeAuComptant extends Commande{
    public  CommandePayeeAuComptant (

            String datecommand,

            Client idclient,
            String etatcommand,

            String docImatriculation,
            String docCertificat,
            String bonCommand,
            String typeCommande
    ){
        //super(datecommand,idclient,etatcommand,docImatriculation,docCertificat,bonCommand);
        this.setDatecommand(datecommand);
        this.setIdclient(idclient);
        this.setEtatcommand(etatcommand);
        this.setDocImatriculation(docImatriculation);
        this.setDocCertificat(docCertificat);
        this.setBonCommand(bonCommand);
        this.setTypeCommande(typeCommande);
    }

    public CommandePayeeAuComptant(){

    }
}
