package com.homework7.solid;

public class Cy_27 extends Airplane implements SpecialOpportunities {
	
	int maxSpeed ;
	String color;

	public Cy_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = "Blue";
	}

	@Override
	public void turboAcceleration() {
		maxSpeed = 400;
		int speed = (int) (maxSpeed + Math.random() * 300);
		SpecialOpportunities.super.turboAcceleration();
		System.out.println(speed + " ��. ����������������");
	}

	@Override
	public void technologyStealth() {
		int time = (int) (10 +Math.random() * 20);
		SpecialOpportunities.super.technologyStealth();
		System.out.println(time + " ������");
	}

	@Override
	public void nuclearstrike() {
		int bomb = (int) (Math.random() * 10);
		SpecialOpportunities.super.nuclearstrike();
		System.out.println(bomb + " ������� ���������");
	}
	
	AircraftControl aircraftControl = new AircraftControl();
	public void aircraftControl() {
		aircraftControl.moveUp();
		aircraftControl.moveRight();
		aircraftControl.moveLeft();
		aircraftControl.moveDown();	
	}

	public Cy_27(int length, int width, int weight) {
		super(length, width, weight);
		this.setLength(length);
		this.setWeight(weight);
		this.setWidth(width);
		System.out.println("������� ����� "+ length+ " �����. ");
		System.out.println("������ ����� "+  width+ " �����. ");
		System.out.println("���� ���������� ����� "+  weight+ " �����. ");
	}
	
	@Override
	void startTheEngine() {
		super.startTheEngine();
	}

	@Override
	void takeoffOfPlane() {
		super.takeoffOfPlane();
	}

	@Override
	void langingThePlane() {
		super.langingThePlane();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	

}
