package com.sqli.test.elevators.state;

import com.sqli.test.elevators.Elevator;

public class RestState extends ElevatorState {

    public RestState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        elevator.setElevatorState(new UpState(elevator));
    }

    @Override
    public void down() {
        elevator.setElevatorState(new DownState(elevator));
    }

    @Override
    public void stop() {
        elevator.setElevatorState(new StopState(elevator));
    }

    @Override
    public void rest() {
        throw new IllegalArgumentException("An elevator can not switch his direction in the middle of a building.");

    }

    @Override
    public int distanceFromFloor(int floor) {
        return Math.abs(floor - elevator.getCurrentFloor());
    }
}
