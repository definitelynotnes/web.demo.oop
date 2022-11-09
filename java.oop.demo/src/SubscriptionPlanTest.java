
public class SubscriptionPlanTest {

	public static void main(String[] args) {
		SubscriptionPlan standardMonthlySubscriptionPlan = new SubscriptionPlan();
		standardMonthlySubscriptionPlan.setDetails(1, "Standard - Monthly", "standard", 10);

		SubscriptionPlan standardYearlySubscriptionPlan = new SubscriptionPlan();
		standardYearlySubscriptionPlan.setDetails(2, "Standard - Yearly", "standard", 120);
		
		SubscriptionPlan premiumMonthlySubscriptionPlan = new SubscriptionPlan();
		premiumMonthlySubscriptionPlan.setDetails(3, "Premium - Monthly", "premium", 20);

		SubscriptionPlan premiumYearlySubscriptionPlan = new SubscriptionPlan();
		premiumYearlySubscriptionPlan.setDetails(4, "Premium - Yearly", "premium", 240);
	
		standardMonthlySubscriptionPlan.displayDetails();
		standardYearlySubscriptionPlan.displayDetails();
		premiumMonthlySubscriptionPlan.displayDetails();
		premiumYearlySubscriptionPlan.displayDetails();
		
		System.out.println("\n\n");
		standardMonthlySubscriptionPlan.setPrice(14.95F);
		System.out.println("~~~~~");
		standardMonthlySubscriptionPlan.displayDetails();
	}

}
