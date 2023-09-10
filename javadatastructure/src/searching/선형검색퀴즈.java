package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class 선형검색퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> idx = new ArrayList<>();
 		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("key : ");
		int key = sc.nextInt();
		
		int indexLength = searchIdx(arr,key,idx);
		
		if(indexLength == -1) {
			System.out.println("해당 값이 없습니다.");
		}
		else
			System.out.println("해당값이 " + indexLength + "의 길이만큼 있습니다.");
		
	}

	private static int searchIdx(int[] arr, int key, ArrayList<Integer> idx) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				idx.add(i);
			}
		}
		if(idx.size() == 0) {
			return -1;
		}
		else
			return idx.size();
	}

}
