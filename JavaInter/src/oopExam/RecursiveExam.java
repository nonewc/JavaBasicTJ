package oopExam;

public class RecursiveExam {

	/*
	 * 재귀 호출 recursive call
	 * 
	 * 메서드 내부에서 자기 자신 메서드를 다시 호출 무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다. 따라서 조건문을 통한 탈출이
	 * 필수적으로 따라다닌다.
	 * 
	 * void method(int n) {
	 * 
	 * if(n == 0){ return; }
	 * 
	 * System.out.println(n); method(--n);
	 * 
	 * }
	 * 
	 * 반복문은 깊은 문장을 반복해서 수행하지만 재귀 호출은 반복문보다 몇 가지 과정 예를 들면 매개변수 복사 종료 후 복귀할 주소 저장 등등
	 * 내부적으로 추가로 필요한 것들이 많아서 일반적으로 반복문모다 재귀호출이 수행시간이 더 오래 걸린다.
	 * 
	 * 왜 굳이 반복문 대신 재귀를 사용할까... 큰 이유는 재귀의 논리적 간결함이다.
	 * 
	 * 재귀 호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 충분히 큰 경우에만 사용할 것을 권장한다.
	 * 
	 * 5! = 5*4*3*2*1 3! = 3*2*1
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

//		System.out.println(recursiveExam.facfor(5));
//		System.out.println(recursiveExam.facfor(5));

		// x^1 부터 x^n의 합을 구하는 재귀 메서드
		System.out.println(RecursiveExam.powRecur(2, 5));

	}

	static int facfor(int x) {

		int sum = 1;

		for (int i = 0; i < x; i++) {

			sum = sum * (x - i);
			System.out.println(sum);

		}

		return sum;
	}

	static int facrecur(int n) {

		int result = 1;

		if (n == 1)
			result = 1;
		else
			result = n * facrecur(n - 1);
		// 5 * 4 * 3 * 2 * 1

		return result;
	}

	// x^1 부터 x^n의 합을 구하는 재귀 메서드
	
	static int power(int x, int i) {
		
		if (i==1) return x;
		return x *power(x,i-1);
		
	}
	
	static int powRecur(int x, int n) {

		int result = 0;

		if (n == 1) {
			
			result = x;
			
		} else {
			
			result = power(x,n) + powRecur(x, n - 1);

		}

		System.out.println(result);

		return result;
	}

}
