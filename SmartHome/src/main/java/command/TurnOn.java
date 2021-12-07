package command;

import devices.Device;

public class TurnOn implements Command {

    private Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOn();
    }

    @Override
    public String undo() {
        return device.turnOff();
    }
}
