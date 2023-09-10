package array_class;

public class ArraySumForInfo {
	public static void main(String[] args) {
		double[] arr = {1.0,2.0,3.0,4.0};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("a[" + i + "] = " + arr[i]);
		}
		double sum = 0;
		for(double a : arr) {
			sum += a;
		}
		System.out.println("모든 요소의 합 : " + sum);
	}
	
}
