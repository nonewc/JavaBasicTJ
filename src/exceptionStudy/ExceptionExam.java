
package exceptionStudy;

public class ExceptionExam {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
			try {
			int k = i/j;
		
			System.out.println(k); // 예외 뜨면 바로 그 시점에서 종료
			} catch(ArithmeticException e)
			//error도 일종의 객체니까 변수()가 필요
			{
				System.out.println("0으로는 나눌 수 없습니다.\n"+ e.toString()
				); 
				
			} catch(Exception f) {
				
				System.out.println("예외가 발생했습니다.\n"+ f.toString());
				
			}
			
			finally { 
				
				System.out.println("예외와 상관없이 무조건 실행!"); // 생략가능
			
			}
			
			System.out.println("main end!!");
			
		
		
	}

}
