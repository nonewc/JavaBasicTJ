package oopExam;

class Time {
	
	private int hour, minute, second;
	// 모든 멤버 변수의 접근 제어자는 private으로 하여 외부에서는 직접 변수를 조작하지 못하도록 하고
	// 이 것을 다루기 위한 메서드들은 모두 public으로 하여 반드시 메서드를 통해서만 변수에 접근하도록 한다.
	// 메서드를 통한 접근만 허용한다.
	
	Time(int hour,int minute, int second){
	// 생성자에도 접근 제어자를 사용하면 객체 생성을 제한할 수 있다. 
	// 보통 생성자의 경우는 클래스의 접근 제어자와 같게 설정하지만 다르게 설정할 수도 있다.
	// 생성자의 접근 제어를 통해 객체 생성을 제한하면 객체의 갯수를 제한 할 수 있다.
		
	// 생성자가 private인 클래스는 다른 클래스의 조상이 될 수 없다.
	// 왜냐하면 자식 클래스의 객체를 생성할 때 조상 클래스의 생성자를 호출해야 하는데 
	// 생성자가 private이면 자식클래스가 호출하는 것이 불가능하기 때문이다.
 		
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		
	}
	
	public int getHour() {
		
		return hour;
		
	}
	
	public void setHour(int hour) {
		
		if (hour < 0 || hour > 23) {
			
			return;
			
		}
		
		this.hour = hour;
		
	}
	
	public int getMinute() {
		
		return minute;
		
	}
	
	public void setMinute(int minute) {
		
		if (minute < 0 || minute > 59) {
			
			return;
		
		}
		
		this.minute = minute;
		
	}
	
	public int getSecond() {
		
		return second;
		
	}
	
	public void setSecond(int second) {
		
		if (second < 0 || minute > 59) {
			
			return;
			
		}
		
		this.second = second;
	}
		
	
	
		
}




public class ModifierExam {

/*
 	접근 제어자 
 	
 			public > protected  > (default) > private
 			
 			접근 제어자는 한 번에 네 가지 중 하나만 선택하여 사용할 수 있다.
 			
   	제어자 
   	
   			static final abstract ...
      
	static
	
		'클래스의...', '공통적인...' 의 의미를 가진다
		객체 변수는 개체들마다의 고유한 값을 따로 유지하지만
		static은 객체에 관계 없이 같은 값을 유지한다.
		즉, 하나의 변수를 모든 객체가 공유한다.
	
	final
	
		'마지막의...', '변경 될 수 없는...'
		final을 선언하여 변수를 만들면 그 값을 변경할 수 없는 상수가 된다.
		final을 선언하여 메서드를 만들면 오버라이딩을 할 수 없게 된다. 
		final을 선언하여 클래스를 만들면 상속을 허용하지 않는 클래스가 된다.
		
			final class FinalTest{ 			// 조상이 될 수 없는 클래스
				final int MAX_SIZE = 10;	// 값을 변경할 수 없는 변수 = 상수
				final void getMaxSize(){	// 오버라이딩 금지 메서드
				}
			}
			

 	public > protected  > (default) > private
 	
 			private - 같은 클래스 안에서만 접근이 가능하다.
 			default - 같은 패키지 내에서만 접근이 가능하다.
 			protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
 			public - 접근 제한이 전혀 없다.
 	
 		만약 메서드 하나를 변경해야 할 때 이 메서드의 접근 제어자가 public이라면
 		메서드를 변경한 후에 오류가 없는지 테스트 해야 하는 범위가 아주 크다.
 		그런데 만약 default라면 패키지 내부에서만 접근이 가능하므로 그 패키지 내의 클래스들만 테스트 하면 된다.
 		만약 private이라면 해당 클래스만 확인해 보면 된다.
 		따라서 접근 제어자 하나로 상당한 차이를 만들 수 있으므로 
 		접근 제어자를 적절하게 선택하여 접근 범위를 최소화를 위해 노력하자.
 			
	생성자의 접근 제어자
	
		생성자에 접근제어자를 사용하면 객체 생성을 제한할 수 있다.
		생성자에 private을 지정하면 외부에서 생성자에 접근할 수 없다.
		클래스 내부에서만 객체를 생성할 수 있다.
		
		
			
			
		
   
   
   
  	
 */
	
	

	public static void main(String[] args) {
		
		
		Time t = new Time(10,1,1);
		System.out.println(t);
		
		//t.hour = 13; // 변수 hour의 접근 제어자가 private 이므로 직접 접근은 불가능하다.
		
		t.setHour(t.getHour()+1); 
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		
		
	}
	
}
