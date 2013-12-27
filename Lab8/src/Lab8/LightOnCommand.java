/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author admin
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
}
