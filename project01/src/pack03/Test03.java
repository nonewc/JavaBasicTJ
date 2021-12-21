package pack03;

import java.util.Scanner;

public class Test03 {
	
	
	public static void main(String[] args) {
		
		// 1) 프로젝트명 : project01
		// 2) 패키지명 : pack03
		// 3) 자바파일명 : Test03
		
		//콘솔을 통한 사용자 입력을 받기 위해 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//while문 조건을 위한 변수 선언
		int i = 0;
		
		System.out.print("별을 10개 찍어보세요."); 
		while (i < 10) { // while문 시작, i < 10 일 동안 반복
			
			System.out.print("*"); // 별을 찍기
			i++; // i는 1증가
			
		} //while문 종료
		
		System.out.println(); // 줄바꿈
		
		int j = 0; // while문 조건을 위한 변수 선언
		String sign = ""; // 사용자가 입력한 문자(기호)값을 저장할 변수 선언
		int num = 0; // 사용자가 입력한 정수(횟수)값을 저장할 변수 선언
		
		System.out.print("원하는 기호를 넣으세요>> "); // 사용자 입력 프롬프트
		sign = scan.nextLine(); // 입력값을 sign 변수에 저장
		
		
		System.out.print("원하는 횟수를 넣으세요>> ");
		num = scan.nextInt();
		
		while (j < num) { //while문 시작
			
			System.out.print(sign); // 사용자가 입력했던 기호 출력
			j++;
			
		}//while문 종료
		
		System.out.printf(" (%d번 %s를 반복)",num,sign); 
		
		System.out.println(); // 줄바꿈
		
		int num2 = 0; // 사용자가 입력한 정수(숫자)를 저장할 변수 선언
		int count = 0; // 결과값을 저장할 변수 선언
		
		
		while(num2 != 3) { // while문 시작
			
			System.out.print("1)증가,2)감소,3)종료를 선택해주세요.>> "); // 입력 프롬프트
			num2 = scan.nextInt(); // 사용자가 입력한 값을 num2 변수에 저장
			
			if (num2 == 1) { // if문 시작
				
				count++; // 결과 + 1
				System.out.printf("카운트: %d%n",count); // 출력
				
			} else if (num2 == 2) {
				
				count--; // 결과-1
				System.out.printf("카운트: %d%n",count);
				
			}
			
		}
		
		System.out.println("시스템을 종료합니다. 현재까지의 카운트는 "+count); // 결과 출력
		
		
	}

}
