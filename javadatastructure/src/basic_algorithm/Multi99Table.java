package basic_algorithm;

public class Multi99Table {
	public static void main(String[] args) {
		System.out.println("--- 구구단 곱셈표 ---");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}
