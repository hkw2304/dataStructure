package array_class;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] heigth = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("heigth[" + i + "] : ");
			heigth[i] = sc.nextInt();
		}
		System.out.println("최댓값 : " + maxOf(heigth) + "입니다.");
	}

	private static int maxOf(int[] heigth) {
		
		System.out.println("========최댓값을 구합니다.========");
		int max = heigth[0];
		for(int i = 0; i < heigth.length; i++) {
			if(max < heigth[i])
				max = heigth[i];
		}
		
		return max;
	}
}
