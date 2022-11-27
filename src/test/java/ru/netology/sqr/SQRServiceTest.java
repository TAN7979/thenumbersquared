package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/initial data.csv")
    public void calcTest(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calc(x, y);

        Assertions.assertEquals(expected, actual);
    }

}
