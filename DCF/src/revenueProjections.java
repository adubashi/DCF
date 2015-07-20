
import java.util.*;

public class revenueProjections {
	private int years;
	private double growthRate;
	private double initialRevenue;
	
	private List<Double> revenueTable;
	
	
	public revenueProjections(int years, double growthRate, double initialRevenue){
		this.years = years;
		this.growthRate = growthRate;
		this.initialRevenue = initialRevenue;
		this.revenueTable = new ArrayList();
	}
	
	
	
	public void calculateRevenueTable(){
		revenueTable.add(initialRevenue);
		for(int i = 1; i <= years + 1; i++){
			double rev = revenueTable.get(i - 1);
			revenueTable.add(rev * ( 1 + growthRate));
		}
		
	}
	
	public String toString(){
		String test = "";
		for(int i = 1; i < years + 1; i++){
			test += " Year " + i + ": ";
			test += revenueTable.get(i);
		}
		return test;
	}

}