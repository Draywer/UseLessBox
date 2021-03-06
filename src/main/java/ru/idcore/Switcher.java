package ru.idcore;

import org.w3c.dom.ls.LSOutput;

public class Switcher {
    private UseLessBox box;
    private volatile Status status;

    public Switcher(UseLessBox box) {
        this.box = box;
        status = Status.OFF;
    }

    public UseLessBox getBox() {
        return box;
    }

    public void setBox(UseLessBox box) {
        this.box = box;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ("Тумблер - " + status);
    }
}
