package basic_algorithm;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 " );
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수 입니다.");
		}
		else if(num < 0) {
			System.out.println("음수 입니다.");
		}
		else
			System.out.println("0 입니다.");
	}
}
