package command;

import receiver.Receiver;

public class TurnOff implements Command{

    private Receiver receiver;

    public TurnOff(Receiver receiver){
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
