package home2;

import java.util.Scanner;

public class JavaHome2 {
	
	
	public static void main(String[] args) {
		
		int[] arr = {17,28,31,5,7};
		int max = arr[0];
		
		
		for (int i = 1 ; i < 5 ; i++) {
			
			if(arr[i] > max) {
				
				max = arr[i];
				
			}
			
		}
		
		System.out.println("max : "+max);
		
	}

}
