package operatorExam;

import java.util.Scanner;

public class TriExam {
	
/* 삼항 연산자 (조건)
 
 			(조건식) ? true : false
 			
		첫 번째 피연산자 조건식의 평가 결과에 따라
		true면 두 번째 항
		false면 세 번째 항의 값이 결과가 된다. 
		조건식의 괄호는 필수는 아니다.
 
 			if(조건식){
 				true;
 			} else {
 				false;
 			}
 		
 		

 			
 			(조건식1) ? "A" : (조건식2) ? "B" : (조건식3) ? "C" : "D"
 			
 			if(조건식1){
 				"A";
 			} else if (조건식2) {
 				"B";
 			} else if (조건식3 {
 				"C";
 			} else {
 				"D";
 			}
 		
 		여러번 중첩하면 가독성이 떨어지므로 꼭 필요한 경우에만 사용한다.
 
 */
	
	public static void main(String[] args) {
		
		
		// Quiz 1 삼항 연산자를 사용하여 
		// 100점 미만 90 점 이상이면 "A"
		// 90점 미만 80점 이상이면 "B"
		// 80점 미만 70점 이상이면 "C"
		// 나머지 전부는 "D"
	
//		Scanner sc = new Scanner(System.in);
//		
//		int score = 0;
//		String degree = "";
//		
//		System.out.println("점수를 입력하시오.");
//		
//		score = sc.nextInt();
//		
//		
//		
//		//System.out.println((90 <= score)? "A" : (80 <= score)? "B" : (70 <= score) ? "C" : "D");
//		degree = (90 <= score)? "A" : (80 <= score)? "B" : (70 <= score) ? "C" : "D";
//		
//		System.out.println(degree);
		
		int x, y, z;
		int absX, absY, absZ; // abs = 절댓값 약어 (absolute)
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : x == 0 ? ' ' : '-';
		signY = y > 0 ? '+' : y == 0 ? ' ' : '-';
		signZ = z > 0 ? '+' : z == 0 ? ' ' : '-';
		
		
		System.out.printf("x = %c%d%n",signX,absX);
		System.out.printf("y = %c%d%n",signY,absY);
		System.out.printf("z = %c%d%n",signZ,absZ);
	}
	
}
