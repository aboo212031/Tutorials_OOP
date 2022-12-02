package Tutorial2.Question3;

import java.awt.*;

public class Question3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        System.out.println(r1);

//        Rectangle r2 = new Rectangle(0, 0, 100, 50);
//        r2.grow(10, 20);
//        Rectangle r2 = new Rectangle(r1);
//        r2.grow(10, 20);

//        Rectangle r2 = r1;
//        r2.grow(10,20);
//
//        System.out.println(r1.getHeight() + " " +r1.getWidth());
//        System.out.println(r2.getHeight() + " " +r2.getWidth());


        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);



    }
}
