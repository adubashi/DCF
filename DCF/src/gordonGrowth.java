
public class gordonGrowth {
	public revenueProjections companyCashFlow;
	public WACC discountRate;
	
	public gordonGrowth(int years, double growthRate, double initialRevenue, double operatingCostsMargin,
			  			double taxRate, double netInvestmentPercent, double initialWorkingCapital,
			  			double initialChangeInWorkingCapital,double riskFreeRate, double beta, double riskPremium){
		this.companyCashFlow = new revenueProjections(years,growthRate,initialRevenue,operatingCostsMargin,
							  taxRate,netInvestmentPercent,initialWorkingCapital,
							  initialChangeInWorkingCapital)	;
		this.discountRate = new WACC(riskFreeRate, beta,riskPremium, taxRate);
		companyCashFlow.calculateRevenueTable();
		discountRate.calculateWACC();
	}
	
	public String getCashFlow(){
		String listString = companyCashFlow.getCashFlowList().toString();
		return listString;
	}
	
	

}