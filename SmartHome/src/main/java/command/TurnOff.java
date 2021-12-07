package command;

import devices.Device;

public class TurnOff implements Command {

    private Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOff();
    }

    @Override
    public String undo() {
        return device.turnOn();
    }
}
