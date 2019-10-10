package story;

public class RacingTortoise extends Thread {
    RacingTortoise(String name) {
        super(name);
    }

    public void run() {
        System.out.print(getName() + " has started the race");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + "has reached the oak tree");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + "has reached the hills");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + " has finished the race........");
    }
}
