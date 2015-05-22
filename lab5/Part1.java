public class Part1 {
	
	public static void main(String args[]) {
		A a = new A();
		System.out.println("Before:" + a);
		doSmth(a);
		System.out.println("After:" + a);
	}

	public static void doSmth(A a) {
		a.b = 123;
	}

}

class A {
	public Integer b;

	public String toString() {
		return String.format("b = %d", b);
	}
}
