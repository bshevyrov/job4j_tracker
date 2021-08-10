package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("*ЗВУК ГУДЯЩЕЙ ТУРБИНЫ*");
    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " выглядит как ночной мотылек");
    }
}
