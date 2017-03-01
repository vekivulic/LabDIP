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
public class GuiOutput implements Output {
private String line;
    @Override
    public void outputMessage() {
        JOptionPane.showMessageDialog(null, line);
    }

    @Override
    public void outputMessage(String line) {
        JOptionPane.showMessageDialog(null, line);
    }

    
   
}
