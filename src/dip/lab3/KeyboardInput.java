/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author vekivulic
 */
public class KeyboardInput implements Input{

  private String message;

    public KeyboardInput(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Please enter a message";
    }
    
    public final void setMessage(){
       if (null == message|| message.isEmpty()){
            throw new IllegalArgumentException("You must enter a message.");
        }
      
        
    }

    @Override
    public String inputMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
