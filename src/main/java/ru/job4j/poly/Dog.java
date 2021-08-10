package ru.job4j.poly;

public class Dog implements Animal {
    public void runAfterCat() {
        System.out.println(getClass().getSimpleName()
                + " не любит кошек, постоянно за ними гоняется.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }
}
