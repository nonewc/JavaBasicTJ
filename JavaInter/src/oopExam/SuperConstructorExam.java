package oopExam;

public class SuperConstructorExam {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);
		
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
		
		
	}
	
	
	
	
}

class Point {
	
	int x, y;
	
	Point(){} // 에러제거 1.
	
	
	Point(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	String getLoc() {
	
		return "x:" + x +",y="+y;
		
		
	}
	
}
	
class Point3D extends Point {
	

	int z;
	
	Point3D(int x, int y, int z){ // 에러 발생
		
		//super(x,y); // 에러 제거 2.
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	String getLoc() {
		return "x:" + x + ",y:" + y + ",z:" + z;
	}
	

	
}

/*
	Point3D클래스의 생성자에서 조상 클래스의 생성자인 Point()를
	찾을 수 없다는 내용의 에러가 발생한다.
	Point3D클래스의 생성자의 첫줄에 생성자(부모)를 호출하는 문장이 없어서
	자동적으로  super(); 를 생성자의 첫줄에 넣어준다.
	
	
	
*/	
