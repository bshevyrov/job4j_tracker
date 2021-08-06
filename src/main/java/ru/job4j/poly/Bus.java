package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Брум-бум-бум-бум-бум");
    }

    @Override
    public void passengers(int num) {
        System.out.println("Всего пасcажиров: " + num);
    }

    @Override
    public double refuel(double volume) {
        return volume * 1.5;
    }
}
