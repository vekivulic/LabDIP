/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author vekivulic
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator; //// from interface 

    public TipCalculatorService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getCalculatedTip(){
        return tipCalculator.getTip();
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
}
