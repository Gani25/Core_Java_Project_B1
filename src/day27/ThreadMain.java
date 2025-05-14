package day27;

public class ThreadMain {
	
	public static void main(String[] args) {
		// Runable
		
		RunnableImpl runnableImpl = new RunnableImpl();
		
		Thread tr1 = new Thread(runnableImpl);
		
		ThreadImpl tr2 = new ThreadImpl();
		
		tr1.start();
		
		
		tr2.start();
		
		System.out.println("Hello From Main");
		System.out.println("Hello From Main");
		System.out.println("Hello From Main");
		System.out.println("Hello From Main");
		System.out.println("Hello From Main");
		System.out.println("Hello From Main");
		
		Thread tr_main = Thread.currentThread();
		System.out.println("Name Of CUrrent Thread: "+tr_main.getName());
		System.out.println("Name Of Thread IMPL: "+tr2.getName());
		System.out.println("Name Of RUNNABLE IMPL: "+tr1.getName());
		
		
	}

}
