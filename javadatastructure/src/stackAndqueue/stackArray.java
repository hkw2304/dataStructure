package stackAndqueue;

import java.util.Arrays;

public class stackArray {
	private int[] arr;
	private int size;
	private int firstPtr;
	private int lastPtr;

	public stackArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.firstPtr = 0;
		this.lastPtr = size - 1;
		arr = new int[this.size];
	}

	public void firstPush(int num) {
		if (firstPtr < size / 2) {
			arr[firstPtr++] = num;
		}
		else
			System.out.println("first 길이초과!!");
	}

	public void lastPush(int num) {
		if(lastPtr >= size / 2)
			arr[lastPtr--] = num;
		else
			System.out.println("last 길이초과!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(arr);
	}
	
}
