package com.phoenixone.subscription;

public class PremiumSubscriptionPlan extends SubscriptionPlan{
	private float trialPeriod;
	
	public PremiumSubscriptionPlan() {
	}

	public PremiumSubscriptionPlan(int id, String name, float price, int term, int trialPeriod){
		super(id, name, price, term);
		this.trialPeriod = trialPeriod;
	}
	
	public float getTrialPeriod() {
		return trialPeriod;
	}

	public void setTrialPeriod(float trialPeriod) {
		this.trialPeriod = trialPeriod;
	}
}
