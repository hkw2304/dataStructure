package stackAndqueue;

public class IntQueue {
	public int[] que;
	private int size;
	private int front;
	private int rear;
	private int num;

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {

		}
	}
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {
			
		}
	}
	public IntQueue(int maxlen) {
		// TODO Auto-generated constructor stub
		num = front = rear = 0;
		size = maxlen;
		try {
			que = new int[size];
		}catch(OutOfMemoryError e) {
			size = 0;
			
		}
	}
	public int getNum() {
		return num;
	}
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= size)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == size)
			rear = 0;
		return x;
		}
	public int deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == size)
			front = 0;
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public void clear() {
		num = front = rear = 0;
	}
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int index = (i + front) % size;
			if(que[index] == x)
				return index;
		}
		return -1;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return num <= 0;
	}
	public boolean isFull() {
		return num  >= size;
	}
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[i + front] % size + " ");
			System.out.println();
		}
	}
}
