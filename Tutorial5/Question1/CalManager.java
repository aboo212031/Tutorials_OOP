package Tutorial5.Question1;

public class CalManager {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int cube(int n) {
        return n ^ 3;
    }

    public static double add(double... n) {
        int sum = 0;
        for (double i : n) {
            sum += i;
        }
        return sum;
    }
}
