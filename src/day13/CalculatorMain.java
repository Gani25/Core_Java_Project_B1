package day13;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.addition();
		calculator.addition(50,2);
		calculator.addition(50,2,40);
		calculator.addition(12.5,6);
	}

}
