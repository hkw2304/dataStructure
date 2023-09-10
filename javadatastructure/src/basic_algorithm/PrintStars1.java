package basic_algorithm;

import java.util.Scanner;

public class PrintStars1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		
		while(true) {
			System.out.print("n : ");
			n = sc.nextInt();
			if(n >= 0) {
				break;
			}
			System.out.println("다시입력");
		}
		while(true) {
			System.out.print("w : ");
			w = sc.nextInt();
			if(w >= 0) {
				break;
			}
			System.out.println("다시입력");
		}
		for(int i = 0; i < n; i++) {
			System.out.print("*");
			if(i % w == w - 1)
				System.out.println();
		}
//		if(n % w != 0)
//			System.out.println();
	}
}
