package Tutorial2.Question4;

public class VendingMachine {
    private int noOfCans;
    private int noOfTokens;


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

