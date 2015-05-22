public class Animal {
	public String name;

	public String whoAreYou() {
		return null;
	}	
}


class Cat extends Animal {
	public String name;

	public String whoAreYou() {
		return "Cat";
	}
}

class Tiger extends Cat {
	public String name = "Tiger";
	
	public String whoAreYou() {
                return "Tiger";
        }
}
