package ru.job4j.tracker;

import ru.job4j.pojo.Product;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithOutNull = new Item[this.size];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                itemsWithOutNull[size++] = item;
            }
        }
        return itemsWithOutNull;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int size = 0;
        for (Item item : items) {
            if (item != null && key.equals(item.getName())) {
                rsl[size++] = item;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}