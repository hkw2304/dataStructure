package recursive;

import java.util.Scanner;


public class Recur {
	static int cnt2 = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		recur(num);
		System.out.println("====================");
		recur2(num);
		System.out.println("cnt2(recur2) : " + cnt2);
	}

	private static void recur2(int num) {
		// TODO Auto-generated method stub
		
		if (num > 0) {
			cnt2++;
			recur2(num - 2);
			System.out.println(num);
			recur2(num - 1);
			
		}
		
	}

	private static void recur(int num) {
		// TODO Auto-generated method stub
		IntStack s = new IntStack(num);
		int cnt = 0;
//		if(num > 0) {
//			
//			recur(num - 1);
//			System.out.println(num);
//			num = num - 2;
//		}
		while (true) {
			
			if (num > 0) {
				cnt++;
				s.push(num);
				num = num - 1;
				continue;
			}

			if (s.isEmpty() != true) {
				cnt++;
				num = s.pop();
				System.out.println(num);
				num = num - 2;
				continue;
			}
			System.out.println("cnt(recur) : " + cnt);
			break;
		}
	}
}
