package com.backend.car_app.Service.implementation.iterator;

import com.backend.car_app.models.Car;

public interface Iterator {
    public Car getNext();
    public boolean hasNext();
}
