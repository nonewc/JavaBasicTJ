package j20211213;

public class MethodExam {
	
	
	//1. 입력과 출력이 모두 있는 메서드 (일반적인 형태)
	public int sum(int a, int b) {
		return a+b;
	}
		
	
		

	//2. 입력과 출력이 모두 없는  메서드 (일반적)
			public void noino() { 
			
			System.out.println("no lnput no ouptput");
			}
		
	//3.input만 있는 메서드
		
		public void onlyInput(String a) {
			
			System.out.println(a);
		}
	
		
		
		
	//4. output만 있는 메서드
			
		
		public String onlyOutput() {
			return "hi";
		}
			
		
		
	//* 리턴의 다른 사용법
		public void sayNick(String nick) {
			if ("fool".equals(nick)){
				return;
			
			}
			
			System.out.println("my nick name is "+ nick);
		}
			
			
			
		public static void main(String[] args) {
			MethodExam inandout = new MethodExam();
//			System.out.println(inandout.sum(3, 4));
//			inandout.noino();
//			inandout.onlyInput("Hello World");
//			System.out.println(inandout.onlyOutput());
			inandout.sayNick("fool");
			inandout.sayNick("austin");
			
		}
		
		
		
		
		
		
		
	}


