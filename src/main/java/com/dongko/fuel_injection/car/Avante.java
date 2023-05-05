package com.dongko.fuel_injection.car;

public class Avante extends Car{

    public Avante(int distanceToTravel) {
        super(distanceToTravel);
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return super.distanceToTravel;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
