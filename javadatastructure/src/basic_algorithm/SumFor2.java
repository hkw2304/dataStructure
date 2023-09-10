package basic_algorithm;

import java.util.Scanner;

public class SumFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("1 ~ n까지의 합");
		System.out.print("n : ");
		n = sc.nextInt();
		while(n <= 0) {
			System.out.println("n : ");
			n = sc.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1 ~ n까지의 합 : " + sum + "입니다.");
		
		
	}
}
