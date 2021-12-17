package home2;

public class JavaHome4 {
	
	static int[] arr = {11,13,17,19,23,29,31};
	
	
	public int binarySeach(int key, int head, int tail) {
		
		int center = 0;
		
		while(head <= tail) {
			
			center = (head + tail)/2;
		
			if(arr[center] == 17) {
				
				return center;
			
			} else if (key < arr[center]) {
				
				tail = center + 1;
				
			} else {
				
				head = center - 1;
				
			}
				
				
		return -1;
	}
	
	
	
	public static void main(String[] args) {

		int a = binarySeacrh(17, 0, arr.length-1);
		
		if ( a == -1) {
			
			System.out.println("찾지 못했습니다.");
			
		} else {
			
			System.out.println();
			
		}
		
		
		
	}

}
