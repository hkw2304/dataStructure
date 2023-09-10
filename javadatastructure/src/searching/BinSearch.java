package searching;

import java.util.Scanner;

public class BinSearch {
	public static void main(String[] args) {
//		이진검색 : 정렬이 된 배열에서 검색
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("arr[0] : ");
		arr[0] = sc.nextInt();

		for (int i = 1; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
			while (true) {
				if (arr[i] > arr[i - 1]) {
					break;
				} else {
					System.out.println("다시 입력");
					System.out.print("arr[" + i + "] : ");
					arr[i] = sc.nextInt();
				}
			}
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int index = binSearch(arr, num, key);
		
		if(index == -1) {
			System.out.println("없는 요소입니다.");
		}
		else
			System.out.println("그 값은 arr[" + index + "]번째 있습니다.");
	}

	private static int binSearch(int[] arr, int num, int key) {
		// TODO Auto-generated method stub
		int centerAfterIndex = 0;
		int centerBeforeIndex = num - 1;
		
		while(centerAfterIndex <= centerBeforeIndex) {
			int centerIndex = (centerAfterIndex + centerBeforeIndex) / 2;
			if(arr[centerIndex] == key)
				return centerIndex;
			else if(arr[centerIndex] < key)
				centerAfterIndex = centerIndex + 1;
			else
				centerBeforeIndex = centerIndex - 1;
		}
		
		return -1;
		
//		do {
//			int centerIndex = (centerAfterIndex + centerBeforeIndex) / 2;
//			if(arr[centerIndex] == key)
//				return centerIndex;
//			else if(arr[centerIndex] < key)
//				centerAfterIndex = centerIndex + 1;
//			else
//				centerBeforeIndex = centerIndex - 1;
//		}while(centerAfterIndex <= centerBeforeIndex);
//		
//		return -1;
		
	}
}
