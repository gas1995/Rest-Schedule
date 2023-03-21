package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void shouldCalculateRestMonths1() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRestMonths2() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}