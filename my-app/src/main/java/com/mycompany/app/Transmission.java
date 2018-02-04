package com.mycompany.app;

public class Transmission {

	private int maxWeight;
	private int stability;

	public Transmission(int maxWeight, int stability) {
		this.maxWeight = maxWeight;
		this.stability = stability;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public int getStability() {
		return stability;
	}

}