package com.sqli.test.elevators.state;

import com.sqli.test.elevators.Elevator;

public abstract class ElevatorState {

    protected Elevator elevator;

    protected ElevatorState(Elevator elevator) {
        this.elevator = elevator;
    }

    public abstract void up() throws IllegalArgumentException;

    public abstract void down() throws IllegalArgumentException;

    public abstract void stop() throws IllegalArgumentException;

    public abstract void rest() throws IllegalArgumentException;

    public abstract int distanceFromFloor(int idFloor);

    public void move(Elevator elevator, String action){

        switch (action){
            case "UP" : elevator.getElevatorState().up(); break;
            case "DOWN" : elevator.getElevatorState().down(); break;
            default : throw new IllegalStateException("elevator can only go up or down");
        }
    }
}
