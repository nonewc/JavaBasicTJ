package inter;

public class ZooKeeper {
	
	
	public void feed(Predator predator) {
		
		System.out.println("feed " + predator.getFood());
		
	} // 인터페이스 활용
	
	
	 // 객체가 한 개 이상의 자료형 타입(tiger, lion, donkey)을 갖게 되는 특성을 "다형성" 
//	public void feed(Tiger tiger) {
//	
//		System.out.println("feed apple");
//		
//	}
//	
//	public void feed(Lion lion) {
//		
//		System.out.println("feed banana"); //메서드 오버로딩
//		
//	}
//	
//	public void feed(Donkey donkey) {
//		
//		System.out.println("feed carrot");
//		
//	}
	

	public static void main(String[] args) {
		
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Donkey donkey = new Donkey();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(donkey);
		
		
		
	}

}
