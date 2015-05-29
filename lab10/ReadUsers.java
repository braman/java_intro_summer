import java.io.*;
import java.util.*;


public class ReadUsers {
	
	public static void main(String args[]) throws IOException {
		File f = new File("info.txt");
		Scanner in = new Scanner(f);

		List<User> usersList = new ArrayList<User>();

		while (in.hasNext()) {
			String c = in.next();
			String name = in.next();
			int age = in.nextInt();
			
			User u = (c.equals("s")) ? new Student() : 
					new Employee();

			u.name = name;
			u.age = age;
			

			if (c.equals("s")) {
				Student s = (Student) u;
				s.faculty = in.next();	
			} else if (c.equals("e")) {
				Employee e = (Employee) u;
				e.company = in.next();
				e.salary = in.nextInt();
			} else {
				System.out.println("Unknown user!");
				continue;
			}

			usersList.add(u);
			
		}

		for (User u: usersList) {
			System.out.println(u);
		}		

	}

}
