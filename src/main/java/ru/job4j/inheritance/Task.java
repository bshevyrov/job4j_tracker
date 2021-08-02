package ru.job4j.inheritance;

public class Task {
    private String target;

    public Task(String target) {
        this.target = target;
    }

    public Task() {
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
