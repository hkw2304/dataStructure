package basic_algorithm;

public class Multi99Table2 {
	public static void main(String[] args) {
		
		System.out.println("--- 구구단 곱셈표 ---");
		for(int i = 1; i <= 9; i++) {
			System.out.print("\t" + i + "\t");
		}
		System.out.println();
		System.out.println("\t+---------------------------------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i);
			for(int j = 1; j <= 9; j++) {
				
				System.out.print("\t" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
