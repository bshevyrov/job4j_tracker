package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean humanDoctor;

    public Doctor(String name, String surname, String education, String birthday, boolean humanDoctor) {
        super(name, surname, education, birthday);
        this.humanDoctor = humanDoctor;
    }

    public boolean isHumanDoctor() {
        return humanDoctor;
    }

    public void setHumanDoctor(boolean humanDoctor) {
        this.humanDoctor = humanDoctor;
    }

    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }
}
