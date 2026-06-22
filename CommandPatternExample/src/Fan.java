public class Fan {

    private final String location;

    public Fan(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println(location + " fan is ON");
    }

    public void turnOff() {
        System.out.println(location + " fan is OFF");
    }
}
