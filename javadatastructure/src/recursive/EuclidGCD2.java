package recursive;

import java.util.Scanner;

public class EuclidGCD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수를 구합니다");
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.println("최대공약수는 " + gcd(num1, num2) + " 입니다.");
	}

	private static int gcd(int num1, int num2) {
		// TODO Auto-generated method stub

//		if(num2 == 0)
//			return num1;
//		else
//			return gcd(num2, num1 % num2);
		int i;
		if(num1 > num2)
			i = num1;
		else if(num1 == num2)
			i = num1;
		else
			i = num2;
		for(;i > 0;i--) {
			if(num1 % i == 0 && num2 % i == 0)
				return i;
		}
		return 0;

	}

}
