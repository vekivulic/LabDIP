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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Input input = new KeyboardInput("");
       Output output = new GuiOutput();
        
        MessageService messagingService = new MessageService(input, output);
        messagingService.produceMessage();
        
        
    }

       
    }
    
    

