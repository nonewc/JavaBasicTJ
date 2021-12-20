package arrayExam;

import java.util.Arrays;

public class ArrayExam {

	/*
	 * array 배열
	 * 
	 * 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 방식 배열은 생성시 정한 갯수를 수정할 수 없다. 기본적으로 배열은 0으로 초기화 되어
	 * 생성 된다.
	 * 
	 * int[] score = new int[5]; String[] name = new String[5];
	 * 
	 * 배열의 길이를 수정하는 방법 1. 더 큰 배열을 새로 생성한다. 2, 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.
	 * 
	 */

	public static void main(String[] args) {

//		int[] score = new int[5];
//		
//			score[0] = 10;
//			score[1] = 20;
//			score[2] = 30;
//			score[3] = 40;
//			score[4] = 50;
//			
//		for (int i = 0 ; i < 5 ; i++ ) {
//			
//			System.out.println(score[i]);
//			
//		}
//		
//		/**/
//		
//		for (int i = 0 ; i < score.length ; i++) {
//			
//			System.out.println(score[i]);
//			
//		}
//		
//		int [] math = new int[5];
//		
//		for (int j = 0 ; j < math.length ; j++) {
//			
//			math[j] = j * 10 + 50; 
//			
//		}
//		
//		for (int j = 0 ; j < math.length ; j++) {
//			
//			System.out.println(math[j]);
//			
//		}

		/**/

//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			arr[i] = i + 1;
//
//		}
//
//		System.out.println("배열 수정 전");
//
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println("arr[" + i + "] = " + arr[i]);
//
//		}
//
//		int[] tmp = new int[arr.length * 2];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			tmp[i] = arr[i];
//
//		}
//
//		System.out.println("배열 수정 후 tmp");
//
//		for (int i = 0; i < tmp.length; i++) {
//
//			System.out.println("tmp[" + i + "] = " + tmp[i]);
//
//		}
//
//		arr = tmp;
//
//		System.out.println("배열 수정 후");
//
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println("arr[" + i + "] = " + arr[i]);
//
//		}

		/**/
		
//		char[] abc = {'A','B','C','D'};
//		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
//		
//		System.out.println(abc);
//		System.out.println(num);
//		
//		// 두 개의 배열을 붙여서 하나의 배열
//		
//		char[] result = new char[abc.length + num.length];
//		
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.out.println(result); // ABCD
//		
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result); // ABCD0123456789
//		
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num); // ABCD456789
//	
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num); // ABCD45ABC9
//		
		
		/**/
		
		//학생 5명의 총점 합계 점수와 평균을 구하시오
		// 총점 :
		// 평균 :
		
//		double sum = 0;
//		int[] score = {100,88,98,90,96};
//		
////		for (int i = 0 ; i < score.length ; i++) {
////			
////			sum = sum + score[i];
////						
////		}
//		
//		for (int item: score) {
//			
//			sum += item;
//			
//		}
//		
//		System.out.printf("총점 : %.0f%n평균 : %.1f",sum,(sum/score.length));
		
		
		/**/
		
//		//최대값 :
//		//최소값 :
//		
//		int[] score = {78,88,98,90,96,67,65,87};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for (int item : score) {
//			
//			if (max < item) {
//				max = item;
//			} else if (min > item) {
//				min = item;
//			}
//			
//		}
//		
//		System.out.printf("최대값 : %d%n최소값 : %d",max,min);
//		
////		for (int i = 1 ; i < score.length ; i++) {
////			
////			if(score[i] >= max) {
////				
////				max = score[i];
////				
////			}
////			
////			if(score[i] <= min) {
////				
////				min = score[i];
////				
////			}
////			
////		}
////			System.out.printf("최대값 : %d%n최소값 : %d",max,min);
		
		//순서 뒤집기
		
		int[] score = {78,88,98,90,96,67,65,87};
		int[] temp = new int[score.length];
		
		for(int i = 0 ; i < score.length ; i++) {
			
			temp[i] = score[score.length-1-i];
			
		}
		
		score = temp;
		
		System.out.println(Arrays.toString(score));
				
		for(int item:score) {
			
			System.out.print(item+" ");
			
		}
		
	}

}
