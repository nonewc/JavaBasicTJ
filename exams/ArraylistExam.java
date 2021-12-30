package exams;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExam {
	
	static void print(List a, List b) {
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		System.out.println(list1.containsAll(list2));
		print(list1,list2);
		list2.add("B");
		list2.add("C");
		list2.add("A");
		
		System.out.println(list1.containsAll(list2));
		print(list1, list2);
		
		
		//list2에서 list1에 있는 객체들을 삭제
		for (int i = list2.size()-1 ; i >= 0 ; i --) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			
		}
		
		
		
	}
	
	
	
	

}
