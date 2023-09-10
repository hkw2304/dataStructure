package basic_algorithm;

public class Max_MethodFour {
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		if(max < d)
			max = d;
		return max;
	}
 public static void main(String[] args) {
	System.out.println("max(1,2,3,4) : " + max4(1,2,3,4));
	System.out.println("max(1,2,3,4) : " + max4(1,2,4,3));
	System.out.println("max(1,2,3,4) : " + max4(1,4,2,3));
	System.out.println("max(1,2,3,4) : " + max4(4,1,2,3));
}
}
