package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experience;

    public Surgeon(String name, String surname, String education, String birthday, boolean humanDoctor, int experience) {
        super(name, surname, education, birthday, humanDoctor);
        this.experience = experience;
    }

    public Surgeon(String name, String surname, String education, String birthday, boolean humanDoctor) {
        super(name, surname, education, birthday, humanDoctor);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Case operate(Patient patient) {
        return new Case();
    }
}
