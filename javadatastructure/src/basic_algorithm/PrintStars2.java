package basic_algorithm;

import java.util.Scanner;

public class PrintStars2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,w;
		
		System.out.print("n : ");
		n = sc.nextInt();
		System.out.println("w : ");
		w = sc.nextInt();
		for(int i = 0; i < n / w; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n % w;
		if(rest != 0) {
			System.out.println("*".repeat(rest));
		}
	}
}
