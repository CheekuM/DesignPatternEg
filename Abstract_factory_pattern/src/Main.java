import com.factory.pattern.AbstractCarFactory;
import com.factory.pattern.CarFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory= new AbstractCarFactory();
        abstractCarFactory.getCar("LUX").getCar("lux1").getVehicleInfo();
        abstractCarFactory.getCar("ORD").getCar("ord2").getVehicleInfo();
        abstractCarFactory.getCar("LUX").getCar("lux2").getVehicleInfo();
        abstractCarFactory.getCar("").getCar("ord1").getVehicleInfo();
    }
}