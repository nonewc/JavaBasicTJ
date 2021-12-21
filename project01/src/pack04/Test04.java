package pack04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// 1) 프로젝트명 : project01
		// 2) 패키지명 : pack04
		// 3) 자바파일명 : Test04
		
		//콘솔을 통한 사용자 입력을 받기 위해 Scanner 객체 생성
		Scanner scan = new Scanner(System.in); 
		
		String temp = ""; // 사용자 입력값을 받을 String type 변수 선언
		int num = 0; // 단수를 저장할 정수형 변수 선언
		
		//사용자 입력 프롬프트 출력		
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는?:");
		temp = scan.nextLine(); // 사용자의 입력값을 콘솔을 통해 받아 저장
		num = Integer.parseInt(temp);  // 받은 값을 연산을 위해 정수로 변환
		
		for(int i = 0; i < num ; i++) { // for문 시작, 단수 연산
			
			for(int j = 0; j <= i ; j++) { // 이중for문 시작, 각 단에 해당되는 별 갯수 연산
				
				System.out.print("*"); // 별 출력
				
			} // 이중for문 종료
			
			System.out.println(); // 단수 줄바꿈
		} // for문 시작
		
		System.out.println();
		
		System.out.print("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.\n단수는?:");
		temp = scan.nextLine();
		num = Integer.parseInt(temp);
		
		for(int i = 0; i < num ; i++) {
			
			for(int j = 0; j < num-i ; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
}
