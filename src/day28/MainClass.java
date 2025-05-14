package day28;

public class MainClass {
	
	public static void main(String[] args) {
		StringBuilderThread tr1 = new StringBuilderThread();
		StringBuilderThread tr2 = new StringBuilderThread();
		
		tr1.setName("Thread-1");
		tr2.setName("Thread-2");
		
		tr1.start();
		tr2.start();
	}

}
