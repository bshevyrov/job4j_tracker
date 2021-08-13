package ru.job4j.ex;

public class Fact {
    public int calc(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("N should be greater than 0");
        }
        int rsl = 1;
        for (int i = 0; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}
