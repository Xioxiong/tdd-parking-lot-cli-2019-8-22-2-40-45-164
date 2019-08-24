package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
    	ParkingTicket pTicket = parkingLot.parkCar(car);
    	if(pTicket != null) {
    		this.lastErrorMessage = null;
    	}
       return pTicket;
    }

    public Car fetch(ParkingTicket ticket) {
    	Car car = parkingLot.pickCar(ticket);
    	if(car == null) {
    		this.lastErrorMessage = "Unrecognized parking ticket.";
    	}
       return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
