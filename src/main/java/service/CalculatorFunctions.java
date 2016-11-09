package service;

import org.springframework.stereotype.Service;

import model.Calculator;

@Service
public class CalculatorFunctions {
    
    public void calcActions(double vlAction, double vlInterest, Integer qtPurch) {
        
        Calculator calculator = new Calculator();
        
        calculator.setVlAction(vlAction);
        calculator.setVlInterest(vlInterest);
        calculator.setQtPurch(qtPurch);
        
        double tot = vlAction + vlInterest;
        
        System.out.println(tot);
    }
    
    public void resultCalc() {
        
    }
	
}
