import java.util.concurrent.TimeUnit;

public class NumberThread extends Thread {

    private int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        printNumber(5);
    }

    private void printNumber(int howManyTimes) {

        for (int i = 0; i < howManyTimes; i++){
            System.out.println(this.number);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
