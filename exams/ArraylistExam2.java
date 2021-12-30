package exams;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExam2 {
	
	public static void main(String[] args) {
		//긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담아서 출력하자.
		
		final int LIMIT = 10;
		String source ="0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		System.out.println(length);
		
		List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 설정
		
		for(int i = 0 ; i < length ; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else {
				list.add(source.substring(i));
			}
		}
		
		for(int i = 0 ; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		// 단순한게 문자열을 특정 크기 좔라서 출력하려면 charAt(int i)와 for문을 이용하면 된다.
		// 잘라서 담아 놓으면 다양한 작업을 간단하게 처리하면 된다.
		
		// 저장할 요소의 갯수를 고려해서 실제 정할 갯수보다 약간 여유 있는 크기로 하는 것이 좋다.
		// 물론 생성할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나기는 하지만
		// 이 과정에서 많은 처리시간이 소요된다.
		
		
	}
	
	
	





}
