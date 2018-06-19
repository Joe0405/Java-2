package pe;
import pe.Member;

public class MemberVariable {
	public static String[] memberVariable() {
	Member employee = new Member();
	employee.initialize(30, "Harry Potter", 2500.3);
	String[] s = new String[3];
	s[0] = employee.name;
	s[1] = Integer.toString(employee.age);
	s[2] = Double.toString(employee.salary);
	return s;
	}
}
