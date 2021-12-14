package com.eightcruz.study;

public class Truck extends Car {

	public Truck() {
		
//		super(); // 부모 생성자 호출
		
		super("트럭");
		// 자동완성은 super()로 기본 생성자를 호출함.
		// 생성자를 하나라도 생성하면 기본 생성자 생성 안 해줌
		// 기본 생성자가 없기 때문에 super()로 호출할 수 없음
		// 부모 클래스에 기본 생성자를 만드는 식으로도 해결 가능
		
		System.out.println("Truck의 기본 생성자입니다.");
		
	}
	
}
