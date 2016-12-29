package service;

import org.springframework.stereotype.Service;

import model.Calculator;

@Service
public class CalculatorFunctions {

    public Calculator calcActions(Calculator calculator) {

        double total;
        double action   = calculator.getVlAction();
        double interest = calculator.getVlInterest();
        double purch    = calculator.getQtPurch();
        
        total = action + + interest + purch;

        System.out.println(total);
        
        calculator.getQtPurch();
        calculator.getVlAction();
        calculator.getVlInterest();
        
        return calculator;
    }
}
