package controlExam;

import java.util.Scanner;

public class WhileExam {
/* 
		While 반복문은 for에 비해서 구조가 간단하다.
		조건식이 참일 동안 반복 수행한다.
				

   			for(   초기화     ;  조건식  ; 중감식) {}
   			for(int i = 0 ; i < 5 ; i++) {수행문장}
   			
   			초기화 int = 0
			while (조건식 i < 5) { 
				수행문장 
				증감식 i++ 
			}
   
   		조건식 생략 불가,보통 조건식에 true를 넣어 무한 반복 수행
   		
   			for(;;)
   			while(true)
   			
   		무한 반복 설정 시에는 반드시 종료 조건을 만들어야 한다.
   		
   		
   		
     
   
   
 */
	
	public static void main(String[] args) {
		
		
		// Quiz 1. while문을 사용하여 카운트 다운을 하는 중간 중간 쉬었다가
		//		      다음 카운트로 넘어가게
		//
		// 카운트 다운 시작
		/* 10
			9
			8
			7
			6
			5
			4
			3
			2
			1
			Awesome!!!
		*/
		
//		Long i = 10_000_000_000L;
//		
//		System.out.println("카운트 다운 시작");
//		
//		while  (i > 0) {
//			
//			if (i%1_000_000_000 == 0) {
//			System.out.printf("%d%n",i/1_000_000_000);
//			}
//			
//			i--;
//		}
//		
//		System.out.println("AWESOME!!!");
		
		// Quiz 2. 숫자를 입력하면 그 각각의 숫자들의 합을 계산하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num = 0;
//		
//		System.out.print("숫자를 입력하세요 > ");
//		
//		num = scan.nextInt();
//		
//		int sum = 0;
//		
//		while (num != 0) {
//			
//			sum += num % 10;
//			num = num/10; // num /= 10;
//			
//		}
//		
//		System.out.println("각 자리 수의 합 " + sum);
		
		// Quiz 3.
		/* 1 - 1
		   2 - 3
		   3 - 6
		   4 - 10
		   .
		   .
		   .
		   10 - 55
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("누적 합계를 원하는 숫자를 입력하세요 > ");
		
		num = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= num) {
			
			sum += i;
			
			System.out.printf("%d - %d%n",i,sum);
			
			i++;
			
		}
		
		
		
		
	}
}
