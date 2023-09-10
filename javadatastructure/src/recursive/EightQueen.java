package recursive;

public class EightQueen {
	private static final boolean[] flag_a = new boolean[8];
	private static final boolean[] flag_b = new boolean[15];
	private static final boolean[] flag_c = new boolean[15];
	private static final int[] pos = new int[8];

	public static void main(String[] args) {
		set(0);
	}

	private static void set(int i) {
		// TODO Auto-generated method stub
		for(int x = 0; x < 8; x++) {
			if(flag_a[x] == false && flag_b[i + x] == false && flag_c[i - x + 7] == false) {
				pos[i] = x;
				if(i == 7)
					print();
				else {
					flag_a[x] = flag_b[i + x] = flag_c[i - x + 7] =true;
					set(i + 1);
					flag_a[x] = flag_b[i + x] = flag_c[i - x + 7] = false;
				}
			}
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
}
