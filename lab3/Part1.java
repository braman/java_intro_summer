import java.util.Scanner;

public class Part1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i=2;i<n;i++) {
			int c = 3;
			if (n % i == 0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println(c);
		System.out.println("Is prime");
	}
}
