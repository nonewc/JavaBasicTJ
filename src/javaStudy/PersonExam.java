package javaStudy;

public class PersonExam {
	
	public static void main(String[] args) {
		
		Person person = new Person("사람", 25); 
		
		// Person 클래스(설계도)를 이용해 person 이라는 객체 생성
		// 이 때, Person 생성자로 인해 반드시 int 인수를 넣어줘야 함.
		
		System.out.println(person.name);
		System.out.println(person.age);
		
		
	}
	

}
