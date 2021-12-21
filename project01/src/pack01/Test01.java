package pack01;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		// 1) 프로젝트명 : project01
		// 2) 패키지명 : pack01
		// 3) 자바파일명 : Test01
		
		
		Scanner scan = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
		
		String beLong = ""; // 사용자의 소속 값을 담을 문자열형 변수 선언 및 초기화
		int age = 0; // 사용자의 나이 값을 담을 정수형 변수 선언 및 초기화
		double weight = 0; // 사용자의 몸무게 값을 담을 실수형 변수 선언 및 초기화
		boolean married = true; // 사용자의 기혼여부 값을 담을 논리형 변수 선언 및 초기화
		
		System.out.println("--------------------------------"); 
		System.out.println("건강 검진을 위해 회원의 정보를 입력해주세요"); 
		System.out.println("--------------------------------");
		
		
		System.out.print("당신의 소속은>> "); // 사용자 입력 프롬프트
		beLong = scan.nextLine(); // 사용자가 콘솔을 통해 입력한 String 값을 변수 beLong에 저장
		System.out.print("당신의 소속은 "+beLong+"이시군요!\n");//저장값 확인
		
		System.out.print("당신의 나이는>> ");
		age = scan.nextInt();
		System.out.print("당신의 작년나이는 "+(age-1)+"세였겠군요!\n");
		
		System.out.print("현재 당신의 몸무게는>> ");
		weight = scan.nextDouble();

		if(weight >= 90) { // if문 시작
			
			System.out.println("당신은 지금 과체중이시군요!"); // weight >= 90인 경우
			
		}else if (weight >= 70) { 
		
			System.out.println("당신은 지금 보통이시군요!"); // weight >= 70인 경우
			
		}else {
			
			System.out.println("당신은 지금 미달이시군요!"); // 그 외 (weight<70) 경우
			
		} // if ~ else 종료
		
		System.out.print("당신은 결혼하셨나요>> ");
		married = scan.nextBoolean();
		
		if(married == true) { //if문 시작
			
			System.out.println("당신은 배우자가 있겠군요!");
			
		} else {
			
			System.out.println("당신은 배우자가 없겠군요!");
			
		} // if~ else 종료
		
		System.out.println("--------------------------------");
		System.out.println("입력을 마무리합니다.");
		
		
		
		
		
		
		
		
	}
	
	

}
