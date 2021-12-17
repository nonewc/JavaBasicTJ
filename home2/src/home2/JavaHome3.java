package home2;

public class JavaHome3 {

	public static void main(String[] args) {
	
		int[] arr = {3,4,1,5,2};
		
		for(int i = 0 ; i < 5 ; i++) {
			
			
			if(arr[i] == 5) {
				
				System.out.printf("%d 번째 요소가 일치",i+1);
				break;
				
			} else if(i >= 4) {
				
				System.out.println("찾지 못했습니다.");
				
			}
			
		}
						
	}
			
}
	

