package ru.idcore;

public class UseLessBox extends Thread {
    private Switcher switcher;
    private volatile boolean flag;
    private Toy toy;
    private int timer;

    public UseLessBox(int timer) {
        switcher = new Switcher(this);
        toy = new Toy(this);
        flag = false;
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Switcher getSwitcher() {
        return switcher;
    }

    public Toy getToy() {
        return toy;
    }

    public void setSwitcherOn() {
        flag = true;
        switcher.setStatus(Status.ON);
        //printSwitcherStatus();
    }

    public void setSwitcherOff() {
        flag = false;
        switcher.setStatus(Status.OFF);
        //printSwitcherStatus();
    }

    public void printSwitcherStatus() {
        System.out.println(Thread.currentThread().getName() + ": " + switcher);
    }

    @Override
    public void run() {
        toy.start();
    }
}
