
public class gordonGrowth {
	public revenueProjections companyCashFlow;
	public WACC discountRate;
	
	public gordonGrowth(int years, double growthRate, double initialRevenue, double operatingCostsMargin,
			  			double taxRate, double netInvestmentPercent, double initialWorkingCapital,
			  			double initialChangeInWorkingCapital,double riskFreeRate, double beta, double riskPremium, double marketRateOfDebt,
			  			double equityToTotal, double debtToTotal){
		this.companyCashFlow = new revenueProjections(years,growthRate,initialRevenue,operatingCostsMargin,
							  taxRate,netInvestmentPercent,initialWorkingCapital,
							  initialChangeInWorkingCapital);
		System.out.println(riskFreeRate);
		System.out.println(beta);
		System.out.println(riskPremium);
		System.out.println(taxRate);
		System.out.println(marketRateOfDebt);
		System.out.println(equityToTotal);
		System.out.println(debtToTotal);
		this.discountRate = new WACC(riskFreeRate, beta,riskPremium,taxRate, marketRateOfDebt,equityToTotal, debtToTotal);
		discountRate.calculateWACC();
		companyCashFlow.calculateRevenueTable();

	}
	
	public String getCashFlow(){
		String listString = companyCashFlow.getCashFlowList().toString();
		return listString;
	}
	
	

}
