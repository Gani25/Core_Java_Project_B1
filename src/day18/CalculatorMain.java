package day18;

public class CalculatorMain {
	
	
	public static void main(String[] args) {
//		Calculator calculator = new CalculatorImpl();
		
		
		// Lambda Expression -> Override Only 1 Abstract Method
		Calculator calculator2 = (n) ->{
			
			// Multiple line of code
			long fact = 1;
			
			for(int i = n ;i >=1 ;i--)
			{
				fact *= i; // fact = fact * i
			}
			
			return fact;
		};
		System.out.println("The factorial of 15 is: "+ calculator2.factorial(15));
		
		
		Greet greet = (name,msg)-> msg + " "+name;
		
		
		System.out.println(greet.sayHello("Rohit", "Good Morning"));
		
		
		
		
	}

}
