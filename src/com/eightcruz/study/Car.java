package com.eightcruz.study;
public class Car extends Machine {
	
	String name;
	int number;
	public Car(String name, int number) {
		
		this.name = name;
		this.number = number;
				
		
	}
	
	
	
	public Car(String name) {
		
		
		System.out.println("Car의 name 생성자입니다.");
		System.out.println("Car의 기본 생성자입니다.");
		
	}
	
	
	
	
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
		System.out.println("Turn ON");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
		System.out.println("Turn OFF");

	}
	
	

}
