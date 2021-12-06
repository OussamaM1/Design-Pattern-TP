package receiver;

public class Radio implements Receiver {

    @Override
    public String turnOn() {
        return "Radio ON";
    }

    @Override
    public String turnOff() {
        return "Radio OFF";
    }
}
