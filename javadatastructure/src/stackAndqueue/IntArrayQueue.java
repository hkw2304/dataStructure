package stackAndqueue;

public class IntArrayQueue {
	private int[] que;
	private int size;
	private int currentCount;
	private int first;
	public IntArrayQueue(int size) {
		// TODO Auto-generated constructor stub
		currentCount = 0;
		first = 0;
		this.size = size;
		que = new int[size];
	}
	public void enqueue(int num) {
		if(currentCount < size)
			que[currentCount++] = num;
		else
			System.out.println("큐의 공간이 가득 차있다.");
	}
	public int dequeue() {
		
		if(first < size)
			return que[first++];
		else {
			System.out.println("값이 없습니다.");
		}
		return 0;
		
	}
	
}
