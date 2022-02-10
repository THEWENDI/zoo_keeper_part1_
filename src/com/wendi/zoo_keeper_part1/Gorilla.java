package com.wendi.zoo_keeper_part1;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("gorilla has thrown something");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("bannananananana");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla climbing!!");
	}
	
	
	
	
}
