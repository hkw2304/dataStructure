package basic_algorithm;

import java.util.Scanner;

public class SumVerbose1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("1 ~ n까지의 합을 구하시오");
		n = sc.nextInt();
		while(n <= 0) {
			System.out.println("n : ");
			n = sc.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
			sum += i;
		}
		System.out.println(sum);
	}
}
