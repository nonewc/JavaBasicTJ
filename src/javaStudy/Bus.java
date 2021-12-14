package javaStudy;

public class Bus extends Car {
	
	
	public Bus(String name, int number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}


	public void ppangppang() {
		
		System.out.println("PPANG PPANG !!!");
		
	}
	
	
	public static void main(String[] args) {
		
		Bus bus = new Bus("",0);
		
		bus.run();
		bus.ppangppang();
		
	}
	
	

}
