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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return item.equals(items[index]);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int src = indexOf(id) + 1;
        int dist = indexOf(id);
        int length = size - dist - 1;
        System.arraycopy(items, src, items, dist, length);
        items[size - 1] = null;
        size--;
        return true;
    }
}