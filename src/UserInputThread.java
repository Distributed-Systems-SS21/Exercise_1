import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserInputThread extends Thread {

    private Scanner scanner;
    private int counter = 0;

    @Override
    public void run() {
        super.run();
        waitForUserInput();
    }

    private void waitForUserInput() {
        System.out.println("\nEnter anything in order to get a new NumberThread started.\n");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            if (sc.nextLine() != null) {
                startNewNumberThread(counter);
                counter++;
            }
        }
    }

    private void startNewNumberThread(int counter) {
        Thread numberThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println(counter);

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        numberThread.start();
    }

}
