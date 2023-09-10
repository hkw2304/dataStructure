package basic_algorithm;

public class Min_Method {
 public static void main(String[] args) {
	System.out.println("min(1,2,3) : " + min3(1,2,3));
	System.out.println("min(4,2,1,3) : " + min4(4,2,1,3));
}

public static int min4(int a, int b, int c, int d) {
	int min = a;
	if(min > b)
		min = b;
	if(min > c)
		min = c;
	if(min > d)
		min = d;
	return min;
}
 
public static int min3(int a, int b, int c) {
	// TODO Auto-generated method stub
	int min = a;
	if(min > b)
		min = b;
	if(min > c)
		min = c;
		
	return min;
}
}
