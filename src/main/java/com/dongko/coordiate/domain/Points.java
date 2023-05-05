package com.dongko.coordiate.domain;

import com.dongko.coordiate.domain.exception.IllegalPointsException;

import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Points {
    private static String regex = "\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)";

    private final List<Point> points;
    public Points(String pointsString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pointsString);
        if (!matcher.matches()) {
            throw new IllegalPointsException();
        }
        int x1 = Integer.parseInt(matcher.group(1));
        int y1 = Integer.parseInt(matcher.group(2));
        int x2 = Integer.parseInt(matcher.group(3));
        int y2 = Integer.parseInt(matcher.group(4));

        points = List.of(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
