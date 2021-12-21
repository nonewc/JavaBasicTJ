package pack02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
				
		// 1) 프로젝트명 : project01
		// 2) 패키지명 : pack02
		// 3) 자바파일명 : Test02
		
		// 콘솔을 통해 사용자의 입력을 받기 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in); 
		
		int forNum = 0; // 사용자가 처음 입력한 숫자를 저장하기 위한 정수형 변수 선언
		int bacNum = 0; // 사용자가 두번째로 입력한 숫자를 저장하기 위한 정수형 변수 선언
		int case1 = 0; // 앞 숫자가 큰 횟수를 저장하기 위한 정수형 변수 선언
		int case2 = 0; // 뒷 숫자가 큰 횟수를 저장하기 위한 정수형 변수 선언
		
		String temp = ""; // String type으로 입력되는 값을 임시로 저장하기 위한 변수 선언
		char cont = 'o'; // 계속 여부를 판단하기 위한 변수 선언
		
		
		while(cont=='o') { // while문 시작, cont의 값이 'o' 인 동안 반복
			
			System.out.println();
			System.out.println("숫자 크기 판별");
			System.out.println("------------");
			
			System.out.print("숫자 입력>> "); // 사용자 입력 프롬프트
			forNum = scan.nextInt(); // 입력받은 값을 forNum 변수에 저장
			
			
			System.out.print("숫자 입력>> ");
			bacNum = scan.nextInt();
			
			if (forNum > bacNum) { // if문 시작
				
				System.out.println("판결은 앞숫자가 크다");
				case1++; //앞 숫자가 큰 횟수 증가
				
			} else if (forNum < bacNum) { // else if, 뒷 숫자가 큰 경우
				
				System.out.println("판결은 뒷숫자가 크다");
				case2++; //뒷 숫자가 큰 횟수 증가
				
			} else { // 그 외의 경우
				
				System.out.println("다시 입력해주세요."); // 재입력 요구
				continue; // 재입력을 위해 처음 부분으로 돌아감
				
			}
			
			System.out.print("계속 하시겠습니까(계속: o, 중단: x): "); // 계속 여부 확인용 메세지 출력
			
			temp = scan.next(); // 사용자가 입력한 값 저장
			cont = temp.charAt(0); // String type temp 배열의 가장 앞(0)글자를 읽어 char type으로 변환
			
			
								
		}
		
		System.out.println("프로그램을 종료합니다.");
		System.out.printf("시도횟수: %d, 앞숫자가 큰횟수: %d, 뒷숫자가 큰횟수: %d",case1+case2,case1,case2); // 결과 출력
		
		
	}
	
}
