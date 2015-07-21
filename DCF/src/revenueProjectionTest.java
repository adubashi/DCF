
public class revenueProjectionTest {
	public static void main(String Args[]){
		revenueProjections company = new revenueProjections(5 ,.2 ,100000,.65,.3 ,.07, 9000);
		company.calculateRevenueTable();
		
		System.out.print(company);
	}

}
