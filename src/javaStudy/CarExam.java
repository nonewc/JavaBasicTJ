package javaStudy;

public class CarExam {
	
	public static void main(String[] args) {
		
		Car car = new Car("포니",1234);
		
		System.out.println("name: " + car.name);
		System.out.println("number: " + car.number);
		
		
		
		// 생성자는 반드시 1 개 이상 존재 해야만 한다.
		// 개발자가 만들지 않으면 자동으로 기본 생성자 
		// default constructor를 자바가 만들어 준다.
		
//		Car c1 = new Car(); // 생성자가 없을 땐 기본 생성자를 만들어줘서 에러 안남
		
		// 인수를 하나 받겠다는 생성자를 만들어 줬기 때문에 넣어 줘야 함.
//		Car c2 = new Car("Grandeur"); 
		// 객체 = 인스턴스 (클래스와의 관계를 설명할 때) = beans
		
//		System.out.println(c2.name);
		
		
//		c1.print();
//		c2.print(name);
		
	}
	

}
