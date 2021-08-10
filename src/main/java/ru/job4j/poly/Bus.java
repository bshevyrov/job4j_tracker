package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
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

    @Override
    public void move() {
        System.out.println("Рммм-рм-рм БИ-БИП");
    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " выглядит как жук с панцирем.");
    }
}
