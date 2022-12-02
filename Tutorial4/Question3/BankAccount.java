package Tutorial4.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankAccount implements Comparator<BankAccount> {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

//    @Override
//    public int compareTo(BankAccount o) {
//        if (this.balance > o.balance) {
//            return 1;
//        } else if (this.balance < o.balance) {
//            return -1;
//        }
//        return 0;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
//        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
//        BankAccount ba1 = new BankAccount(10);
//        BankAccount ba2 = new BankAccount(20);
//        BankAccount ba3 = new BankAccount(300);
//        BankAccount ba4 = new BankAccount(400);
//        BankAccount ba5 = new BankAccount(50);
//        list.add(ba1);
//        list.add(ba2);
//        list.add(ba3);
//        list.add(ba4);
//        list.add(ba5);
//        Collections.sort(list);
//        for (BankAccount b : list)
//            System.out.println(b.getBalance());

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        BankAccount ba1 = new BankAccount(10);
        BankAccount ba2 = new BankAccount(20);
        BankAccount ba3 = new BankAccount(300);
        BankAccount ba4 = new BankAccount(400);
        BankAccount ba5 = new BankAccount(50);
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        list.add(ba4);
        list.add(ba5);
        Collections.sort(list,ba1);
        for (BankAccount b : list)
            System.out.println(b.getBalance());


    }

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.balance > o2.balance) {
            return 1;
        } else if (o1.balance < o2.balance) {
            return -1;
        }
        return 0;
    }
}
