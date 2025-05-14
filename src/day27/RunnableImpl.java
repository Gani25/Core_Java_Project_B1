package day27;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// odd numb from 1 to 20
		try {
			Thread runnableThr = Thread.currentThread();
			
			runnableThr.setName("Runnable-Thread");
			for (int i = 1; i <= 20; i += 2) {
				System.out.println("Value is: " + i);
				
				Thread.sleep(1000);
				
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
