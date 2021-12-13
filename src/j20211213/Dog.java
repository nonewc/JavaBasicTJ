package j20211213;

public class Dog extends Animal{
	
	
	public Dog() {
		//기본 생성자. default constructor
	}
	
	public void sleep() {
		
		System.out.println(this.name+" zzz");
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		
	}
	
}
