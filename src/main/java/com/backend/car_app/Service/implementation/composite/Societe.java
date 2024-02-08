package com.backend.car_app.Service.implementation.composite;

import com.backend.car_app.Service.implementation.template_method.Commande;
import com.backend.car_app.models.Car;

public interface Societe {
    public Commande ajouterCommande(Commande commande);
}
