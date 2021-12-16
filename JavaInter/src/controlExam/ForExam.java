package controlExam;

import java.util.Scanner;

public class ForExam {

/* For 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용
	
		반복 횟수를 정확히 특정 할 때 주로 사용된다.
		문법이 직관적이라 가독성이 좋다.
		
			for (start ; stop ; step){}
				  초기값	  조건식	증감식
				  
		초기값 -> 조건식 -> 수행 문장들... -> 증감식 ->			
					조건식 -> 수행 문장들... -> 증감식 ->			
						조건식 -> 수행 문장들... -> 증감식 -> 종료			
	
		초기값 : 반복문에 사용할 변수를 초기화. 처음에 딱 한번만 실행
			      보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능하다.
			      
			for(int i = 1, j = 0; i < 10; i++){}
			
		조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는 경우 반복 종료한다.
			      조건식을 잘못 설정할 경우, 한 번도 실행 되지 않는 경우가 발생할 수도 있고, 
			      영원히 반복 되는 경우가 발생할 수 있다.
			      
		증감식 : i++ , i-- , i+= 2 (i = i + 2) 

		초기값, 조건식, 증감식 전부 혹은 하나도 생략 가능하다.

			for(;;){} //무한 반복...
			
			
				
			for (int i = 2 ; i <= 9 ; i++) {
				
					for( int j = 1 ; j <= 9  ; j++ ) {
						
						System.out.printf("%d * %d = %d\t", i,j,i*j);
					}
						
				
				System.out.println();
				
			}
		
		구구단. 이중for문은 많이 쓰이기 때문에 아예 외우는 것을 추천
		
	향상된 for 구문 - for each
	
				for (타입 변수명 : 배열 또는 컬렉션) {}
		
*/
	
	
	public static void main(String[] args) {
		
		/* Quiz 1. 1부터 5까지를...
		   1
		   2
		   3
		   4
		   5
		   12345
		*/ 
		
	
//		for (int i = 1 ; i < 6 ; i++) {
//			
//			System.out.println(i);
//			
//		}
//		
//		for (int i = 1; i < 6 ; i++) {
//			
//			System.out.print(i);
//			
//		}
		
		// Quiz 2. 1부터 10까지의 합을 출력하시오.
		// 		     단, 누계 값까지 출력 하시오.
		
		
//		int sum = 0;
//		
//		for(int i = 1 ; i <= 10 ; i++) {
//			
//			//sum = sum + i;
//			System.out.printf("1부터 %d까지의 합: %d%n",i,sum += i);		
//			
//		}
		
		/* Quiz 3.
		   
		   1		10
		   2		9
		   3		8
		   4		7
		   5		6
		   6		5
		   7		4
		   8		3
		   9		2
		   10		1
		   
		 */
		
//		for (int i = 1 , j = 10 ; i <= 10 ; i++, j--) {
//		
//			System.out.printf("%d\t%d%n",i,j); //  \t : 일정 간격(tap) 띄우기
//						
//		}
		
		
		// Quiz 4. 구구단을 출력하세요.
		// 2 * 1 = 2	2 * 2 = 4 ....
		// 3 * 1 = 3
		 
		
//		for (int i = 2 ; i <= 9 ; i++) {
//			
//				for( int j = 1 ; j <= 9  ; j++ ) {
//					
//					System.out.printf("%d * %d = %d\t", i,j,i*j);
//				}
//					
//			
//			System.out.println();
//			
//		}
		// Quiz 5. *을 출력할 라인의 수를 입력하세요 > 
		/*
		   *
		   **
		   ***
		   ****
		 */
		
//		int i = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("*을 출력할 라인의 수를 입력하세요 > ");
//		
//		i = scan.nextInt();
//		
//		for (int j = 0; j < i ; j++) {
//			
//			for (int k = 1 ; k <= i-j ; k++) { // i-j를 j로 바꾸면 정답
//				
//				
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		int[] arr = {1,2,3,4,5};
		
		// 1
		// 2
		// 3
		// 4
		// 5
		
//		int i = arr.length;
//		
//		for (int j = 0 ; j < i ; j++) {
//			
//			System.out.println(arr[j]);
//			
//		}
		
//		for (int j : arr) {
//			System.out.println(j);
//		}
		
		int sum = 0;
		int count = 0;
		
		for (int i : arr) {
			
			System.out.println(i);
			
			sum += i;
			count++;
		}
		
		System.out.println("합계는 " + sum + "입니다.");
		System.out.printf("갯수는 %d개 입니다.",count);
	}
	
}
