package Tutorial1.Question6;

import java.util.Random;

public class Question6 {
    public static void main(String[] args) {
        int numbs[] = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            numbs[i] = random.nextInt(1, 50);
        }
        for (int n : numbs) {
            System.out.print(n+", ");
        }
    }
}
