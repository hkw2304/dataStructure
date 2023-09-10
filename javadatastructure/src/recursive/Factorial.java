package recursive;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("음이 아닌 정수 입력 : ");
		int num = sc.nextInt();
		int result = factorial(num);
		if(result > 0)
			System.out.println(num + "! : " + result);
		else
			System.out.println("정수를 입력하세요");
	}

//	-1 : 프로그래밍에서는 보통 에러를 의미한다
//	0 : 정상종료
//	1 : 정상종료 or 특별한 값

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num > 0) {
			return num * factorial(num - 1);
		}
		else
			return 1;
	}
}
