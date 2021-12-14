package javaStudy;

public class Car {
	
	String name;
	int number;
	
	public Car(String name, int number) {
		
		this.name = name;
		this.number = number;
		
	} 
	
	// 보통 method는 public으로 풀어놓고 변수는 private 걸어 놓음
	// 변수에 직접 접근 가능하면 오류 혹은 해킹의 위험이 있기 때문
	
	
	
	

	public void run() {
		
		System.out.println("RUN!!!");
		
	}
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();
//		
//		car.run();
//		
//		bus.ppangppang();
//		car.ppangppang();
		// 부모 클래스로 만든 인스턴스 car는 부모, 즉 자신의 자원은 쓸 수 있지만,
		// 자식, 즉 bus의 메서드는 사용할 수 없다.
		
//	}
	
	
	
	
	
//	String name;
//	int number;
//	
//	public Car(String n) {
//		
//		this.name = n;
//		
//	}
	
	
	
	// 생성자는 클래스명과 동일해야 하며 리턴 타입과 리턴이 없다. (void도 없다.)
	// 생성자를 한 개라도 만들지 않으면 자바가 자동으로 기본 생성자를
	// 생성하지만, 하나라도 만들기만 하면 기본 생성자는 만들지 않는다.
	
}
