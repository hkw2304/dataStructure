package array_class;

import java.util.Arrays;

public class CloneArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr.clone();
		
		arr2[3] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
