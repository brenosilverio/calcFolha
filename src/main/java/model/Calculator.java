package model;

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
          this.totalWin = totalWin;
    }
    public double getInterestBuyPurch() {
        return interestBuyPurch;
    }
    public void setInterestBuyPurch(double interestBuyPurch) {
        this.interestBuyPurch = interestBuyPurch;
    }
    public double getInterestBuySale() {
        return interestBuySale;
    }
    public void setInterestBuySale(double interestBuySale) {
        this.interestBuySale = interestBuySale;
    }
    public double getEmolumentsPurch() {
        return emolumentsPurch;
    }
    public void setEmolumentsPurch(double emolumentsPurch) {
        this.emolumentsPurch = emolumentsPurch;
    }
    public double getLiquidProfit() {
        return liquidProfit;
    }
    public void setLiquidProfit(double liquidProfit) {
        this.liquidProfit = liquidProfit;
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
