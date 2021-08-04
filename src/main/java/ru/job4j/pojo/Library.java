package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book mobyDick = new Book("Moby Dick", 250);
        Book idealMacarons = new Book("Ideal macarons", 120);
        Book cleanCode = new Book("Clean Code", 450);
        Book piterPen = new Book("Piter Pen", 180);
        Book[] books = new Book[4];
        books[0] = mobyDick;
        books[1] = idealMacarons;
        books[2] = cleanCode;
        books[3] = piterPen;
        System.out.println("All books in library.");
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Switching first  and last book.");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Show only Clean Code.");
        for (Book bk : books) {
            if ("Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
