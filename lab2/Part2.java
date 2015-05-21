import java.util.*;

public class Part2 {
	public Part2() {}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:"); 
		int a = in.nextInt();
		int b;
		do {
			b = in.nextInt();
		} while (b > 0 && a % b != 0);
		/*
		int a = in.nextInt();
		int b = in.nextInt();
		*/
		//System.out.printf("Hello %s\n", name);
		
	}
}
