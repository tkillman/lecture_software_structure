public class RemoteLoader {
    public static void main(String[] args) {
        // create invoker
        RemoteControl remoteControl = new RemoteControl();
        // create receivers
        Light livingRoomLight = new Light("LivingRoom");
        Light kitchenLight = new Light("Kitchen");
        // create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        // linking the invoker with the commands
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
