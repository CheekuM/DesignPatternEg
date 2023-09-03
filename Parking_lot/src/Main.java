import com.parking.lot.VehicleTYPE;
import com.parking.lot.pojo.ParkingLot;
import com.parking.lot.pojo.Vehicle;
import com.parking.lot.service.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings;
        String s = sc.nextLine();
        ParkingLot parkingLot = null;
        while (!s.equals("exit")) {
            strings = s.split(" ");
            switch (strings[0]) {
                case "create_parking_lot": {
                    parkingLot = new ParkingLotService().createParkingLot(strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
                    System.out.println("Parking Lot Base Ready");
                    break;
                }
                case "park_vehicle": {
                    new ParkVehicleService().parkVehicle(parkingLot, new Vehicle(strings[2], VehicleTYPE.valueOf(strings[1]), strings[3]));
                    break;
                }
                case "unpark_vehicle": {
                    new UnParkVehicleService().unParkVehicle(parkingLot, strings[1]);
                    break;
                }
                case "display": {
                    if (strings[1].equals("free_count")) {
                        if (strings[2].equalsIgnoreCase("CAR")) {
                            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                                System.out.println("No. of free slots for " + VehicleTYPE.CAR + " on Floor " + (i + 1) + ": " + parkingLot.getFloor().get(i).getCarFree().size());
                            }
                        } else if (strings[2].equalsIgnoreCase("BIKE")) {
                            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                                System.out.println("No. of free slots for " + VehicleTYPE.BIKE + " on Floor " + (i + 1) + ": " + parkingLot.getFloor().get(i).getBikeFree().size());
                            }
                        } else if (strings[2].equalsIgnoreCase("TRUCK")) {
                            for (int i = 0; i < parkingLot.getFloor().size(); i++) {
                                System.out.println("No. of free slots for " + VehicleTYPE.TRUCK + " on Floor " + (i + 1) + ": " + parkingLot.getFloor().get(i).getTruckFree().size());
                            }
                        }
                    } else if (strings[1].equals("free_slots")) {
                        if (strings[2].equalsIgnoreCase("CAR")) {
                            new FreeSlotService().getFreeSlot(parkingLot, "CAR");
                        } else if (strings[2].equalsIgnoreCase("TRUCK")) {
                            new FreeSlotService().getFreeSlot(parkingLot, "TRUCK");
                        } else if (strings[2].equalsIgnoreCase("BIKE")) {
                            new FreeSlotService().getFreeSlot(parkingLot, "BIKE");
                        }

                    } else if (strings[1].equals("occupied_slots")) {
                        if (strings[2].equalsIgnoreCase("CAR")) {
                            new OccupiedSlotService().getOccupiedSlot(parkingLot, "CAR");
                        } else if (strings[2].equalsIgnoreCase("TRUCK")) {
                            new OccupiedSlotService().getOccupiedSlot(parkingLot, "TRUCK");
                        } else if (strings[2].equalsIgnoreCase("BIKE")) {
                            new OccupiedSlotService().getOccupiedSlot(parkingLot, "BIKE");
                        }
                    }
                    break;
                }

            }
            s = sc.nextLine();
        }


    }
}