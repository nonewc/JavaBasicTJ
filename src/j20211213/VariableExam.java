package j20211213;

public class VariableExam {
	/* 변수의 영향 범위 
	  
	 전역 변수와 지역 변수
	*/
	
	int a; // 전역변수는 메서드 밖에서 선언 (지양하는게 맞다)
	
	public int varTest(int a) {
		
		a++;
		
		return a; // return이 있어야 가지고 나감
			
	}
	
	
	public static void main(String[] args) {
		
		// int a = 1;
		VariableExam testvar = new VariableExam();
		testvar.a = 1;
		testvar.varTest(testvar.a);
		System.out.println(testvar.a);
				
	}
	
}
