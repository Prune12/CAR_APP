package com.backend.car_app.Service.implementation.composite;

import java.util.List;

import com.backend.car_app.Service.implementation.template_method.Commande;
import com.backend.car_app.models.Car;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocieteSimple implements Societe {
    private String name;

    private List<Commande> commandes;

    public SocieteSimple(String name, List<Commande> commandes) {
        this.name = name;
        this.commandes = commandes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public String toString(){
        return "Sociter(name="+name+")";
    }

    @Override
    public Commande ajouterCommande(Commande commande) {
        commandes.add(commande);
        return commande;
    }
}
