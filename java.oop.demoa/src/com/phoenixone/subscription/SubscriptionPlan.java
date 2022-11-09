package com.phoenixone.subscription;

public class SubscriptionPlan {
	private int id;
	private String name;
	private float price;
	private int term;
	
	public SubscriptionPlan() {
	}

	public SubscriptionPlan(int id, String name, float price, int term) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.term = term;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}
	
	
	
	
}
