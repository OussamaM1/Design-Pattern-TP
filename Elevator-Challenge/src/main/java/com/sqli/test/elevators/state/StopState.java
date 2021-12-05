package com.sqli.test.elevators.state;

import com.sqli.test.elevators.Elevator;

public class StopState extends ElevatorState {

    public StopState(Elevator elevator) {
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
        throw new IllegalArgumentException("An elevator can not switch his direction in the middle of a building.");
    }

    @Override
    public void rest() {
        throw new IllegalArgumentException("An elevator can not switch his direction in the middle of a building.");
    }

    @Override
    public int distanceFromFloor(int floor) {
        return -1;
    }
}
