package ru.job4j.poly;

public class Cow implements Animal {
    public void giveMilk() {
        System.out.println(getClass().getSimpleName() + " дает человеку иолоко.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
