public class A implements Comparable<A> {
	
	int c = 0;

	public int compareTo(A a2) {
		return c - a2.c;
	}

	public static void main(String args[]) {
		A a1 = new A();
		a1.c = 100;
		A a2 = new A();
		a2.c = 100;
		
		if (a1.compareTo(a2) == 0) {
			System.out.println("a1=a2 with compareTo");
		} else {
			System.out.println("a1 != a2 with compareTo");
		}

		if (a1 == a2) {
			System.out.println("a1=a2");
		}
		
		System.out.println("a1.c="+a1.c);

		String s = "H";
		String s2 = new String("W");
		
		System.out.printf("s=%s, s2=%s\n",s, s2);


		String s3 = s;
		String s4 = s2;


		System.out.printf("new s3=%s, s4=%s\n",s3, s4);
		
		s3 = "HW";
		s4 = "World";
		System.out.printf("After s3=%s, s4=%s\n",s3, s4);

		System.out.printf("After s=%s, s2=%s\n",s, s2);

		
	}

}


