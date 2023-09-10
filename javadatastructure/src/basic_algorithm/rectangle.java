package basic_algorithm;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 수만큼 정사각형 출력!!!");
		System.out.print("한변 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
