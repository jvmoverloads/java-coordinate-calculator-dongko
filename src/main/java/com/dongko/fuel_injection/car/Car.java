package com.dongko.fuel_injection.car;

public abstract class Car {
    protected final int distanceToTravel;

    protected Car(int distanceToTravel) {
        this.distanceToTravel = distanceToTravel;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    public abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
