package functionExam;

public class StringExam {

/*
		다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열 클래스를 별도로 제공한다.
		String 클래스는 문자열을 다루는데 필요한 메서드들을 함께 제공한다.
		
	1. immutable 클래스(변경 불가능)
	
		한 번 생성한 String은 읽어 올 수만 있고 변경할 수 없다.
		만약 + 연산자를 이용해서 문자열을 결합하는 경우
		문자열 자체가 바뀌는 것이 아니라 결합된 새로운 문자열이 생성되는 것이다.
		
			String a = "a";
			String b = "b";
			String a = a + b;
			
			연산시마다 새로운 문자열을 가진 String 객체가 생성되어 메모리 공간을 차지하게 된다.
			가능한 한 결합 횟수를 줄이는 것이 좋다.
		
		문자열 간의 결합 추출 등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 
		사용하는 것이 좋다.
		
		String 문자열의 비교는 언제나 a.equals(b)를 사용한다.
	
		빈 문자열
		
		String s = ""; // 참조변수 s가 참조하고 있는 String 객체는
						     내부에 new char[0]과 같이 길이가 0인 char형 배열을 저장하고 있는 것과 같다.
		
			char[] chArr = new char[0]; // 길이가 0인 char 배열
			char c = ''; //char형 변수는 반드시 하나의 문자열을 지정해야만 한다.
		
		
	
	
	
	
	
*/	
	
	public static void main(String[] args) {
		
//		char[] cArr = new char[0];
//		String s = new String(cArr); // String s = new String("")
//		
//		System.out.println(cArr.length);
//		System.out.println("@@@"+ s + "@@@");
		
		/**/
		
//		String a = new String("Hello"); // 주어진 문자열로 객체 생성
//		
//		char[] b = {'h','e','l','l','o'};
//		
//		String c = new String(b);
//		
//		System.out.println(c);
		
		/**/
		
//		// charAt() 지정된 위치;index 에 있는 문자를 반환 (0부터 시작)
//		
//		String d = "Hello";
//		String e = "012345";
//		char f = d.charAt(2);
//		char g = e.charAt(2);
//		System.out.println(f);
//		System.out.println(g);
		
		/**/
		
		// compareTo() 비교해서 같으면 0, 이전이면 -1, 이후면 1로 반환
		
//		int i = "a".compareTo("a");  // 0
//		int i2 = "a".compareTo("b"); // -1
//		int i3 = "b".compareTo("a"); // 1
//				
//		System.out.println(i);
//		System.out.println(i2);
//		System.out.println(i3);
		
		/**/
		
		// concat() 문자열들을 붙인다.
		
//		String h = "Hello";
//		String k = "World";
//		String l = h.concat(k);
//		
//		System.out.println(l);
		
		/**/
		
		// contains() 문자열이 포함되었는지 검사
		
//		String z = "abcdefg";
//		boolean y = z.contains("bc");
//		
//		System.out.println(y);
		
		/**/
		
		// endsWith() 지정된 문자열로 끝나는지 검사
		
		String ab = "Hello.txt";
		boolean aa = ab.endsWith(".txt");
		
		System.out.println(aa);
		
		
		
	}
	
	
	
}
