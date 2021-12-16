package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"lower limit of values, 100, 110, 1",
            "upper limit of values, 9700, 9801, 1",
            "large range of values, 300, 7000, 66",
            "over limit of values, 9802, 9900, 0"
    })

    void shouldCalculateSqr(String name,int start,int end, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(start, end);

        assertEquals(expected, actual);
    }



}