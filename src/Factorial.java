public class Factorial {

    /** Works from 1 - 20 */
    public static long calculateFactorial(long value) {
        if (value == 0) return 1;
        return value * calculateFactorial(value-1);
    }
}
