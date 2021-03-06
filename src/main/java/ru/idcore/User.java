package ru.idcore;

public class User extends Thread {
    private UseLessBox box;
    private int count;
    private int timer;

    public User(UseLessBox box, int count, int timer) {
        this.box = box;
        this.count = count;
        this.timer = timer;
        this.setName("Пользователь");
    }

    @Override
    public void run() {
        int countOn = 0;
        while (countOn < count) {
            while (!box.isFlag()) {
                try {
                    Thread.sleep(timer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                box.setSwitcherOn();
                box.printSwitcherStatus();
                box.setFlag(true);
                countOn++;
            }
        }
        //box.getToy().interrupt();
    }
}
