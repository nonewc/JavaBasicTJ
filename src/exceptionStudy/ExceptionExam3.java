package exceptionStudy;

public class ExceptionExam3 {

	// 예외를 던지지 않고 메서드에서 해결하면 오류 난 이후에도 멈추지 않고
	// 다음 과정들이 실행됨
	// 예외를 던져줘야 과정을 멈출 수 있음.
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int k = divide(i,j);
		
		System.out.println(k);
		System.out.println("종료");
		
		
	}
	
	
	public static int divide(int i, int j) {
		
		try {
			
			int k = i/j;
			return k;
			
		} catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
			
		}
				
	}

}
