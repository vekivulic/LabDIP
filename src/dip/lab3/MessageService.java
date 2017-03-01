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
public class MessageService {
   
    
   private Input input;
    private Output output;

    public MessageService(Input input, Output output) {
        setInput(input);
        setOutput(output);
    }

    public final void produceMessage() {
        String line = input.inputMessage();
        output.outputMessage(line);
    }

    public final Input getInput() {
        return input;
    }

    public final void setInput(Input input) {
        if (input == null || input.equals("")) {
            throw new IllegalArgumentException("Valid input needed.");
        }
        this.input = input;
    }

    public final Output getOutput() {
        return output;
    }

    public final void setOutput(Output output) {
        if (output == null || output.equals("")) {
            throw new IllegalArgumentException("Valid output needed.");
        }
        this.output = output;
    }

}