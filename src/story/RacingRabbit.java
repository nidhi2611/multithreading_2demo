package story;

public class RacingRabbit extends Thread {
    public RacingRabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.print(getName() + " has started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + " has reached the oak tree and falls asleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + " has reached the hills");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.print("interrupt!!!");
        }
        System.out.print(getName() + " finished the race.....");
    }
}
