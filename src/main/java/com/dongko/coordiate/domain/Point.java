package com.dongko.coordiate.domain;

import com.dongko.coordiate.domain.exception.IllegalPointException;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
