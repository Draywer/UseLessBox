package ru.idcore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int userTimer = 2_000;
        int toyTimer = 2_000;
        int countOnOff = 5;
        UseLessBox box = new UseLessBox(toyTimer);
        User user = new User(box, countOnOff, userTimer);

        box.start();
        user.start();
        user.join();
        box.getToy().interrupt();
    }
}
