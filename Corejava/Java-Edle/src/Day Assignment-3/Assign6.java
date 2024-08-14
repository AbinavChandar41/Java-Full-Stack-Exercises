package Assignment;

class Employee{
	String name;
	String jobtitle;
	double salary;
	
	Employee(String name,String jobtitle,int salary){
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	String getname() {
		return name;
	}
	String getjobtitle() {
		return jobtitle;
	}
	double getsalary() {
		return salary;
	}
	void setjobtitle(String jobtitle) {
		this.jobtitle=jobtitle;
		
	}
	void calculatepercentage(double percentage) {
		double increase = salary * (percentage / 100);
		salary=salary+increase;
		
	}
	void updatesalary(double newsalary) {
		salary= newsalary;
	}
	
}










public class Assign6 {
	public static void main(String args[]) {
		Employee emp = new Employee("abinav","software engineer",20000);
		String name= emp.getname();
		String role=emp.getjobtitle();
		double sal=emp.getsalary();
		System.out.println("employee name "+name);
		System.out.println("employee job role "+role);
		System.out.println("employee salary "+sal);
		
		System.out.println("employee salary increase percetage details");
		emp.calculatepercentage(10);
		double perc=emp.getsalary();
		System.out.println("employee salary 10% percentage increase "+perc);
		
		System.out.println("after employee salary increase");
		emp.updatesalary(60000);
		double newsal=emp.getsalary();
		System.out.println("employee updated salary is "+newsal);
		
		
		
	}

}
