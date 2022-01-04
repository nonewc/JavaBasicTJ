/*	프로젝트명 : project2
 * 	패키지명 : project2
 *  자바파일명 : Project2.java
 *  
 */


package project2;

import java.util.Scanner; // 스캐너 사용을 위한 설정

public class Project2 {
	
	static int[] arrayIdx(int[] a, int x){ // arrayIdx 메서드 구현
	    
	    int count = 0; //배열 크기를 정하기 위한 변수 설정

	    for (int item : a){
	      if(item == x){
	        count++;	//count 변수 크기 설정
	      }
	    }

	    int [] res = new int[count]; // 배열 생성
	    count = 0;	//카운트 초기화

	    for (int i = 0; i < a.length ; i++){
	      if(a[i] == x){
	        res[count] = i;
	        count++;
	      }
	    }

	    return res; //결과 리턴
	  }
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int num = 0;
	    int value = 0;
	    
	    System.out.print("요소 수 : ");	//프롬프트 출력
	    num = scan.nextInt();	//콘솔로 사용자의 입력 받음
	    int[]x = new int[num];	//배열 생성

	    for (int i = 0 ; i < x.length ; i++){

	      System.out.printf("x[%d]:",i);
	      x[i] = scan.nextInt();
	      
	    }

	    System.out.print("탐색할 값:");
	    value = scan.nextInt();

	    int[] res = arrayIdx(x, value);

	    System.out.println("일치하는 요소의 인덱스");
	    for (int item : res){

	      System.out.println(item);	//결과 출력

	    }
		
		
		
	}

}
