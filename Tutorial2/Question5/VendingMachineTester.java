package Tutorial2.Question5;

import Tutorial2.Question4.VendingMachine;

public class VendingMachineTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // fill up with ten cans
        try {
            machine.insertToken();
        } catch (Exception e) {
            machine.returnToken();
        }
        System.out.print("Token count = ");
        System.out.println(machine.getNoOfTokens());
        System.out.print("Can count = ");
        System.out.println(machine.getNoOfCans());
    }
}
