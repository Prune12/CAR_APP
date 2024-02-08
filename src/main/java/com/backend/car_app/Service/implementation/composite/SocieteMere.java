package com.backend.car_app.Service.implementation.composite;

import java.util.List;

import com.backend.car_app.Service.implementation.template_method.Commande;
import com.backend.car_app.models.Car;

import lombok.Data;

@Data
public class SocieteMere implements Societe {

    private String name;
    private List<Societe> filiales;
    private List<Commande> commandes;

    public SocieteMere(String name, List<Societe> filiales, List<Commande> commandes) {
        this.name = name;
        this.filiales = filiales;
        this.commandes = commandes;
    }

    @Override
    public Commande ajouterCommande(Commande commande) {
        commandes.add(commande);
        return commande;
    }

    public Societe ajouterFiliale(Societe societe){
        filiales.add(societe);
        return societe;
    }

    public String toString(){
        return "SocieteMere(name="+this.name+")";
    }


}