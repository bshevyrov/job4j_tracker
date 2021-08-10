package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Чух-чух-чух ТУ-ТУУУУ");
    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " выглядит как стальной змей.");
    }
}
