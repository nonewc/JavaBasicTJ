package oopExam;

class Car2{
	
	String color;
	String gear;
	int door;
	
	Car2() {
		
		this("white", "auto", 4);
		
	}
	
	
	
	Car2(String color, String gear, int door) {
		
		this.color = color;
		this.gear = gear;
		this.door = door;
		
	}
	
}



public class CarTest2 {
	
	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
//		c1.color = "White";
//		c1.gear = "Auto";
//		c1.door = 2;
		
//		Car c2 = new Car("Black","auto",4);
				
		System.out.println("c1의 색상은"+c1.color);
//		System.out.println("c2의 색상은"+c2.color);
		System.out.println("c1의 기어는"+c1.gear);
//		System.out.println("c2의 기어는"+c2.gear);
		System.out.println("c1의 문 갯수는"+c1.door);
//		System.out.println("c2의 문 갯수는"+c2.door);
		
	}
}
