package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane2 = new Airplane();
        Vehicle bus2 = new Bus();
        Vehicle train2 = new Train();
        Animal[] animals = new Animal[]{cow, goose, dog, guineaPig};
        for (Animal a : animals) {
            a.sound();
        }
        System.out.println();
        Vehicle[] vehicles = new Vehicle[]{airplane, bus, bus2, train, airplane2, train2};
        for (Vehicle vehicle : vehicles) {
            vehicle.description();
            vehicle.move();
        }

    }
}
