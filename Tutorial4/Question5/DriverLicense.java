package Tutorial4.Question5;

public class DriverLicense extends Card{

    private int expirationYear;

    public DriverLicense(String n, int expirationYear)
    {
        super(n);
        this.expirationYear = expirationYear;

    }


    @Override
    public boolean isExpired() {
        return false;
    }
}
