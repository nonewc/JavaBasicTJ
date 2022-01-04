
// 프로젝트명 : project3
// 패키지명 : project3
// 자바파일명 : Project3

package project3;

import java.util.Random;
import java.util.Scanner;

public class Project3 {

	static void computeTraining(int x, int y, int z) { //암산훈련 메서드 구현 시작
		
		Random rand = new Random();		// 난수 생성용 객체 생성
		Scanner scan = new Scanner(System.in);	// 사용자 입력을 받기 위한 객체 생성
		
		char sign1 = ' ';
		char sign2 = ' ';
		int random1 = rand.nextInt(2);
		int random2 = rand.nextInt(2);
		
		int userans = 0;
		int corrans = 0;
		
		sign1 = (random1 == 0) ? '+' : '-';	//계산 부호 결정
		sign2 = (random2 == 0) ? '+' : '-';
		
		if (sign1 == '+') {corrans = x + y;} else {corrans = x - y;}	//정답 값 계산 1
		if (sign2 == '+') {corrans += z;} else {corrans -= z;}	//정답 값 계산 2
		
		while (true) { //반복문 시작
			
			System.out.printf("%d %c %d %c %d = ", x, sign1, y, sign2, z);	// 문제 출력
			
			userans = scan.nextInt();
			
			if (userans == corrans) {
				
				return;	//정답을 입력했으면 리턴
				
			} else {
				
				System.out.println("틀렸습니다!");	// 오답을 입력했으면 오답 출력
				
			}
		}	//반복문 종료
	} // 메서드 구현 끝

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int x = 0;
		int y = 0;
		int z = 0;
		int cont = 1;

		System.out.println("암산 훈련!!!");

		do {
			x = 100 + rand.nextInt(900);	// 세자리 수 출력
			y = 100 + rand.nextInt(900);
			z = 100 + rand.nextInt(900);

			computeTraining(x, y, z);

			System.out.print("다시 한 번?<Yes...1/No...0>:");
			cont = scan.nextInt();

		} while (cont == 1);

		System.out.println("프로그램을 종료합니다.");

	}

}
