package array_class;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0;
		
		for(int i = 2; i <= 1000; i++) {
			int j;
			for(j = 2; j < i; j++) {
				counter++;
				if(i % j ==0)
					break;
			}
			if(i == j)
				System.out.println(i);
		}
		System.out.println("나눗셈을 수행한 횟수: " + counter);
	}
}
