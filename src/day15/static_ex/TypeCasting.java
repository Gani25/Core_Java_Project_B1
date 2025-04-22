package day15.static_ex;

public class TypeCasting {
	
	public static void main(String[] args) {
		// Implicit
		char alp = 'h'; // 2byte
		
		int value = alp; // 4 byte
		
		System.out.println("Value: "+value);
		System.out.println("Char: "+alp);
		
		int num = 55;
		
		double decimalNum = num;
		
		System.out.println("Integer "+num);
		System.out.println("Decimal "+decimalNum);
		
		// Explicit
		double pi = 3.14444444;
		
		int x = (int) pi;
		
		System.out.println("PI = "+pi);
		
		System.out.println("X = "+x);
		
		
	}

}
