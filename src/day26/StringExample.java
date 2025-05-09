package day26;

public class StringExample {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		str2 = "Abdul";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str1;
		
		System.out.println("Str 4 = "+str4);
		System.out.println("Str 1 = "+str1);
		
		str1 = "SPRK";
		System.out.println("Str 4 = "+str4);
		System.out.println("Str 1 = "+str1);
		
		
		
		
	}

}
