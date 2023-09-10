package basic_algorithm;

import java.util.Scanner;

public class median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간값 구하기");
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("c : ");
		int c = sc.nextInt();
		
		System.out.println("중간값 : " + middle(a,b,c));
		
	}

	private static int middle(int a, int b, int c) {
		// TODO Auto-generated method stub
		if(a >= b) {
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		}
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
}
