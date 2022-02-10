package com.wendi.zoo_keeper_part1and2;

public class Mammal {
	protected int energyLevel;
	
	

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}



	public int getEnergyLevel() {
		return energyLevel;
	}



	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level : " + this.energyLevel);
		return energyLevel;
	}
	
	
	
	
	
	
	
	
}
