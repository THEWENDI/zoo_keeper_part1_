package com.wendi.zoo_keeper_part1and2;

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		super(energyLevel);

	}
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("fly fly fly, energy - 50");
	}
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("human tastes good, energy + 25 ");
	}
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("boom boom boom!!, energy -100");
	}
	
	
	
}
