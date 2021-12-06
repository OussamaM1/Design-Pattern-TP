package command;

import receiver.Receiver;

public class TurnOn implements Command {

    private Receiver receiver;

    public TurnOn(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.turnOn();
    }

    @Override
    public String undo() {
        return receiver.turnOff();
    }
}
