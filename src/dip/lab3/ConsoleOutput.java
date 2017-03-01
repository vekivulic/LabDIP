/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author vekivulic
 */
public class ConsoleOutput implements Output{
   
  

    
    @Override
    public void outputMessage(String line) {
        System.out.println(line);
    }

    @Override
    public void outputMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

    

    

    

    
    

