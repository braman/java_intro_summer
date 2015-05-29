public class User {
	public Integer age;
	public String name;
}

class Student extends User {
	public String faculty;

	public String toString() {
		return String.format("s %s %d %s", name, age, faculty);
	}
}

class Employee extends User {
	public Integer salary;
	public String company;

	public String toString() {
                return String.format("e %s %d %s %d", 
			name, age, company, salary);
        }
}


