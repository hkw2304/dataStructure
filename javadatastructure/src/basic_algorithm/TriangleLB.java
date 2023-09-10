package basic_algorithm;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("왼쪽 아래가 직작인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형인가요? ");
		num = sc.nextInt();
		
		while(true) {
			if(num <= 0) {
				System.out.println("다시 입력!!");
				num = sc.nextInt();
			}
			else
				break;
		}
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
