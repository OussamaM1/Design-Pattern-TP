package receiver;

public class Light implements Receiver {

    @Override
    public String turnOn() {
        return "Light ON";
    }

    @Override
    public String turnOff() {
        return "Light OFF";
    }
}
