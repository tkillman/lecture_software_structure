public class RemoteControl {
    Command[] oncommands;
    Command[] offcommands;

    RemoteControl() {
        oncommands = new Command[7];
        offcommands = new Command[7];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            oncommands[i] = noCommand;
            offcommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        oncommands[slot] = onCommand;
        offcommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        oncommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offcommands[slot].execute();
    }

}