package searching;

import java.util.Scanner;

public class 이진검색퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
			while (i > 0) {
				if (arr[i] < arr[i - 1]) {
					System.out.println("다시 입력!!!!");
					System.out.print("arr[" + i + "] : ");
					arr[i] = sc.nextInt();
				} else
					break;
			}
		}
		System.out.print("key : ");
		int key = sc.nextInt();

		int index = binSearchX(arr, key);
		System.out.println(index);
	}

	private static int binSearchX(int[] arr, int key) {
		// TODO Auto-generated method stub
		int lastIndex = arr.length - 1;
		int centerIndex = lastIndex / 2;

		while (centerIndex > -1 && centerIndex < lastIndex + 1) {
//		if(arr[centerIndex] == key)
//			for(int i = 0; i <= centerIndex; i++) {
//				if(arr[i] == key)
//					return i;
//			}
			if (arr[centerIndex] <= key) {
				for (int i = centerIndex; i < arr.length; i++) {
					if (arr[i] == key)
						return i;
					centerIndex++;
				}
			} else if (arr[centerIndex] >= key) {
				for (int i = 0; i <= centerIndex; i++) {
					if (arr[i] == key)
						return i;
					centerIndex--;
				}
			}

			
		}
		return -1;
	}
}
