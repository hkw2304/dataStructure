package stackAndqueue;

import java.util.Arrays;
import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s= new IntStack(5);
		
		while(true) {
			System.out.println();
			System.out.println("현재 데이터 개수 : " + s.size() + " / " + s.getArrLen());
			System.out.print("1.푸시 2.팝 3.피크 4.덤프 5.indexOf 6.isEmpty 7.isFull 0.종료 )) =>");
			int menu = sc.nextInt();
			int num;
			boolean ck;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				num = sc.nextInt();
				try {
					s.push(num);
				}
				catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼다.");
				}
				break;
			case 2:
				try {
				num = s.pop();
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
			case 0:
				System.exit(0);
				break;
			}
			
		}
	}
}
