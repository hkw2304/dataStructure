package basic_algorithm;

import java.util.Scanner;

public class SumGauss {
	public static int sumGauss(int n) {
		return (1 + n) * 5;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ n까지의 합");
		System.out.println("n : ");
		int n = sc.nextInt();
		System.out.println("1 ~ n까지의 합 : " + sumGauss(n));
		
	}
}
