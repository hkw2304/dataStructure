package recursive;

import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 최대공약수를 구합니다");
		System.out.print("배열의 길이 : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("최대공약수는 " + gcd(arr) + " 입니다.");
	}

	private static int gcd(int[] arr) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		for(;max > 0;max--) {
			cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % max == 0)
					cnt++;
				if(cnt == arr.length)
					return max;
			}
		}
		return 0;
			
	}

}
