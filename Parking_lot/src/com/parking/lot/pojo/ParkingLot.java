package com.parking.lot.pojo;


import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String id;

    int numberOfFloor;
    int numberOfSlotPerFloor;
    public ParkingLot(String id, int numberOfFloor, int numberOfSlotPerFloor){
        this.id=id;
        this.numberOfFloor=numberOfFloor;
        this.numberOfSlotPerFloor=numberOfSlotPerFloor;
        this.initialize();
    }
    List<Floor> floor;
    private void initialize(){
        floor=new ArrayList<>();
        for(int i=0;i<numberOfFloor;i++){
            floor.add(new Floor(i,numberOfSlotPerFloor));
        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Floor> getFloor() {
        return floor;
    }

    public void setFloor(List<Floor> floor) {
        this.floor = floor;
    }
}
