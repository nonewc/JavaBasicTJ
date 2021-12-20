package controlExam;

import java.util.*;


public class DowhileExam {
	
/*
	do ~ while
	
		do~while은 while의 변형으로 기본 구조는 같지만
		
		while은 경우에 따라 단 한 번도 실행 되지 않는 경우도 있지만,
		do~while 반드시 한 번은 무조건 실행 되도록 한다.
	 
	이름 붙은 반복문
	
		break 문은 근접한 단 하나의 반복문만 벗어날 수 있다.
		여러개의 반복문이 중첩 된 경우 break 만으로는 완전히 벗어 날 수 없다.
		이름을 붙여주면 완전히 벗어 날 수 있다.

			loop:
			while() {
			
				while() {
				
					break loop;
				
				}
			
			}
		
  
  
*/
	public static void main(String[] args) {
		
//		// 1 ~ 100 사이의 난수를 하나 생성해서 
//		// 1과 100 사이의 정수를 입력하세요 >> 50
//		// 더 작은 값으로 다시 입력하세요 >>
//		// 더 큰 값으로 다시 입력하세요 >>
//		// 정답입니다.
//		
//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//		int ranNum = rand.nextInt(99)+1;
//		int num = 0;
//		int count = 0;
//		
//		System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
//		num = scan.nextInt();
//		count++;
//		
//		do {
//									
//			if(num > ranNum) {
//				
//				System.out.print("더 작은 값으로 다시 입력하세요 >> ");
//				num = scan.nextInt();
//				
//			} else if(num < ranNum) {
//				
//				System.out.print("더 큰 값으로 다시 입력하세요 >> ");
//				num = scan.nextInt();
//				
//			}
//			
//			count++;
//			
//		} while (num != ranNum);
//		
//		System.out.println("정답입니다. 총 시도한 횟수는 "+count+"번 입니다.");
		
		
	/**/
		
		// 369 게임
		// 100 이하에서 3의 배수 일 때 "짝" 을 출력하시오
		
		// 3짝 36 짝짝 99 짝짝
		
//		int i = 1;
//		
//		do {
//					
//			String j = i>10&&(i/10)%3 == 0? "짝" : "";
//			
//			switch (i%10) {
//			case 3: case 6: case 9:
//				
//				System.out.printf("%d %s짝%n",i,j);
//				
//				break;
//
//			default:
//								
//				System.out.printf("%d %s%n",i,j);
//				
//			}
//			
//			i++;
//			
//		} while(i <= 100);
		
//		for (int i = 1; i <= 100 ; i++) {
//	
//			System.out.printf("%d ",i);
//			
//			int tmp = i;
//			
//			do {
//				
//				if (tmp%10%3 == 0 && tmp%10 != 0) {
//					
//					System.out.print("짝");
//					
//				}
//								
//			}while((tmp/=10) != 0);
//			
//			System.out.println();
//		
//		}
		
//			int sum = 0;
//			int i = 0;
//			
//			while(true) {
//				
//				if(sum > 100) {
//					
//					break;
//					
//				}
//				
//				i++;
//				sum += i;
//								
//				System.out.println("i = " + i + " sum = " + sum);
//				
//			}
//			
//			System.out.println("\ni = " + i);
//			System.out.println("sum = " + sum);
		
		
			/**/
		
	
			// 3의 배수만 출력하시오 for continue
		
//			for (int i = 1 ; i <= 100 ; i++) {
//				
//				if (i%3 != 0) {
//					
//					continue;
//					
//				}
//				
//				System.out.println(i);
//				
//			}
		
			/**/
		
			loop:
			for (int i = 2 ; i <= 9 ; i++) {
				
				for (int j = 1 ; j <= 9 ; j++) {
					
					if(j == 5) {
						
						break loop;
						
					}
						System.out.println(i + "*" + j + "=" + i*j);
						
					}
					
					System.out.println();
					
				}
				
			
			
			
		
		
		
		
		
		
		
		
	}	
}
	

