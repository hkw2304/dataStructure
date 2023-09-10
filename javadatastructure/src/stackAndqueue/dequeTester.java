package stackAndqueue;

import java.util.Arrays;
import java.util.Scanner;

public class dequeTester {
	public static void main(String[] args) {
		deque d = new deque(10);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.enqueue 2.dequeue 3.look");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.print("num : ");
				int num = sc.nextInt();
				d.enqueue(num);
				break;
			case 2:
				System.out.println("dequeue : " + d.deqeue());
				break;
			case 3:
				System.out.println("Arrays : " + Arrays.toString(d.arr));
				break;
			}
		}
	}
}
