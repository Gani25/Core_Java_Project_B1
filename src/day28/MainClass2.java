package day28;

public class MainClass2 {
	
	public static void main(String[] args) {
		StringBufferThread tr1 = new StringBufferThread();
		StringBufferThread tr2 = new StringBufferThread();
		
		tr1.setName("Thread-1");
		tr2.setName("Thread-2");
		
		tr1.start();
		tr2.start();
	}

}
