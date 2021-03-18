package com.homework7.solid;

public abstract class Airplane {

	private int length;
	private int width;
	private int weight;

	public Airplane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	void startTheEngine() {
		double time = 20 + Math.random() * 68;
		System.out.println("�� ������ ���������� "+time+ "��.");
	}
	void takeoffOfPlane() {
		double km = Math.random() * 1000;
		System.out.println("˳��� ������  "+km +" ��.");
	}
	void langingThePlane() {
		System.out.println("˳��� ��� �� �������");
	}



	@Override
	public String toString() {
		return "Airplane [length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	
	
	
}
