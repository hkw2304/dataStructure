package array_class;

import java.util.Random;

public class MakeArray {
	Random r = new Random();
	int[] arr;
	
	public int[] makeArray(int size) {
		arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = r.nextInt(50);
		}
		return arr;
	}
	public int[] reverse(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		int size = array.length - 1;
		for(int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[size];
			array[size] = temp;
			size--;
		}
		return array;
	}
	public int arrSum(int[] array) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int a : array) {
			sum += a;
		}
		return sum;
	}
}
