package Tutorial2.Question6;

import java.util.Arrays;
import java.util.Random;

public class Question6 {
    public static void main(String[] args) {
        boolean days[] = new boolean[365];
        Random random = new Random();
        int numberOfPeople = 0;
        int numberOfPeopleTotal = 0;

        for (int j = 0; j < 1000000; j++) {
            for (int i = 0; i < 365; i++) {
                numberOfPeople++;
                int n1 = random.nextInt(365);
                if (days[n1]) {
                    break;
                } else {
                    days[n1] = true;
                }

            }
            numberOfPeopleTotal += numberOfPeople;
            numberOfPeople = 0;
            Arrays.fill(days, false);
        }
        System.out.println(numberOfPeopleTotal / 1000000);
    }

}
