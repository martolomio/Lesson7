package com.homework7.solid;

public class AircraftControl {
	
	void moveUp() {
	  float up = (float) (Math.random()*2000);
		System.out.println("��� ����� �� "+up+ " ��.");
	}
	void moveDown() {
		 float down = (float) (Math.random()*2000);
		System.out.println("��� ������ �� "+down+" ��.");
	}
	void moveLeft() {
		 float left = (float) (Math.random()*1000);
		System.out.println("��� ���� �� "+left+" ��.");
	}
	void moveRight() {
		 float right = (float) (Math.random()*900);
		System.out.println("��� ������ �� "+right+" ��.");
	}
	
	@Override
	public String toString() {
		return "AircraftControl []";
	}
	
	
	
	
}
