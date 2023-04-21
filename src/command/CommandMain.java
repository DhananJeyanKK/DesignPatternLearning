package command;

public class CommandMain {

    public static void main(String[] args){
        Light light = new Light();
        Switch s = new Switch();

        OnCommand onCommand = new OnCommand(light);
        s.executeCommand(onCommand);
    }

}
