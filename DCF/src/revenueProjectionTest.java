
public class revenueProjectionTest {
	public static void main(String Args[]){
		revenueProjections company = new revenueProjections(5 ,.1 ,100);
		company.calculateRevenueTable();
		
		System.out.print(company);
	}

}