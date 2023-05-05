package com.dongko.coordiate.domain;

import com.dongko.coordiate.domain.Point;
import com.dongko.coordiate.domain.exception.IllegalPointException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @ParameterizedTest
    @CsvSource({"25,2", "-1,24", "100,1000", "-100,-10", "24,-2"})
    @DisplayName("좌표값은 음수나 24초과 할 수 없다.")
    void test(String xString, String yString) {
        int x = Integer.parseInt(xString);
        int y = Integer.parseInt(yString);
        assertThrows(IllegalPointException.class, () ->
            new Point(x, y)
        );
    }

    @Test
    void 객체비교테스트() {
        assertEquals(new Point(1,2), new Point(1,2));
    }
}