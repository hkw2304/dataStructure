package basic_algorithm;

import java.util.Scanner;

public class Pyramid2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 출력 하기");
		System.out.print("몇 단 할까??");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			cnt = 0;
			for (int j = 1; j <= (i * 2) - 1; j++) {
				if (cnt == 0) {
					for (int k = 0; k < (num - i); k++) {
						System.out.print(" ");
					}
				}
				System.out.print(i % 10);
				cnt = 1;
			}
			System.out.println();
		}

	}
}
