package j20211213;

import java.util.Scanner;

public class forExam {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int lines = 0;
		
		System.out.println("Lines ?");
		lines = scan.nextInt();
		
		for (int i = 0 ; i < lines ; i++ ) {
			
			for(int j = 0; j < lines; j++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
	}
	
}
