package s03_command_pattern;

public class NoCommand implements Command {

    @Override
    public void execute() {
        // Do nothing
        System.out.println("NoCommand execute");
    }

    @Override
    public void undo() {
        // Do nothing
        System.out.println("NoCommand undo");
    }

}
