package Tutorial4.Question5;

public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;


    public Passport(String n, int expirationYear, String birthLocation)
    {
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }


    @Override
    public boolean isExpired() {
        return false;
    }
}
