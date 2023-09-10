package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsectionSort2 {
	static int count = 0;
	static int exchange = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) 
			arr[i] = r.nextInt(10);
		
		
		System.out.println(Arrays.toString(arr));
		Insection(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count + "////" + exchange);
	}
	private static void Insection(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				count++;
				if(arr[i] < arr[j]) {
					Sort(arr, i, j);
					System.out.println("===================");
					System.out.println(Arrays.toString(arr));
					System.out.println("===================");
				}
			}
			
		}
		
	}
	private static void Sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		exchange++;
		int temp = arr[i];
		
		for(int k = i; k > j; k--) {
			arr[k] = arr[k - 1];
		}
		arr[j] = temp;
		
	}
}
