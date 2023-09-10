package stackAndqueue;

import java.util.Scanner;

public class IntArrayQueueTester {
public static void main(String[] args) {
	IntArrayQueue a = new IntArrayQueue(5);
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("1.값 넣기 2.값 제거 3.종료");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.print("num : ");
			int num = sc.nextInt();
			a.enqueue(num);
			break;
		case 2:
			int remove = a.dequeue();
			System.out.println("삭제된 값 : " + remove);
			break;
		case 3:
			System.exit(0);
		}
	}
	
}
}
