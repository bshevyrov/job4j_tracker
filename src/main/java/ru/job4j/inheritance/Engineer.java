package ru.job4j.inheritance;

public class Engineer extends Profession{
private int rank;

    public Engineer(String name, String surname, String education, String birthday, int rank) {
        super(name, surname, education, birthday);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Outlay calculateTheEstimate(Task task) {
        return new Outlay();
    }
}
