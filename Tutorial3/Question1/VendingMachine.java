package Tutorial3.Question1;

public class VendingMachine {
    private int noOfCans;
    private int noOfTokens;

    public VendingMachine() {
        this.noOfCans = 10;
        this.noOfTokens = 0;
    }

    public VendingMachine(int cans) {
        this.noOfCans = cans;
        this.noOfTokens = 0;
    }

    public void fillUp(int cans) {
        this.noOfCans += cans;
    }

    public void insertToken() throws Exception {
        if (this.noOfCans > 0) {
            this.noOfCans--;
            this.noOfTokens++;
            return;
        }
        throw new Exception("Not enough cans");
    }

    public void returnToken() {
        this.noOfTokens--;
    }

    public int getNoOfCans() {
        return this.noOfCans;
    }

    public int getNoOfTokens() {
        return this.noOfTokens;
    }

}


