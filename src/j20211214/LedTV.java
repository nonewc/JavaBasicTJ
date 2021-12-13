package j20211214;

public class LedTV implements TV{
	
	// LedTV 클래스는 TV인터페이스를 구현했다.
	// TV 인터페이스에 정의된 메서드 들을 모두 구현해야만 한다.
	
	// @_______ annotation 애너테이션
	// 확인 요청, 필수는 아닌 선택
	
	@Override 
	public void turnOn() {
		
		System.out.println("TV on");
		
	}
	
	@Override 
	public void turnOff() {
		
		System.out.println("TV off");
		
	}
	
	@Override 
	public void changeVolume(int volume) {
		
		System.out.println("Volume change");
		
	}
	
	@Override 
	public void changeChannel(int channel) {
		
		System.out.println("Channel change");
		
	}

}
