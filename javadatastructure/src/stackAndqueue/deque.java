package stackAndqueue;

public class deque {
	public int[] arr;
	private int size;
	private int count;
	private int deleteCnt;
	public deque(int size) {
		// TODO Auto-generated constructor stub
		count = size - 1;
		deleteCnt = size - 1;
		arr = new int[size];
	}
	public void enqueue(int num) {
		arr[count] = num;
		count--;
	}
	public int deqeue() {
		return arr[deleteCnt--];
	}
}
