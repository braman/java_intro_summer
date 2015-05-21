public class User {
	String name;
       
	User(String name) {
		this.name = name;	
	}

 	@Override
	public String toString() {
		return String.format("User's name is %s", name);
	}	

	public static void main(String args[]) {
		System.out.println(new User("Bill"));
	}


}
