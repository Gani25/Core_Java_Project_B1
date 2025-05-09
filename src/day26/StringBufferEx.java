package day26;

public class StringBufferEx {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);
		
		sb.append(" world");
		
		System.out.println(sb);
		
		sb.delete(5,11);
		
		System.out.println(sb);
		
		sb.insert(3, "SPRK");
		
		System.out.println(sb);
		
		sb.replace(3, 7, "");
		System.out.println(sb);
		
//		sb.reverse();
		
		
		
		StringBuilder sb2 = new StringBuilder("Java");
        sb2.repeat("World", 2);
        System.out.println(sb2);
	}

}
