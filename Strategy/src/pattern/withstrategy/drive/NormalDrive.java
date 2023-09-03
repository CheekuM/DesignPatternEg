package pattern.withstrategy.drive;

public class NormalDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("It is normal drive");
    }
}
