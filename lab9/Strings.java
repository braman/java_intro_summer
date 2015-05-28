public class Strings {
	

	public static void main(String args[]) {
		String s = "Hello World";
		String s2 = "Hello World";	

		if (s.compareTo(s2) == 0) {
			System.out.println("s=s2 with compareTo");
		}	


		System.out.printf("sub1=%s, sub2=%s\n",
			s.substring(0, 4),
			s.substring(6, 11));

				
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
	}

}


