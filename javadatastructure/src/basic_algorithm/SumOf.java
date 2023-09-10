package basic_algorithm;

public class SumOf {
	public static void main(String[] args) {
		System.out.println("두 정수 사이의 합(2, 10) : " + sumOf(10,1));
	}

	private static int sumOf(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		else if(b > a) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}
		else
			sum = a;
		return sum;
	}
}
