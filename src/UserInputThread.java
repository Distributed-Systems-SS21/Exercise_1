import java.util.Scanner;

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
                NumberThread numberThread = new NumberThread(counter);
                numberThread.start();
                counter++;
            }
        }
    }
}
