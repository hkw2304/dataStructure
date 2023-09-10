package basic_algorithm;

public class MaxMethod {
	public static int max(int a , int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max(1,2,3) : " + max(1,2,3));
		System.out.println("max(1,3,2) : " + max(1,3,2));
		System.out.println("max(2,1,3) : " + max(2,1,3));
		System.out.println("max(2,3,1) : " + max(2,3,1));
		System.out.println("max(3,1,2) : " + max(3,1,2));
		System.out.println("max(3,2,1) : " + max(3,2,1));
		System.out.println("max(1,1,1) : " + max(1,1,1));
		System.out.println("max(2,2,2) : " + max(2,2,2));
		System.out.println("max(3,3,3) : " + max(3,3,3));
	}
}
