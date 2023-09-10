package recursive;

import java.util.Scanner;

public class recurMemo {
	static String[] memo;
	static int CNT = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		memo = new String[num + 2];
		recur(num);
		System.out.println("cnt : " + CNT);
		
	}
	private static void recur(int num) {
		// TODO Auto-generated method stub
		if(memo[num + 1] != null) {
			CNT++;
			System.out.println(memo[num + 1]);
		}
		else {
			if(num > 0) {
				CNT++;
				recur(num - 1);
				System.out.println(num);
				recur(num - 2);
				memo[num + 1] = memo[num] + num + "\n" + memo[num - 1];
			}
			else
				CNT++;
				memo[num + 1] = "";
		}
	}
}
