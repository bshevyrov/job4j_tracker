package ru.job4j.poly;

public class GuineaPig implements Animal {
    public void runInWheel() {
        System.out.println(getClass().getSimpleName() + "любит побегать в колесе.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");

    }
}
