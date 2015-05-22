public class AnimalTest {
	public static void main(String args[]) {
		Tiger t = new Tiger();
		System.out.println(t.whoAreYou());
		Animal a = new Cat();
		System.out.println(a.whoAreYou());
		Animal a2 = new Tiger();
		System.out.println(a2.whoAreYou());
	}
}
