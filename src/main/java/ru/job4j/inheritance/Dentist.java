package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean orthodontist;

    public Dentist(String name, String surname, String education, String birthday, boolean humanDoctor, boolean orthodontist) {
        super(name, surname, education, birthday, humanDoctor);
        this.orthodontist = orthodontist;
    }

    public Dentist(String name, String surname, String education, String birthday, boolean humanDoctor) {
        super(name, surname, education, birthday, humanDoctor);
    }

    public boolean isOrthodontist() {
        return orthodontist;
    }

    public void setOrthodontist(boolean orthodontist) {
        this.orthodontist = orthodontist;
    }

    public Case seal(Patient patient) {
        return new Case();
    }
}


