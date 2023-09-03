
import pattern.withoutstrategy.Vehicle1;
import pattern.withstrategy.OffRoadVehicle;
import pattern.withstrategy.PassengerVehicle;
import pattern.withstrategy.SportsVehicle;
import pattern.withstrategy.Vehicle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Without Strategy
//        Vehicle1 vehicle1=new PassengerVehicle();
//        vehicle1.drive();
//
//        Vehicle1 vehicle2=new SportsVehicle();
//        vehicle2.drive();
//
//        Vehicle1 vehicle3=new OffRoadVehicle();
//        vehicle3.drive();

        // With Strategy--
        /*
        * If the child class uses parent's functionality but in their own way and 2 child created their own way but similar
        * then there is issue of code duplicacy.
        *
        * */
        Vehicle vehicle1=new PassengerVehicle();
        vehicle1.drive();;

        Vehicle vehicle2=new SportsVehicle();
        vehicle2.drive();

        Vehicle vehicle3=new OffRoadVehicle();
        vehicle3.drive();
    }
}