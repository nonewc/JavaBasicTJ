package operatorExam;

import java.util.Scanner;

public class OperatorExam {
	
/* 연산자 Operator
  
 		연산자는 '연산을 수행하는 기호' + - * / ...
 		
 		연산자는 연산을 수행하는 기호이며 파연산자는 작업 대상
 		연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
 		(연산 대상, 변수, 상수, 수식 ... )
			 		
			   연산자 
			 x + 3	식
			x,3이 피연산자
 		
 		연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라하고 
 		그 식을 계산하여 결과를 얻는 것을 '평가 evaluation'이라고 한다.
 		
 	연산자의 종류
 	
 		- 산술연산자 : + - * / % (나머지 연산자:홀 짝 배수)
 		- 비교연산자 : > < <= >= == !=
 		- 대입연산자 : =
 		- 논리연산자 : || && | &
 		- 기타연산자 : 삼항연산자 (if 없이 조건문)
 		
 		피연산자의 갯수에 따라 ...
 	
 		   단항 연산자
 		   이항 연산자
 		   삼항 연산자 (조건식) ? true : false;
 	
 	연산자의 우선순위
 	
 		일반 수학 계산 순서와 동일하게 상식적인 선에서 해결된다.
 		곱셈이 덧셈보다 먼저 수행, 괄호 안의 값을 먼저 계산
 		
 			   5 + 3 * 4
 			1) 3 * 4 = 12
 			2) 5 + 12 = 17
 			
  	단항 연산자
  	
  		증가 연산자 ++ : 피연산자의 값은 1 증가 시킨다.
  		증감 연산자 -- : 피연산자의 값을 1 감소 시킨다.
  		
  		i++; 값이 먼저 참조 되고나서 증가, 후위형
  		++i; 값이 먼저 증가 하고나서 참조, 전위형
  		
  		단항 연산자 하나만 단독으로 사용 될 때에는 차이가 없다.
  		
  	나머지 연산자 %
  	
  		나머지 연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 
  		그 나머지만 결과로 반환하는 연산자. 
  		나머지 연산자는 홀수, 짝수, 배수 검사에 엄청 아주 많이 사용된다.

 	등가비교 연산자 == !=
 	
 		두 개의 피연산자의 값이 같은지 == 또는 다른지 != 를 비교하여 
 		== 같으면 true 다르면 false 
 		!= 다르면 true 같으면 false
 		
 	문자열 비교 .equals()
 	
 		문자열을 비교 할 때에는 == 를 쓰지 말고 반드시 .equals()를 사용하자.

*/
	
	public static void main(String[] args) {
		
		/* 단항 연산자를 단독으로 사용할 때에는 전위 후위 차이가 없다. */
		
//		int i = 5;
//		i++;
//		System.out.println(i);
//		
//		i = 5;
//		++i;
//		System.out.println(i);

		/**/
		
//		int i = 5, j = 0;
//		j = i++;
//		
//		System.out.println("j=i++ 실행후, i="+i+" j="+j);
//		
//		i = 5;
//		j = 0;
//		j = ++i;
//		
//		System.out.println("j=i++ 실행후, i="+i+" j="+j);
		
		/**/
		
//		int i = 5, j = 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		
//		System.out.println("i="+i+" j="+j);
		
		/**/

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력해주세요.");
//		int i = 0;
//		i = sc.nextInt();
//		
//		if (i%2 == 0) {
//			
//				System.out.println("입력하신 수 "+i+"는 짝수입니다.");
//				
//		} else if (i%2 == 1) {
//			
//			System.out.println("입력하신 수 "+i+"는 홀수입니다.");
//
//		}
				
//		int x = 10, y = 7;
				
//		System.out.printf("x를 2로 나눈 나머지는 %d입니다.%n", x%2);
//		System.out.printf("y를 2로 나눈 나머지는 %d입니다.%n", y%2);
//		System.out.printf("x를 5로 나눈 나머지는 %d입니다.%n", x%5);
//		
//		System.out.printf("%d 을 %d 로 나누면%n",x, y);
//		System.out.printf("몫은 %d, 나머지는 %d 입니다.%n", x/y, x%y);
		
		/**/

//		System.out.println(1 == 0);
//		System.out.println(1 != 0);
		
		/**/
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		//str1 과 str3가 가르키는 메모리 주소가 같다. str2른 다름
		// == 같은 메모리 주소인지를 판별
		// .equals는 글자가 같은지를 판별
		
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc"); // \"  == " (글자)
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc"); // true 
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc"); // false
		// 글자 비교할 땐 == 쓰지 말고

		System.out.println();
		
		System.out.printf("\"abc\".equals(\"abc\") ? %b%n", "abc".equals("abc")); 
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // true 
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // true
		// .equals 써라
				
		System.out.println();
		
		System.out.printf("str1 == str3 ? %b%n", str1 == str3); // true
		System.out.printf("str2 == str3 ? %b%n", str2 == str3); // false
		
		System.out.println();
		
		System.out.printf("str1.equals(str3) ? %b%n", str1.equals(str3)); // true 
		System.out.printf("str2.equals(str3) ? %b%n", str2.equals(str3)); // true
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		
			}
			
		
		
		
		
		
		
	}


