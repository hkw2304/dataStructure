package array_class;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInfo {
	Scanner sc = new Scanner(System.in);
	MakeArray arr = new MakeArray();
	int[] array;
	int[] newArr;
	int[] copyArr;
	int[] returnArr;
	int sum = 0;

	public void menu() {
		while (true) {
			System.out.println("=== Array 문제 ===");
			System.out.println("1.배열을 역순으로 배치 하시오");
			System.out.println("2.배열의 모든 요소의 합을 구하시오");
			System.out.println("3.배열의 역순을 복사하는 메서드를 구현하시오");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				newArr = arr.reverse(array);
				System.out.println("--- 배열의 역순 ---");
				System.out.println("초기 배열 : " + Arrays.toString(copyArr));
				System.out.println("역순 배열 : " + Arrays.toString(newArr));
				break;
			case 2:
				sum = arr.arrSum(copyArr);
				System.out.println("--- 배열의 요소 합 ---");
				System.out.println(sum);
				break;
			case 3:
				System.out.println("--- 복사된 배열의 역순 ---");
				returnArr = arr.reverse(array);
				System.out.println("원상 복귀 : " + Arrays.toString(returnArr));
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 선택!!!");
			}
		}
	}

	public void makeArray() {
		// TODO Auto-generated method stub
		System.out.print("배열의 크기를 정하시오");
		int size = sc.nextInt();
		array = arr.makeArray(size);
		copyArr = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			copyArr[i] = array[i];
		}
	}

	public void showInfo() {
		System.out.println("--- 생성된 배열 ---");
		System.out.println(Arrays.toString(array));
		System.out.println("--------");
	}
}
