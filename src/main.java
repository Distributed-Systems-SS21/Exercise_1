import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class main {

    public static void exercise1(long number) {
        System.out.println(Factorial.calculateFactorial(number));
    }

    public static void exercise2() {
        ArrayList<Publication> differentPublications = new ArrayList<Publication>();

        differentPublications.add(new Publication("New York Times", "English", 4.95));
        differentPublications.add(new Publication("Focus", "German", 9.55));
        differentPublications.add(new Book("Bestselling Book", "English", 14.65, "Bestselling Author", "978-3-86680-192-9"));

        for (Publication i : differentPublications) System.out.println(i);
    }

    public static void exercise3() {
        HashSet<String> userInputs= new HashSet<String>();

        String tempUserInput = "User Input";

        System.out.println("\nEnter as many Strings as you like.\nEnter \"out\" to cancel.\n");

        while (!tempUserInput.equals("out")){
            Scanner sc = new Scanner(System.in);
            tempUserInput = sc.nextLine();
            if (!tempUserInput.equals("out")) userInputs.add(tempUserInput);
        }

        System.out.println("Here are all entries of the HashSet:\n");

        Iterator<String> iterator = userInputs.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    public static void exercise4() {
        NumberThread numberThread = new NumberThread(3);
        numberThread.start();

        UserInputThread userInputThread = new UserInputThread();
        userInputThread.start();
    }


    public static void main(String[] args) {

        exercise1(5);
        exercise2();
        exercise3();
        exercise4();

    }
}
