package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];

		System.out.println("오름차순으로 입력");
		System.out.print("arr[0] : ");
		arr[0] = sc.nextInt();
		for (int i = 1; i < arr.length; i++) {
			while (true) {
				System.out.print("arr[" +i  + "] : ");
				arr[i] = sc.nextInt();
				if (arr[i] < arr[i - 1]) {
					System.out.println("오른차순으로 입력");
					arr[i] = sc.nextInt();
				}
				else
					break;
			}
		}
		System.out.print("key : ");
		int key = sc.nextInt();
		
		int index = Arrays.binarySearch(arr, key);
		if(index < 0)
			System.out.println(key + "값이없습니다");
		else
			System.out.println(key + "는 arr[" + index + "]에 있습니다.");
	}
}
