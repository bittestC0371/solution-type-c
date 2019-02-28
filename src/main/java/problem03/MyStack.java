package problem03;

public class MyStack {
	
	private String[] buffer;
	public int top = 0;

	public MyStack( int size ) {
		buffer = new String[size+10];
	}
	
	public void push(String item) {
		if(top + 1 == buffer.length) {
			System.out.println("크기 초과입니다.");
		} else {
			buffer[top++] = item;
		}
	}

	public String pop() {
		String buf = "";
		try {
			buf = buffer[--top];
		} catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("null");
		}
		return buf;
	}

	public boolean isEmpty() {
		if(top == 0)
			return true;
		 else
			return false;
	}
	
	public int size() {
		return buffer.length;
	}
}