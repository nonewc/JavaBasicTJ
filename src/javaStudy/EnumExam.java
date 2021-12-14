package javaStudy;

public class EnumExam {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	//static 객체 생성 없이도 접근하여 사용 허용
	//final 상수로 선언
	//String 문자열로
	//상수형태로 선언 할 경우에는 대문자를 사용한다.
	
	public static void main(String[] args) {
		
		String gender1;
		
		gender1 = EnumExam.MALE; //객체 안찍고 접근하려면 클래스명, static
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
			
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "girl"; // enum에 의해 특정값만 들어가게 제한 됨.
		
		
	}

}

//열거형
enum Gender{
	MALE, FEMALE;
}
