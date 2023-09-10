package stackAndqueue;

import java.util.Arrays;
import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s= new IntQueue(64);
		
		while(true) {
			System.out.println();
			System.out.println("현재 데이터 개수 : " + s.getNum() + " / " + s.getSize());
			System.out.print("1.푸시 2.팝 3.피크 4.덤프 5.indexOf 6.isEmpty 7.isFull 8.배열 보기 0.종료 )) =>");
			int menu = sc.nextInt();
			int num;
			boolean ck;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				num = sc.nextInt();
				try {
					s.enque(num);
				}
				catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼다.");
				}
				break;
			case 2:
				try {
				num = s.deque();
				System.out.println("팝한 데이터 : " + num);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					num = s.peek();
					System.out.println("피크한 데이터 : " + num);
				}
				catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("indexOf : ");
				int index = sc.nextInt();
				num = s.indexOf(index);
				System.out.println("찾으려는 값 위치 : " + num);
				break;
			case 6:
				ck = s.isEmpty();
				if(ck)
					System.out.println("비어있다");
				else
					System.out.println("비어있지않다");
				break;
			case 7:
				ck = s.isFull();
				if(ck)
					System.out.println("가득 차 있다.");
				break;
			case 8:
				System.out.println(Arrays.toString(s.que));
				break;
			case 0:
				System.exit(0);
				break;
			}
			
		}
	}
}
