package commandmode;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        undoCommand = new NoCommand();
        for (int i=0;i< 5 ;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index,Command onCommand,Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void executeOnCommand(int index){
        onCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void executeOffCommand(int index){
        offCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void undo(){
        undoCommand.execute();
    }
}
