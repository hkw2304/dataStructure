package searching;

class Id{
	private String id;
	private static int count = 0;
	public Id(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		count++;
	}
	String getId() {
		return id;
	}
	static int getCount() {
		return count;
	}
	
	
}

public class IdTester {
	
	public static void main(String[] args) {
		Id a = new Id("id1");
		Id b = new Id("id2");
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());
		System.out.println("호출한 갯수 : " + Id.getCount());
	}
}
