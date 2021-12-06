package receiver;

public class TV implements Receiver {

    @Override
    public String turnOn() {
        return "TV ON";
    }

    @Override
    public String turnOff() {
        return "TV OFF";
    }
}
