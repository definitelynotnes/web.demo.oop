package com.phoenixone.subscription;

public class FreeSubscriptionPlan extends SubscriptionPlan {
	public FreeSubscriptionPlan() {
		
	}

	public FreeSubscriptionPlan(int id, String name, int term) {
		super(id, name, 0, term);

	}
	
	
}
