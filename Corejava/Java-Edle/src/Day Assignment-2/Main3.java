package Assignment1;

class Employee{
	void work() {
		System.out.println("Employee is working");
	}
	double getSalary() {
		return 10000;
	}
}
class HrandManager extends Employee{
	void work() {
		System.out.println("hr is working");
	}
	void addEmployee(String Employeename) {
		System.out.println("employee name is "+Employeename);
		
	}
}
public class Main3 {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.work();
		System.out.println(emp.getSalary());
		
		
		
		HrandManager hr = new HrandManager();
		hr.addEmployee("abinav");
		hr.work();
	}

}
