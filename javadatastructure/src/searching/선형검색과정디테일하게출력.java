package searching;

import java.util.Scanner;

public class 선형검색과정디테일하게출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("찾으려는 값 : ");
		int key = sc.nextInt();

		int index = seqSearch(arr, num, key);
		if (index == -1) {
			System.out.println("\t찾으려는 값이 없습니다.");
		} else
			System.out.println(key + "값은 arr[" + index + "]번쨰 있습니다.");
	}

	private static int seqSearch(int[] arr, int num, int key) {
		// TODO Auto-generated method stub
		int k= 0;
		System.out.print("\t|\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n--------+-------------------------------------");
		
		while (k < arr.length) {
			System.out.print("\t");
			for(int j = 0; j < arr.length; j++) {
				System.out.print("\t");
				if(j == k) {
					System.out.println("*\t");
					break;
				}
			}
			for (; k < arr.length;) {
				System.out.print(k + "\t");
				break;
			}
			 k++;
			for (int i = 0; i < arr.length; i++) {
				System.out.print("\t" + arr[i]);
			}
			System.out.println();
			for(int i = 0; i < k; i++) {
				if(arr[i] == key) {
					return i;
				}
			}
			
		}
		return -1;
		
	}
}
