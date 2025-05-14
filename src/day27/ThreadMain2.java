package day27;

public class ThreadMain2 {
	
	public static void main(String[] args) {
		// Runable
		
		RunnableImpl runnableImpl = new RunnableImpl();
		
		Thread tr1 = new Thread(runnableImpl);
		
		ThreadImpl tr2 = new ThreadImpl();
		
		tr1.start();
		
		
		
		try {
			tr1.join();
			
			
			System.out.println("Thread 1 completed");

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tr2.start();
		
		try {
			tr2.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ThreadImpl tr3 = new ThreadImpl();
		
		tr3.start();
		
		
		
		
		
//		Thread tr_main = Thread.currentThread();
			
	}

}
