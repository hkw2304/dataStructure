package stackAndqueue;

import java.util.Scanner;

public class ringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] arr = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.print(cnt + 1 + "번째 정수 : ");
			arr[cnt++ % N] = sc.nextInt();
			System.out.print("go? or stop? ->>");
			retry = sc.nextInt();
		}while(retry == 1);
		
		int i = cnt - N;
		if(i < 0) i = 0;
		
		for(;i < cnt; i++)
			System.out.print(i + 1 + "번째 정수 = " + arr[i % N] +"\n");
	}
}
