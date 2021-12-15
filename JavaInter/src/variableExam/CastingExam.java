package variableExam;

public class CastingExam {
/*
	Casting 형변환 - 자료형의 타입을 일치시킨다.
	
		'형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는 것'
		예) int 값과 double값을 계산하려면 먼저 두 값을 같은 타입으로 변환한 후 계산한다.
		방법 자체는 간단하다.
	
			(타입)피연산자
					
		괄호()는 '캐스트 연산자' '형변환 연산자'
			
			double d = 85.4;
			int score = d; 		(x)
			int score = (int)d; (o)
			int score = 85;
			
			
		boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
		기본형과 참조형간의 형변환은 불가능하다.
	
	정수형간의 형변환
	
		큰 타입에서 작은 타입으로 변환, 예를 들면 int의 값을 byte타입으로 변환하는 경우에는
		그 크기의 차이 만큼 잘려나간다. 경우에 따라 '값 손실 loss of data'이 발생할 수도 있다.
		
		반대로 작은 타입에서 큰 타입으로 변환, 예를 들면 byte에서 int으로 변환 하는 경우는
		잘려나가는 일이 없다. 따라서 값 손실이 발생하지 않는다. 나머지 빈 공간들은 0 또는 1로 채워진다.
			
			byte 00001010
			int  0000000...00001010
			
	정수와 실수형 간의 형변환
		
		정수형과 실수형은 완전히 다르기 떄문에 정수형간의 변환처럼 간단히 처리할 수 없다.
		좀 더 복잡한 과정을 거친다.
		
	    정수를 실수형으로 형변환
		
	    실수를 정수형으로 형변환

	자동 형변환
		
		서로 다른 타입간에 대입이나 연산을 할 때는 형변환을 통해 일치시키는 것이 원칙이다.
		하지만 경우에 따라 생략할 수도 있다.
		이것은 형변환을 하지 않는게 아니라 JAVA가 형변환을 해주는 것이다.
		
		특히 계산할 때 자동 형변환이 많이 일어난다. 
		연산과정에서 자동으로 형변환이 이루어지는 것을 '산술변환'이라고 한다.
		
		"자동 형변환은 값을 최대한 보존할 수 있는 타입으로 자동 형변환 된다."
		
*/

	public static void main(String[] args) {
		
//		double d = 85.4;
//		//int score = d;
//		int score = (int)d;
//		
//		System.out.println(score);	// 85
		
		/**/
		
//		int i = 10;
//		byte b = (byte)i;
//		
//		System.out.printf("[int] -> [byte] i = %d -> b = %d%n", i,b);
//		
//		i = 300;
//		b = (byte)i;
//		
//		System.out.printf("[int] -> [byte] i = %d -> b = %d%n", i,b);
//		// byte의 최댓 값 44가 나옴 (overflow)
//		
//		b = 10;
//		//i = b;
//		i = (int)b; //굳이 형변환, 문제 없음
//		
//		System.out.printf("[byte] -> [int] b = %d -> i = %d%n", b,i);
//		
//		b = -2;
//		//i = b;
//		i = (int)b; 
//		
//		System.out.printf("[byte] -> [int] b = %d -> i = %d%n", b,i);

		/**/
		
//		float f = 9.1234567f;
//		double d = 9.1234567;
//		
//		//double d2 = f;
//		double d2 = (double)f;
//				
//		System.out.println(d2);
//		System.out.printf("d = %-10.2f입니다.%n",d2);
		
		/**/
		
//		int i = 91234567;
//		float f = i;
//		
//		int i2 = (int)f;
//		
//		i = i2;
//				
//		double d = i;
//		
//		//int i3 = d;
//		int i3 = (int)d;
		
		/**/
		
//		float f = 1234;
//		System.out.println(f);
//		
//		//byte b = 1234; // 형변환 하지 않으면 커서 못 들어감
//		byte b = (byte)1234;
//		
//		System.out.println(b);
		
		/**/
		
		int i = 3;
		double d = 1.0;
		
		double s = i + d;
		
		System.out.println(s);
		
	}
	
	
	
}
