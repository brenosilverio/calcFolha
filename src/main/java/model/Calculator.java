package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private double vlAction;
    private double vlInterest;
    private Integer qtPurch;
    private double totalWin;
    private double interestBuyPurch;
    private double interestBuySale;
    private double emolumentsPurch;
    private double liquidProfit;

    public double getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(double totalWin) {
        BigDecimal fmt = new BigDecimal(totalWin).setScale(2, RoundingMode.FLOOR);
        this.totalWin = fmt.doubleValue();
    }

    public double getInterestBuyPurch() {
        return interestBuyPurch;
    }

    public void setInterestBuyPurch(double interestBuyPurch) {
        BigDecimal fmt = new BigDecimal(interestBuyPurch).setScale(2, RoundingMode.FLOOR);
        this.interestBuyPurch = fmt.doubleValue();
    }

    public double getInterestBuySale() {
        return interestBuySale;
    }

    public void setInterestBuySale(double interestBuySale) {
        BigDecimal fmt = new BigDecimal(interestBuySale).setScale(2, RoundingMode.FLOOR);
        this.interestBuySale = fmt.doubleValue();
    }

    public double getEmolumentsPurch() {
        return emolumentsPurch;
    }

    public void setEmolumentsPurch(double emolumentsPurch) {
        BigDecimal fmt = new BigDecimal(emolumentsPurch).setScale(2, RoundingMode.FLOOR);
        this.emolumentsPurch = fmt.doubleValue();
    }

    public double getLiquidProfit() {
        return liquidProfit;
    }

    public void setLiquidProfit(double liquidProfit) {
        BigDecimal fmt = new BigDecimal(liquidProfit).setScale(2, RoundingMode.FLOOR);
        this.liquidProfit = fmt.doubleValue();
    }

    public double getVlAction() {
        return vlAction;
    }

    public void setVlAction(double vlAction) {
        this.vlAction = vlAction;
    }

    public double getVlInterest() {
        return vlInterest;
    }

    public void setVlInterest(double vlInterest) {
        this.vlInterest = vlInterest;
    }

    public Integer getQtPurch() {
        return qtPurch;
    }

    public void setQtPurch(Integer qtPurch) {
        this.qtPurch = qtPurch;
    }
}
