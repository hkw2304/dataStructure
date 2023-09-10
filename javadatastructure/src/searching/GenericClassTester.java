package searching;

class GenericClass<T>{
	private T xyz;
	public GenericClass(T t) {
		// TODO Auto-generated constructor stub
		this.xyz = t;
	}
	T getXyz() {
		return xyz;
	}
}


public class GenericClassTester {
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<>("ABC");
		GenericClass<Integer> i = new GenericClass<>(15);
		System.out.println(s.getXyz());
		System.out.println(i.getXyz());
	}
}
