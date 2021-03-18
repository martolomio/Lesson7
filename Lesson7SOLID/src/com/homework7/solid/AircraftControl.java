package com.homework7.solid;

public class AircraftControl {
	
	void moveUp() {
	  float up = (float) (Math.random()*2000);
		System.out.println("–ух вгору на "+up+ " мт.");
	}
	void moveDown() {
		 float down = (float) (Math.random()*2000);
		System.out.println("–ух донизу на "+down+" мт.");
	}
	void moveLeft() {
		 float left = (float) (Math.random()*1000);
		System.out.println("–ух вл≥во на "+left+" мт.");
	}
	void moveRight() {
		 float right = (float) (Math.random()*900);
		System.out.println("–ух вправо на "+right+" мт.");
	}
	
	@Override
	public String toString() {
		return "AircraftControl []";
	}
	
	
	
	
}
