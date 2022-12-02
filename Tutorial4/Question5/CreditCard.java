package Tutorial4.Question5;

public class CreditCard extends Card{

    private int pin;
    private int number;

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        this.pin = pin;
        number = num;
    }



    @Override
    public boolean isExpired() {
       return false;
    }
}
