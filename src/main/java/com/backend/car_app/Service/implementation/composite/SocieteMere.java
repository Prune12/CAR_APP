package com.backend.car_app.Service.implementation.composite;

import java.util.List;

import com.backend.car_app.models.Car;

import lombok.Data;

@Data
public class SocieteMere implements Societe {

    private String name;
    private List<Societe> filiales;
    private List<Car> vehicules;

    public Car ajouterVehicle(Car vehicule){
        return vehicule;
    }

    @Override
    public Car ajouterVehicule(Car vehicule) {
        vehicules.add(vehicule);
        return vehicule;
    }

    public Societe ajouterFiliale(Societe societe){
        filiales.add(societe);
        return societe;
    }

    public String toString(){
        return "SocieteMere(name="+this.name+")";
    }


}