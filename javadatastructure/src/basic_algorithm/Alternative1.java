package basic_algorithm;

import java.util.Scanner;

public class Alternative1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		System.out.println("+와-를 번갈아 n개 출력합니다.");
		
		
		for(int i = 0; i < n / 2; i++) {
				System.out.print("+-");
			
			if(n % 2 != 0)
				System.out.print("-");
		}
	}
}
