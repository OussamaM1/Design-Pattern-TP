package com.sqli.test.elevators.elevatorFactory;

import com.sqli.test.elevators.Elevator;

public abstract class ElevatorCreator {

    //the factory method
    public abstract Elevator createElevator(String ids , int numberOfFloors);
}
