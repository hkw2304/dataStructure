package stackAndqueue;

public class IntStack {
	public int[] stkArr;    //스택배열 
	private int arrLen;      //배열길이
	private int ptr;         //스택 포인터
	
	public IntStack(int arrLen) {
		ptr = 0;
		this.arrLen = arrLen;
		try {
			stkArr = new int[arrLen];
		}catch(OutOfMemoryError e) {
			arrLen = 0;
		}
	}
	
	
//	스택이 비어있을 때 예외처리
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
			
		}
	}
//	스택이 가득 찼을 경우 예외처리
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= arrLen)
			throw new OverflowIntStackException();
		return stkArr[ptr++] = x;
	}
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stkArr[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stkArr[ptr - 1];
	}
	
	public void clear() {
		ptr = 0;
	}
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stkArr[i] == x)
				return i;
		}
		return - 1;
	}
	public int getArrLen() {
		return arrLen;
	}
	public int size() {
		return ptr;
	}
	public boolean isEmpty() {
		return ptr <= 0;
	}
	public boolean isFull() {
		return ptr >=arrLen;
	}
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stkArr[i] + " ");
			}
			System.out.println();
		}
	}
	}
