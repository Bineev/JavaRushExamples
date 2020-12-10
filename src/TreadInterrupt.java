import java.util.*;

public class TreadInterrupt extends Thread {
    public void run() {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Now thread is interrupted!");
                break;
            }
            System.out.println("Pew!");
        }
    }

    public static void main(String[] args) {
        TreadInterrupt thread = new TreadInterrupt();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
