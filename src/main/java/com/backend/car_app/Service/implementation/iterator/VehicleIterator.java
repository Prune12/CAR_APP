package com.backend.car_app.Service.implementation.iterator;

import java.util.List;

import com.backend.car_app.models.Car;

public class VehicleIterator implements Iterator{

    private List<Car> cars; 
    private int currentPosition = 0;


    public VehicleIterator(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public Car getNext() {
        if(!hasNext()){
            return null;
        }

        Car car = cars.get(currentPosition);
        currentPosition++;
        return car;

    }

    @Override
    public boolean hasNext() {
        return currentPosition < cars.size();
    }
    
}
