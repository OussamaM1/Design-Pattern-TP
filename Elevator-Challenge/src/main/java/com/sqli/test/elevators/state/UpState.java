package com.sqli.test.elevators.state;

import com.sqli.test.elevators.Elevator;

public class UpState extends ElevatorState {

    public UpState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        throw new IllegalArgumentException("An elevator can not switch his direction in the middle of a building.");
    }

    @Override
    public void down() {
        throw new IllegalArgumentException("An elevator can not switch his direction in the middle of a building.");
    }

    @Override
    public void stop() {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public void rest() {
        elevator.setElevatorState(new RestState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        if (floor >= elevator.getCurrentFloor())
            return floor - elevator.getCurrentFloor();
        else
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
    }
}
