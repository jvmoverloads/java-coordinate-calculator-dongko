package com.dongko.coordiate.domain.exception;

public class IllegalPointsException extends CoordinateCalculatorDomainException{
    public IllegalPointsException() {
        super("잘못된 좌표 값 입니다.");
    }
}
