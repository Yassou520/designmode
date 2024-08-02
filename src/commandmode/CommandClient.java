package commandmode;

public class CommandClient {
    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(receiver);
        Command lightOffCommand = new LightOffCommand(receiver);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.executeOnCommand(0);
        remoteController.executeOffCommand(0);
        remoteController.undo();
    }
}
