package com.dongko.coordiate.domain;

import com.dongko.coordiate.domain.exception.IllegalPointException;

public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalPointException();
        }
        if (y < 0 || y > 24) {
            throw new IllegalPointException();
        }
        this.x = x;
        this.y = y;
    }
}
