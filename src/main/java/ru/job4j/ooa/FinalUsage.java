package ru.job4j.ooa;

public class FinalUsage {
    private static final String SURNAME = "Shevyrov";
    private static final String DEFAULT_NAME = "User";

    public static void main(String[] args) {
        final String NAME = "Bohdan";

        System.out.println(NAME);
        System.out.println(SURNAME);
        System.out.println(DEFAULT_NAME);
    }
}
