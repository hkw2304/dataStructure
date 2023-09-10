package basic_algorithm;

import java.util.Scanner;

public class CompareNumAndSub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ck = true;
		System.out.println("두 개의 정수 입력");
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		ck = compare(num1, num2);
		while(!ck) {
			System.out.println("두 개의 정수 입력");
			System.out.print("num1 : ");
			num1 = sc.nextInt();
			System.out.print("num2 : ");
			num2 = sc.nextInt();
			ck = compare(num1, num2);
			
		}
		System.out.println("num2 - num1 : " + subNum(num1, num2));
		subNum(num1, num2);
	}

	private static int subNum(int num1, int num2) {
		// TODO Auto-generated method stub
		
		return num2 - num1;
	}

	public static boolean compare(int num1, int num2) {
		// TODO Auto-generated method stub
		boolean ck;
		if(num1 > num2)
			ck = false;
		else if(num1 < num2)
			ck = true;
		else
			ck = false;
		return ck;
	}
}
