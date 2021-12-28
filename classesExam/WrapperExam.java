package classesExam;

public class WrapperExam {

/*	
	포장 클래스; wrapper class
	
		매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체를 저장해야 할 때, 객체 간의 비교가 필요할 때...
		8개의 기본형을 대표하는 8개의 WrapperClass를이용하면 기본형 값을 객체 형태로 다룰 수 있다.
	
		
				기본형		WrapperClass
				
				boolean 	Boolean			Boolean b = new Boolean(true);
				char		Character		Character c = new Character('a');
				byte		Byte			
				short		Short
				int			Integer			Integer i = new Integer(100); 
				long		Long			//Integer i = new Integer("100"); 가능
				float		Float			
				double		Double			Double d = new Double(3.14);
											//Double d = new Double("3.14"); 가능
	
*/	
	

	
	public static void main(String[] args) {
		
//		Integer i1 = new Integer(100);
//		Integer i2 = new Integer(100);
//		
//		System.out.println(i1 == i2); // 주소를 비교한다.;false
//		System.out.println(i1.equals(i2)); // equals는 값만 비교한다.;true
//		System.out.println(i1.toString() == i2.toString()); // 값만 비교해도 주소는 다르다.;false
//		
//		// Wrapper Class 들은 모두 equals()가 오버라이드 되어 있어서 주소 값이 아닌 객체가 가지고 있는 값을 비교한다.
//		// toString()도 오버라이딩 되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환한다.
	
		int i1 = new Integer("100").intValue();
		
		
		int i2 = Integer.parseInt("100"); // 주로 사용되는 방법
		int i3 = Integer.valueOf("100");
		
		// 둘다 문자를 숫자로 바꿔주는 일을 하지만 전자는 반환값이 기본형
		// 후자는 반환값이 WrapperClass 타입이라는 차이가 있다.
		
		// JDK 1.5부터 도입된 오토박싱 autoboxing 기능 때문에
		// 반환값이 기본형일 때와 WrapperClass일 때의 차이가 없어졌다.
		// 성능은 valueOf가 좀 느리다.
		
		
		
		
		
		
		
		
		
	}
	
	
}
