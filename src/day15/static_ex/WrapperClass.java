package day15.static_ex;

public class WrapperClass {
	
	public static void main(String[] args) {
		int num = 55;
		
		Integer numObj = num; // Boxing
		
		System.out.println(num);
		System.out.println("Object: "+numObj);

		System.out.println(numObj.intValue());
		
		Double pi = 3.14;
		
		double d = pi; // UNBOXING
		
		System.out.println("PI = "+pi);
		System.out.println("D = "+d);
		
	}

}
