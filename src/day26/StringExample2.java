package day26;

public class StringExample2 {
	
	public static void main(String[] args) {
		String sent = "Hello All Have A Nice Day And Have A Good Day";
		
		System.out.println(sent.charAt(6));
		System.out.println(sent.concat("BYE!!"));
		System.out.println(sent);
		System.out.println(sent.toUpperCase());
		
		System.out.println(sent.contains("ABDUL"));
		System.out.println(sent.contains("Nice"));
		System.out.println(sent.indexOf("A"));
		System.out.println(sent.lastIndexOf("A"));
		System.out.println(sent.indexOf("A",10));
		
		String name = "Abdul";
		System.out.println(name.equals("abdul"));
		System.out.println(name.equalsIgnoreCase("abdul"));
		
		System.out.println(sent.substring(10));
		System.out.println(sent.substring(10,15));
		
		String str = "    Hello    ";
		
		System.out.println(str.length());
		
		String trimStr = str.trim();
		System.out.println(str);
		System.out.println(trimStr.length());
		System.out.println(trimStr);
		
		str = "     ";
		
		System.out.println(str.isBlank());
		str = "     HELLO";
		
		System.out.println(str.isBlank());
		str = "    ";
		System.out.println(str.isEmpty());
		str = "";
		System.out.println(str.isEmpty());
		
		str = null;
		System.out.println(str != null && str.isBlank());
		
		
	}

}
