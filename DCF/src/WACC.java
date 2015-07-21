
public class WACC {
	//CAPM
	//Cost of Equity(Re) = Rf + Beta(Rm - Rf)(Risk Premum)
	private double riskFreeRate;
	private double beta;
	private double riskPremium;
	private double costOfEquity;
	private double costOfDebt;
	private double corporateTaxRate;
	private double marketRateOfDebt;
	private double equityToTotal;
	private double debtToTotal;
	private double wacc;
	
	public WACC(double riskFreeRate, double beta, double riskPremium, double corporateTaxRate, double marketRateOfDebt, double equityToTotal,
			    double debtToTotal){
		System.out.println(riskFreeRate);
		System.out.println(beta);
		System.out.println(riskPremium);
		System.out.println(corporateTaxRate);
		System.out.println(marketRateOfDebt);
		System.out.println(equityToTotal);
		System.out.println(debtToTotal);



	}
	
	public double calculateWACC(){
		//WACC = Re x E/V + Rd x (1 - corporate tax rate) x D/V.
		this.wacc = this.costOfDebt + this.costOfEquity;
		return this.wacc;
	}
	
	public double getWACC(){
		return this.wacc;
	}
	

}
