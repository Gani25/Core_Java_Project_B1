package day20;

import java.util.InputMismatchException;

public class ExcpEx3 {
	
	public static void main(String[] args) {
		try {
			// connection | File Open -- Exception
			String name = null;
			System.out.println("File Open Successfully");
			System.out.println(name.length());
			// Logic -> Exception
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Closing All Resources");
			//close()// release all the opened resources
			// If file not open and I try to close I will get error
		}
		
		System.out.println("Outside Block");
		
	}

}
