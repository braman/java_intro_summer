import java.util.Scanner;

public class Part2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int xor = a ^ b;
		int and = a & b;
		int or = a | b;
		int sl = a << 1;
		int sr = a >> 1;

		 

		System.out.printf("xor = %d, and = %d, or = %d, sl = %d, sr = %d \n", xor, and, or, sl, sr);
	}
}
