package com.sqli.test.elevators;

import com.sqli.test.elevators.elevatorFactory.ConcreteElevatorCreator;
import com.sqli.test.elevators.elevatorFactory.ElevatorCreator;

import java.util.HashMap;
import java.util.Map;

public class Building {

    private int numberOfFloors;
    private HashMap<String, Elevator> elevators = new HashMap<>();

    private ElevatorCreator elevatorCreator = ConcreteElevatorCreator.getInstance();

    public Building(int numberOfFloors, String... buildingElevators) {
        this.numberOfFloors = numberOfFloors;
        for (String identifier : buildingElevators) {
            Elevator elevator = elevatorCreator.createElevator(identifier, numberOfFloors);
            this.elevators.put(elevator.getIdElevator(), elevator);
        }
    }

    public String requestElevator() {
        return requestElevator(this.numberOfFloors);
    }

    public String requestElevator(int requestedFloor) {
        //Let's find the elevator with the minimum distance between him and the top floor
        int min = Integer.MAX_VALUE;
        String ansElevator = "";
        for (Map.Entry<String, Elevator> elevator : elevators.entrySet()) {
            //First of all we have to see what state the elevator is.
            //Logic
            if (elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) != -1
                    && elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor) <= min) {
                min = elevator.getValue().getElevatorState().distanceFromFloor(requestedFloor);
                ansElevator = elevator.getKey();
            }
        }
        return ansElevator;
    }

    public void move(String elevatorId, String action) {
        Elevator elevator = elevators.get(elevatorId);
        elevator.getElevatorState().move(elevator, action);
    }

    public void stopAt(String elevatorId, int floorNumber) {
        Elevator elevator = elevators.get(elevatorId);
        elevator.setCurrentFloor(floorNumber);
        elevator.getElevatorState().stop();
    }

}
