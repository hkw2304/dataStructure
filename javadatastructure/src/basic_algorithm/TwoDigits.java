package basic_algorithm;

import java.util.Scanner;

public class TwoDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("두 자리의 양수 : ");
			num = sc.nextInt();
			if(num >= 10 && num <= 99) {
				break;
			}
		}
		System.out.println("두 자리의 양수 : " + num);
	}
}
