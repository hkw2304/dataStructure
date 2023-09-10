package array_class;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다,");
//		System.out.print("사람수 : ");
//		int num = sc.nextInt();
		int num = 5+ random.nextInt(50);

		int[] height = new int[num];

		System.out.println("킷값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
//			0~89의 난수 생성
			height[i] = 100 + random.nextInt(90);
			System.out.println("heigth[" + i + "] : " + height[i]);
		}
		System.out.println("최댓값 : " + maxOf(height) + "입니다.");
	}

	private static int maxOf(int[] heigth) {

		System.out.println("========최댓값을 구합니다.========");
		int max = heigth[0];
		for (int i = 0; i < heigth.length; i++) {
			if (max < heigth[i])
				max = heigth[i];
		}

		return max;
	}
}
