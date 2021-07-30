package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        Error second = new Error(true, 404, "Not found");
        Error third = new Error(true, 403, "Forbidden");
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
