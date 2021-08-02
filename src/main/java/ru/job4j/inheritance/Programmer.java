package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programingLanguage;

    public Programmer(String name, String surname, String education, String birthday, int rank, String programingLanguage) {
        super(name, surname, education, birthday, rank);
        this.programingLanguage = programingLanguage;
    }

    public Programmer(String name, String surname, String education, String birthday, int rank) {
        super(name, surname, education, birthday, rank);
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    public Application createApp(Blueprint blueprint) {
        return new Application();
    }
}
