package basic_algorithm;

import java.util.Scanner;

public class TriangleMake {
	public static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void triangleLU(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void triangleRU(int n) {
		int cnt = 0;
		for (int i = n; i > 0; i--) {
			cnt = 0;
			for (int j = i; j > 0; j--) {
				if(cnt == 0)
				for(int k = 0; k < (n - i); k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				cnt = 1;
			}
			System.out.println();
		}
	}

	public static void triangleRB(int n) {
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(cnt == 0) {
					for(int k = 0; k < (n - i); k++)
						System.out.print(" ");
				}
				System.out.print("*");
				cnt = 1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 삼각형 만들기");
		System.out.print("몇 단으로 만들건가요? ");
		int num = sc.nextInt();
		triangleLB(num);
		System.out.println("============================");
		System.out.println("왼쪽 위가 직각인 삼각형 만들기");
		triangleLU(num);
		System.out.println("============================");
		System.out.println("오른쪽 위가 직각인 삼각형 만들기");
		triangleRU(num);
		System.out.println("============================");
		System.out.println("오른쪽 아래가 직각인 삼각형 만들기");
		triangleRB(num);

	}
}
