package sort;

import java.util.Random;

public class 낙서장 {
	static int sum = 0;
	public static void main(String[] args) {
		int n = 10;
		int sum = recursive(n);
		System.out.println(sum);
	}

	private static int recursive(int n) {
		// TODO Auto-generated method stub
		
		if(n > 0) {
			recursive(n - 1);
			sum += n;
		}
		return sum;
	}
}
