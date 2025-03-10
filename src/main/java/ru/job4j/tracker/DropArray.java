package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];
        int size = 0;
        for (String name : names) {
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (String s : namesWithoutNull) {
            System.out.println(s);
        }
        String[] nm = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(nm, 2, nm, 1, 3);
        System.out.println(Arrays.toString(nm));
    }
}
