package ru.netology.stats;

public class StatsService {
    public int summAllSales(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    public int averageSalesInPeriod(int[] sales, int period) {
        int sum = summAllSales(sales);
        int averageSales = sum / period;
        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int count = 0; count < sales.length; count++) {
            if (sales[count] >= sales[maxMonth]) {
                maxMonth = count;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int count = 0; count < sales.length; count++) {
            if (sales[count] <= sales[minMonth]) {
                minMonth = count;
            }
        }
        return minMonth + 1;
    }

    public int numMonthOverAverage(int[] sales, int period) {
        int averageSales = averageSalesInPeriod(sales, period);
        int count = 0; // счетчик
        for (int newSales : sales) {
            if (newSales < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int numMonthUnderAverage(int[] sales, int period) {
        int averageSales = averageSalesInPeriod(sales, period);
        int count = 0; // счетчик
        for (int newSales : sales) {
            if (newSales > averageSales) {
                count++;
            }
        }
        return count;
    }
}


