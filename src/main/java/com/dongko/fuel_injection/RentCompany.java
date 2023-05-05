package com.dongko.fuel_injection;

import com.dongko.fuel_injection.car.Car;

public class RentCompany {
    private final Cars cars = Cars.create();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.generateReport();
    }
}
