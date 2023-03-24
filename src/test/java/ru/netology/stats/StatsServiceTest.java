package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void CalcSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summAllSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CalcAverageSalesInPeriod() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int period = 12;
        int expected = 15;
        int actual = service.averageSalesInPeriod(sales, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void guantityMonthWhenSalesOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int period = 12;
        int expected = 5;
        int actual = service.numMonthOverAverage(sales, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void guantityMonthWhenSalesUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int period = 12;
        int expected = 5;
        int actual = service.numMonthUnderAverage(sales, period);
        Assertions.assertEquals(expected, actual);
    }
}
