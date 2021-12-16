package controlExam;

import java.util.*;


public class IfExam {
	
/* 제어문 Control Statement - IF, Switch	
		
		코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여 
		일부분은 건너 뛰기도 하고 다시 위에서 부터 내려올 수 있게 제어한다.

			if (score > 60) {
				System.out.println("합격입니다");
			}

 		(90 <= x && x <= 100) 점수 x가 90점 이상 100점 이하 동시 만족하는 조건
  		(x < 0 || x > 100) 점수 x가 0 미만 또는 x가 100 초과 하나만 만족하는 조건
  		(x % 3 == 0 && x % 2 != 0) x가 3의 배수이기는 하지만 2의 배수는 아닌 조건
  		(depar == "영업부" || depar == "기획부") 영어부와 기획부만 조건
  		
  	if - else 구문
  	
  		else는 그 밖의 나머지 모든 것..
  		
  			if (조건식) {
  				true case;
  			} else {
  				else case;
  			}
  		
  	if - else if 구문
  	
  		if - else는 분기가 두 개로 수행되는 구조인 반면,
  		처리해야 할 경우의 수가 세 개 이상이면 else if 구문을 사용한다.
  		조건식을 만족하면 더 이상은 다른 조건식을 확인하지 않는다.
  		
			if (조건식1) {
				true case1;
			} else if (조건식2) {
				true case2;
			} else {
				else case;
			}
			
		같은 내용을 중첩으로 작성하면,
			
			if (조건식) {
				true case1;
			} else {
			
				if (조건식) {
	  				true case;
	  			} else {
	  				else case;
	  			}
	  			 
			}
		
		가능하지만 가독성이 떨어지게 된다.
		
	Switch 구문
	
		if 문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어지게 된다.
		평균적인 처리시간도 항목이 늘어날수록 길어지게 된다.
		이러한 if문과 달리 switch는 보다 간결하고 알아보기 쉽다.
		보통 처리해야 하는 경우의 수가 아주 많을 경우에 switch
		switch로 만든 모든 구문은 if로 구현할 수 있지만 if로 만든 모든 구문을
		switch로 구현할 수는 없다.
		
		1. 조건식을 계산
		2. 조건식을 만족하는 case 문으로 이동한다.
		3. 해당 case문의 구문들을 실행한다.
		4. break 만나기 전 까지는 모든 구문을 전부 실행한다.
		
		*. switch 구문의 조건식의 결과는 정수 또는 문자열이다.
		
*/



	public static void main(String[] args) {
//		
//		int score = 100;
//		
//		if (score > 60) { // 80 > 60 -> true
//			
//			System.out.println("합격입니다");
//			
//		}
//		
//		/**/
	
	
	// Quiz2 점수를 입력 받아 98 이상이면 A+
	//					94 이상이면 A
	//					90 이상이면 A-
	
	
//		int score = 0;
//		char signScore = ' ';
//		char degree =' ';
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("점수를 입력해주세요.");
//		
//		score = scan.nextInt();
//		
//		signScore =(score < 60)? ' ' : (score%10 >= 8)? '+' : (score%10 >= 4)? ' ' : '-';
//		
//		if (score >= 90) {
//			
//			degree = 'A';
//			
//		} else if (score >= 80) {
//			
//			degree = 'B';
//			
//		} else if (score >= 70) {
//			
//			degree = 'C';
//			
//		} else if (score >= 60) {
//			
//			degree = 'D';
//			
//		} else {
//			
//			degree = 'F';
//			
//		}
//		
//		System.out.println("학점은 "+degree+signScore);

		/**/
		
//		# 특정 월을 입력 받아서 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
//		"? 월의 계절은 ? 입니다."
//		조건 : switch 구문의 총 줄의 수는 10줄 이내로 작성하시오.
//		
//		int month = 0;
//		String season = "";
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("지금은 몇 월입니까?");
//		
//		month = scan.nextInt();
//		
//		switch(month){
//			
//			case 3: case 4: case 5: season = "봄"; break;
//				
//			case 6: case 7: case 8:	season = "여름";	break;
//			
//			case 9: case 10: case 11: season = "가을"; break;
//				
//			case 12: case 1: case 2: season = "겨울";break;
//		}
//		
//		System.out.println(month + " 월의 계절은 " + season + "입니다.");
		
	
		
		/**/
		
		
		// Quiz 가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > 1
		// 당신은 가위이고 컴퓨터는 바위입니다.
		// 컴퓨터가 이겼습니다.
		
//		1 < 2 < 3 < 1
		
//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//		
//		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > ");
//		
//		int player = scan.nextInt();
//		int computer = rand.nextInt(3)+3;
//		
//		int result = computer - player;
//				
//		String a = "";
//		
//		switch (result%3) {
//		
//		case 0 : a ="비겼"; break;
//		case 1 : a = "졌"; break;
//		case 2 : a = "이겼"; break;
//				
//		}
//		
//		System.out.println("당신은 "+player+"이고 컴퓨터는 "+(computer-3)+"입니다.");
//		System.out.println("당신이 "+a+"습니다.");
		
		
//		com 1 가위 2 바위 3 보
//		사람
//		1	  0     -1컴       -2사람
//		2	  1사람      0     -1컴
//		3     2컴         1사람      0
//		
//		컴승 -1 2
//		사람 승 -2 1
//		비김  0
//		
		
//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//		
//		int com = rand.nextInt(3);
//		
//		System.out.println(com);
		
		
//		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > ");
//		
//		int player = scan.nextInt();
//		int computer = 1 + rand.nextInt(3);
//		
//		System.out.printf("당신은 {}이고 컴퓨터는 {}입니다.",player,computer);
//		
//		int result = player - computer;
//		
//		switch(result) {
//		
//			case -1 : case 2 : 
//				System.out.println("당신이 졌습니다.");
//			break;
//			case 0 : 
//				System.out.println("비겼습니다.");
//			break;
//			case 1 : case -2 : 
//				System.out.println("당신이 이겼습니다.");
//			break;
//		
//		}
		
		
//		# 주민등록번호를 입력하세요 > 000000-0000000
//		  "당신은 남성입니다."
//		  "당신은 여성입니다."
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 > ");
		
		String a = scan.nextLine();
		
		char gender = a.charAt(7);
		
		System.out.println(gender);
		
		switch (gender) {
	
		case '1' : case '3' : 
			
			System.out.println("당신은 남성입니다.");
			
			break;
			
		case '2' : case '4' :
		
			System.out.println("당신은 여성입니다.");
			
			break;
			
		}
		
		
		
		
		
		
	}
		}
		
		
		
		
	
	

