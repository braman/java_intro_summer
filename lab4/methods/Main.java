import java.util.*;


public class Main {

	Main() {
		Scanner in = new Scanner(System.in);

		askAge(in);

		System.out.println(sayHello("Raman"));
	}
	
	public static String sayStaticHello(String name) {
		return "Static hello to " + name;
	}
	public final int askAge(Scanner in) {
		System.out.println("Enter you'r age:");
		return in.nextInt();
	}

	public String sayHello(String name) {
		return "Hello, " + name;
	}
	
	public static void main(String args[]) {
		//new Main();

		System.out.println(Main.sayStaticHello("Raman"));
	}
}
