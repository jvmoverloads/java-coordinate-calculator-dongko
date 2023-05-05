package com.dongko.coordiate.domain;

import com.dongko.coordiate.domain.exception.IllegalPointsException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PointsTest {

    @ParameterizedTest
    @CsvSource({"ashjkd", "(10,10,123)-(14,15)", "(10,10)-(14,151,123)", "12379612679"})
    @DisplayName("(x1,y1)-(x2,y2) 형식의 입력 값만 받을 수 있다.")
    void test(String pointsString) {
        assertThrows(IllegalPointsException.class, () ->
           new Points(pointsString)
        );
    }

    @Test
    void 객체비교테스트() {
        assertEquals(new Points("(10,10)-(14,15)"), new Points("(10,10)-(14,15)"));
    }

    @Test
    void 객체비교테스트2() {
        assertNotEquals(new Points("(10,10)-(14,15)"), new Points("(10,9)-(14,15)"));
    }
}