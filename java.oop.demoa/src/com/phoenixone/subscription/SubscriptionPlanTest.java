package com.phoenixone.subscription;

public class SubscriptionPlanTest {
	public static void main(String[] args) {
		PremiumSubscriptionPlan premiumMonthly = 
				new PremiumSubscriptionPlan(1, 
											"Monthly Subscription Plan",
											120F,
											12,
											6);
		
		PremiumSubscriptionPlan premiumYearly = 
				new PremiumSubscriptionPlan(2, 
											"Yearly Subscription Plan",
											120F,
											12,
											6);
		
		FreeSubscriptionPlan freeMonthly = 
				new FreeSubscriptionPlan(3,
										 "Monthly Subscription Plan",
										 1);
		
		FreeSubscriptionPlan freeYearly = 
				new FreeSubscriptionPlan(4,
										 "Yearly Subscription Plan",
										 12);
	}
	
}