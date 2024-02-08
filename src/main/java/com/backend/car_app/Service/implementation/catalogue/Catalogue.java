package com.backend.car_app.Service.implementation.catalogue;


import java.util.List;

import com.backend.car_app.Service.implementation.iterator.Iterator;
import com.backend.car_app.Service.implementation.iterator.VehicleIterator;
import com.backend.car_app.models.Car;

public class Catalogue {
    private List<Car> vehicles;

    public Catalogue(List<Car> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Car vehicle) {
        vehicles.add(vehicle);
    }

    public Iterator createIterator() {
        return new VehicleIterator(vehicles);
    }

}
