package com.dongko.fuel_injection;

import com.dongko.fuel_injection.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public static Cars create() {
        return new Cars();
    }

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        cars.forEach(
            car ->
                sb
                    .append(car.getName())
                    .append(" : ")
                    .append((int)car.getChargeQuantity())
                    .append("리터")
                    .append(System.getProperty("line.separator"))

        );
        return sb.toString();
    }
}
