package devices;

public class Camera implements Device {

    @Override
    public String turnOn() {
        return "Camera On";
    }

    @Override
    public String turnOff() {
        return "Camera Off";
    }
}
