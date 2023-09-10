 package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("=====================");
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];
//		(원본, 복사본, 시작점, 끝점) 재귀 호출
		mergeSort(arr,temp,0, arr.length - 1);
	}
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		// TODO Auto-generated method stub
		if(start < end) {
			int mid = (start + end) / 2;
//			정렬된 배열을 두개로 나눈다.
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid + 1, end);
//			나눈 배열을 병합한다.
			merge(arr, temp, start, mid, end);
		}
		
	}
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		// TODO Auto-generated method stub
		for(int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
//		두 배열의 첫번째 인덱스
		int part = start;
		int part2 = mid + 1;
		
		int index = start;
//		두 배열이 끝까지 갈 때까지 반복
		while(part <= mid && part2 <= end) {
			if(temp[part] <= temp[part2]) {
				arr[index] = temp[part];
				part++;
				
			}
			else {
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		for(int i = 0; i <= mid - part; i++) {
			arr[index + i] = temp[part + i];
		}
	}
}
