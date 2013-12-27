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
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light); 
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
