package com.sqli.test.elevators.elevatorFactory;

import com.sqli.test.elevators.Elevator;

public class ConcreteElevatorCreator extends ElevatorCreator {

    private static ConcreteElevatorCreator instance;

    // private constructor
    private ConcreteElevatorCreator() {
    }

    public static ConcreteElevatorCreator getInstance() {
        if (instance == null) {
            instance = new ConcreteElevatorCreator();
        }
        return instance;
    }

    @Override
    public Elevator createElevator(String ids, int numberOfFloors) {
        String[] composition = ids.split(":");
        String id = composition[0];
        int currentFloor = Integer.parseInt(composition[1]);
        return new Elevator(numberOfFloors , id , currentFloor);
    }
}
