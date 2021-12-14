package exceptionStudy;

public class Test {

	public void sayNick(String nick) throws FoolException {

		

			if ("fool".equals(nick)) {

				throw new FoolException(); 
				// throw : 강제로 에러 발생
				// throws : 에러 던지기

			}
			
			System.out.println("당신의 별명은 " + nick + "입니다.");

		
	}

	public static void main(String[] args) {

		Test test = new Test();

		try {
			
		test.sayNick("fool");
		test.sayNick("genious"); // 하나만 발생해도 catch로 넘어감 > 중단 가능
		
		}catch(FoolException e){
			
	
			System.out.println("에러가 발생했습니다.");
			
		}
		
		
	}
	
}
