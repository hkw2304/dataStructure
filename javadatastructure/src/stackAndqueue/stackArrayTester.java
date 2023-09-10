package stackAndqueue;

import java.util.Scanner;

public class stackArrayTester {
	public static void main(String[] args) {
		stackArray s = new stackArray(6);
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("1.first 2.last 3.배열보기 0.프로그램종료 =>");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.print("first : ");
				num = sc.nextInt();
				s.firstPush(num);
				break;
			case 2:
				System.out.print("last : ");
				num = sc.nextInt();
				s.lastPush(num);
				break;
			case 3:
				System.out.println(s.toString());
				
				break;
			case 0:
				System.exit(0);
				break;
			}
		}

	}
}
