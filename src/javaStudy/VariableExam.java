package javaStudy;

public class VariableExam {
	
	// global variable
	//  전역변수 - 변수의 선언 위치가 클래스 블록 안 (메서드 바깥)
	//			 변수의 사용 범위는 클래스 전체가 된다.
	
	int globalScope = 10; 
	static int staticVal = 7; // static- 객체 선언 없이도 사용 가능
	
	
	public void scopeTest(int value) {
		
		// local variable
		// 지역 변수 - 메서드 안에서 선언
		//			변수의 사용 범위는 그 메서드로 제한된다.
		
		
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
				
	}
	
	
	public static void main(String[] args) {
				
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		// static 변수는 static을 선언하지 않은 메서드 내에서는 사용을
		// 해도 문제가 되지 않는다.
	}

}
