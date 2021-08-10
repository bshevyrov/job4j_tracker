package ru.job4j.poly;

public class Goose implements Animal {
    public void bringFeather() {
        System.out.println(getClass().getSimpleName() + " приносит перо для подушек.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Га-га.");
    }
}
