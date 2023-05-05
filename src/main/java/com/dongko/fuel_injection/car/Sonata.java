package com.dongko.fuel_injection.car;

public class Sonata extends Car{
    public Sonata(int distanceToTravel) {
        super(distanceToTravel);
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return super.distanceToTravel;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
