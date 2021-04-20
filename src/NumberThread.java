import java.util.concurrent.TimeUnit;

public class NumberThread extends Thread {

    private final int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        printNumber();
    }

    private void printNumber() {

        for (int i = 0; i < 5; i++){
            System.out.println(this.number);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
