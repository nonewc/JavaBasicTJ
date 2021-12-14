package exceptionStudy;

public class ExceptionExam2 {
	
	public static void main(String[] args) {
		
		int [] array = new int[10];
		
		try {
			
			array[20] = 5;
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 범위를 지나쳤어요.\n"+e.toString());
			
		} 
		
		
		
		
		
		
		System.out.println("성공");
		
		
		
	}

}
