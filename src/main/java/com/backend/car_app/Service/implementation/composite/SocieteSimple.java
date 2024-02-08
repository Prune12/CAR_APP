package com.backend.car_app.Service.implementation.composite;

import java.util.List;

import com.backend.car_app.models.Car;

public class SocieteSimple implements Societe {
    private String name;

    private List<Car> vehicules;

    public String toString(){
        return "Sociter(name="+name+")";
    }

    @Override
    public Car ajouterVehicule(Car vehicule) {
        vehicules.add(vehicule);
        return vehicule;
    }
}
