package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product pr : products) {
            System.out.println(pr.getName());
        }
        products[1] = products[2];
        products[2] = null;
        for (Product pr : products) {
            if (pr != null) {
                System.out.println(pr.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}