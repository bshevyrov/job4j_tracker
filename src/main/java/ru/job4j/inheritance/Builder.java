package ru.job4j.inheritance;

public class Builder extends Engineer {
  private String allowance;

    public Builder(String name, String surname, String education, String birthday, int rank, String allowance) {
        super(name, surname, education, birthday, rank);
        this.allowance = allowance;
    }

    public Builder(String name, String surname, String education, String birthday, int rank) {
        super(name, surname, education, birthday, rank);
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    public Building build (Blueprint blueprint) {
        return new Building();
    }
}
