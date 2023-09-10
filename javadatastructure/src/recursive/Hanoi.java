package recursive;

import java.util.Scanner;

public class Hanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이 탑");
		System.out.print("원반의 개수 : ");
		int num = sc.nextInt();
		
		move(num, 1, 3);
	}

	private static void move(int num, int i, int j) {
		// TODO Auto-generated method stub
		if(num > 1)
			move(num - 1, i, 6 - i - j);
		System.out.println("기둥" + num + "이 " + i + "번째 기둥에서 " + j + "번 기둥으로 이동");
		
		if(num > 1)
			move(num - 1, 6 - i - j, j);
	}
}
