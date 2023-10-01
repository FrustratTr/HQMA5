package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {
    @Test
    public void shouldCalculateVacationMonths() {
        VacationService service = new VacationService();

        assertEquals(3, service.calculate(10000, 3000, 20000));
        assertEquals(2, service.calculate(100000, 60000, 150000));

    }
}
