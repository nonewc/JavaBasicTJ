package matExam;


public class MathExam {
	
/*	
	Math는 기본적인 수학계산에 유용한 메서드들로 구성되어 있다. random() round()...
	Math의 생성자는 접근제어자가 private()이기 때문에 다른 클래스에서는 Math 객체를 생성할 수 없다.
	Math의 메서드는 모두 static > 직접 접근 Math.round()
	
	올림 버림 반올림 round()
	
	
	
*/	
	
	public static void main(String[] args) {
		
//		double val = 90.7552;
//		System.out.println(Math.round(val)); // 반올림
//		
//		System.out.println(val);
//		System.out.println(Math.round(val));
//		System.out.println(Math.ceil(val));//올림
//		System.out.println(Math.floor(val));//버림
//		
//		
//		System.out.println(val);
//		System.out.println(Math.round(val*100)/100); // 소숫점 두자리에서 반올림 하고 싶어서
//		System.out.println(Math.ceil(val*100)/100);
//		System.out.println(Math.floor(val*100)/100);
//		
//		String val2 = String.format("%.2f", val);
//		System.out.println(val2);
		
		double d = Math.random();
		System.out.println(d);
		// random() 0.0 <= d < 1.0, 즉 % 값 형태로 난수를 발생시킨다.
		
		int i = (int)(Math.random() * 10);
		System.out.println(i);
		
		int j = (int)(Math.random() * 100);
		System.out.println(j);
		
		
	}
	

}
