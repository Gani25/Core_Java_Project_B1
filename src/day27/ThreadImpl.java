package day27;

public class ThreadImpl extends Thread {
	

	@Override
	public void run() {
		// Even Number from 1 to 50
		try {
			Thread thread = Thread.currentThread();
			for (int i = 2; i <= 50; i += 2) {
				System.out.println("Even Number: " + i);

				Thread.sleep(2000);
//				if(i==10)
//				{
//					thread.interrupt();
//				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
