package day28;

public class StringBuilderThread extends Thread {

	// thread unsafe
	public static StringBuilder builder = new StringBuilder("Starting");
	
	@Override
	public void run() {
		Thread tr1 = Thread.currentThread();
		
		if(tr1.getName().equalsIgnoreCase("Thread-1")) {
			
			for(int i = 1;i<=10;i++)
			{
				String msg = "-->"+i;
				builder.append(msg);
			}
		}
		if(tr1.getName().equalsIgnoreCase("Thread-2"))			
		{
			for (int i = 100; i >= 10; i-=10) {
				String msg = "-->" + i;
				builder.append(msg);
			}
			
		}
		
		System.out.println(Thread.currentThread().getName()+": "+builder);
	}
}
