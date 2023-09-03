package pattern.withstrategy.drive;

public class SpecialDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("It is Special Drive");
    }
}
