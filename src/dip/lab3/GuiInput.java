/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author vekivulic
 */
public class GuiInput implements Input {
private KeyboardInput message;
    


@Override
    public String inputMessage() {
        
       return JOptionPane.showInputDialog(null, "Enter Message: ");
    }

    public KeyboardInput getMessage() {
        return message;
    }

    public void setMessage(KeyboardInput message) {
        this.message = message;
    }
    
}
