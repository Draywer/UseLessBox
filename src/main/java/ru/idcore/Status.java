package ru.idcore;

public enum Status {
    ON("Вкл."),
    OFF("Выкл.");

    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title;
    }
}
