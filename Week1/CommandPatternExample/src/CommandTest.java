public class CommandTest {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Fan bedroomFan = new Fan("Bedroom");

        RemoteControl remote = new RemoteControl();

        remote.pressButton(new LightOnCommand(livingRoomLight));
        remote.pressButton(new FanOnCommand(bedroomFan));
        remote.pressButton(new FanOffCommand(bedroomFan));
        remote.pressButton(new LightOffCommand(livingRoomLight));
    }
}
