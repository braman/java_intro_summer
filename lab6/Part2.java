public class Part2 {
	
	public static<T extends User> T upcast(User u, Class<T> clazz) {
		return (T)u;
		
	}

	
	public static User getInfo(Integer id) {
		//return Employee, Student or null
		if (id > 0 && id < 10) {
			Student s = new Student();
			s.id = id;
			s.name = "Student " + id;
			s.faculty = "FIT";

			return s;			
		} else if (id >= 10) {
			Employee e = new Employee();
			e.id = id;
			e.name = "Employee " + id;
			e.salary = (int)(Math.random() * 1000) + 10; 
			e.company = "ABC Company";

			return e;
		} else {
			return null;
		}
	}

	public static void main(String args[]) {
		User u = getInfo((int)(20*Math.random()));

		Employee e = upcast(u, Integer.class);
		System.out.println(e);

	}	

}
