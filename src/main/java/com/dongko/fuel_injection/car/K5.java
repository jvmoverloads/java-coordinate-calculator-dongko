package com.dongko.fuel_injection.car;

public class K5 extends Car{
    public K5(int distanceToTravel) {
        super(distanceToTravel);
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return super.distanceToTravel;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
