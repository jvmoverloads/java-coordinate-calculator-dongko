package com.dongko.coordiate.domain.exception;

public class IllegalPointException extends CoordinateCalculatorDomainException{

    public IllegalPointException() {
        super("좌표는 0 - 24 사이의 값만 가능합니다.");
    }
}
