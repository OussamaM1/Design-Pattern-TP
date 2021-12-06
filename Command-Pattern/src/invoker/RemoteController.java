package invoker;

import command.Command;

public class RemoteController {

    public String submit(Command command) {
        return command.execute();
    }

    public String undoAction(Command command) {
        return command.undo();
    }

}
