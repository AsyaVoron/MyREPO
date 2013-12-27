/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author admin
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }
    
    public void setCommand(Command command){
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
//    Command[] onCommands;
//    Command[] offCommands;
//    
//    public SimpleRemoteControl() {
//        onCommands = new Command[7];
//        offCommands = new Command[7];
//        
//        Command noCommand = new NoCommand();
//        for(int i = 0; i < 7; i++) {
//            onCommands[i] = noCommand;
//            offCommands[i] = noCommand;
//        }
//    }
//    
//    public void setCommand(int slot, Command onCommand, Command offCommand) {
//        onCommands[slot] = onCommands;
//        offCommands[slot] = offCommand;
//    }
//    
//    public void onButtonWasPushed(int slot) {
//        onCommands[slot].execute();
//    }
//    
//    public void offButtonWasPushed(int slot) {
//        offCommands[slot].execute();
//    }
//    
//    public String toString() {
//        StringBuffer stringBuff = new StringBuffer();
//        stringBuff.append("\n------ Remote Control ------\n");
//        for(int i = 0; i < onCommands.length; i++){
//            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
//                    + "   " + offCommands[i].getClass().getName() + "\n");
//        }
//        return stringBuff.toString();
//    }

}
