package com.gojek.parkinglot.Service;

import com.gojek.parkinglot.Exception.ParkingException;
import com.gojek.parkinglot.model.Vehicle;

import java.util.Optional;

public interface ServiceEngine {

    void createParkingLot(int level, int capacity) throws ParkingException;

    Optional<Integer> park(int level, Vehicle vehicle) throws ParkingException;

    void unPark(int level, int slotNumber) throws ParkingException;

    void getStatus(int level) throws ParkingException;

    Optional<Integer> getAvailableSlotsCount(int level) throws ParkingException;

    void getRegNumberForColor(int level, String color) throws ParkingException;

    void getSlotNumbersFromColor(int level, String colour) throws ParkingException;

    int getSlotNoFromRegistrationNo(int level, String registrationNo) throws ParkingException;

    void doCleanup();

}
