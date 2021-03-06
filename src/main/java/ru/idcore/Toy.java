package ru.idcore;

public class Toy extends Thread {
    private UseLessBox box;

    public Toy(UseLessBox box) {
        this.box = box;
        this.setName("Игрушка");
    }

    @Override
    public void run() {
        while (true) {
            if (interrupted()) {
                return;
            }
            while (box.isFlag()) {
                try {
                    Thread.sleep(box.getTimer());
                } catch (InterruptedException e) {
                    interrupt();
                }
                box.setSwitcherOff();
                box.printSwitcherStatus();
                box.setFlag(false);
            }
        }
    }
}
