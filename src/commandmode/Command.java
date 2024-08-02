package commandmode;

public interface Command {
    void execute();

    void undo();
}
