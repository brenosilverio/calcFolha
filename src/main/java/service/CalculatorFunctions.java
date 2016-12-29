package service;

import org.springframework.stereotype.Service;

import model.Calculator;

@Service
public class CalculatorFunctions {

    public Calculator calcActions(Calculator calculator) {

        double total;
        double mont_a;
        double interestSale;
        double interestBuy;
        double percentage;
        double emoluments;
        double emolumentsForSale;
        double profit;
        double totalEmoluments;
        double action = calculator.getVlAction();
        double interest = calculator.getVlInterest();
        double purch = calculator.getQtPurch();
        
        total = (action * purch);

        if (total <= 135.07) {
            interestBuy = (2.70);
            interestSale = (2.70);
            percentage = ((total * interest) / 100);
            mont_a = total + ((total * interest) / 100);
            emoluments = ((total * 0.035) / 100);
            emolumentsForSale = ((mont_a * 0.035) / 100);
            totalEmoluments = (emoluments + emolumentsForSale);
            profit = (percentage - (interestBuy + interestSale + totalEmoluments));
            
            calculator.setTotalWin(percentage);
            calculator.setInterestBuyPurch(interestBuy);
            calculator.setInterestBuySale(interestSale);
            calculator.setEmolumentsPurch(totalEmoluments);
            calculator.setLiquidProfit(profit);
        }

        if (total >= 135.08 && total <= 498.62) {
            interestBuy = (total * 2) / 100;
            percentage = ((total * interest) / 100);
            mont_a = total + ((total * interest) / 100);
            interestSale = (mont_a * 2) / 100;
            emoluments = ((total * 0.035) / 100);
            emolumentsForSale = ((mont_a * 0.035) / 100);
            totalEmoluments = (emoluments + emolumentsForSale);
            profit = (percentage - (interestBuy + interestSale + totalEmoluments));

            calculator.setTotalWin(percentage);
            calculator.setInterestBuyPurch(interestBuy);
            calculator.setInterestBuySale(interestSale);
            calculator.setEmolumentsPurch(totalEmoluments);
            calculator.setLiquidProfit(profit);
        }
        
        if (total >= 498.63 && total <= 1514.6) {
            interestBuy = ((total * 1.5) / 100) + 2.49;
            percentage = ((total * interest) / 100);
            mont_a = total + ((total * interest) / 100);
            interestSale = ((mont_a * 1.5) / 100) + 2.49;
            emoluments = ((total * 0.035) / 100);
            emolumentsForSale = ((mont_a * 0.035) / 100);
            totalEmoluments = (emoluments + emolumentsForSale);
            profit = (percentage - (interestBuy + interestSale + totalEmoluments));

            calculator.setTotalWin(percentage);
            calculator.setInterestBuyPurch(interestBuy);
            calculator.setInterestBuySale(interestSale);
            calculator.setEmolumentsPurch(totalEmoluments);
            calculator.setLiquidProfit(profit);
        }
        
        if (total >= 1514.70 && total <= 3029.38) {
            interestBuy = ((total * 1) / 100) + 10.06;
            percentage = ((total * interest) / 100);
            mont_a = total + ((total * interest) / 100);
            interestSale = ((mont_a * 1) / 100) + 10.06;
            emoluments = ((total * 0.035) / 100);
            emolumentsForSale = ((mont_a * 0.035) / 100);
            totalEmoluments = (emoluments + emolumentsForSale);
            profit = (percentage - (interestBuy + interestSale + totalEmoluments));

            calculator.setTotalWin(percentage);
            calculator.setInterestBuyPurch(interestBuy);
            calculator.setInterestBuySale(interestSale);
            calculator.setEmolumentsPurch(totalEmoluments);
            calculator.setLiquidProfit(profit);
        }
        
        if (total >= 3029.39) {
            interestBuy = ((total * 0.5) / 100) + 25.21;
            percentage = ((total * interest) / 100);
            mont_a = total + ((total * interest) / 100);
            interestSale = ((mont_a * 0.5) / 100) + 25.21;
            emoluments = ((total * 0.035) / 100);
            emolumentsForSale = ((mont_a * 0.035) / 100);
            totalEmoluments = (emoluments + emolumentsForSale);
            profit = (percentage - (interestBuy + interestSale + totalEmoluments));

            calculator.setTotalWin(percentage);
            calculator.setInterestBuyPurch(interestBuy);
            calculator.setInterestBuySale(interestSale);
            calculator.setEmolumentsPurch(totalEmoluments);
            calculator.setLiquidProfit(profit);
        }

        return calculator;
    }
}
