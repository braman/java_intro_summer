//overloading

public class Part2 {
		
	public void print()	{
		System.out.println("Hello World");
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(String m0, String ... ms) {
		System.out.println(m0);
		for (String m:ms) {
			System.out.println(m);
		} 
	}
	
	public String toString() {
		return "overrided method";
	}	

	public static void main(String args[]) {
		Part2 p = new Part2();

		p.print();
		p.print("Test");
		p.print("Print 1", "Then 2", "Then 3");
	}
	
}
