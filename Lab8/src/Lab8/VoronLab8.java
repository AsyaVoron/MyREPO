/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author admin
 */
public class VoronLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        System.out.println("Simple remote control was created!");
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light); 
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        System.out.println("Light was switched on.");
    }
}
