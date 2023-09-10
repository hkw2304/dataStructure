package searching;

import java.util.Scanner;

public class SeqSearch {
//	static 선언 이유 : 객체(클래스) 안에 소속이 되어있으면 반드시 new 키워드로 객체를 생성해야한 실행 가능
	static int seqSearch(int[] arr, int num ,int key) {
//		int i = 0;
//		while(true) {
//			if(i == num) {
//				return -1;
//			}
//			if(arr[i] == key)
//				return i;
//			i++;
//		}

		for(int i = 0; i < num; i++) {
			if(arr[i] == key)
				return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
//		선형 배열 : 정렬되지 않는 배열에서 검색 할 때 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int index = seqSearch(arr, num, key);
		
		if(index == -1) {
			System.out.println("해당 값이 없습니다.");
		}
		else
			System.out.println("해당 값은 arr[" + index + "]번째 있습니다.");
	}
}
