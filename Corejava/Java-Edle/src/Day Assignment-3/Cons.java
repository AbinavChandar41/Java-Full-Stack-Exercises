package Assignment;

class Person{
	private String Name;
	private int Age;
	


Person(String Name,int Age){
	this.Name=Name;
	this.Age=Age;
}
void PrintName() {
	System.out.println("name is "+Name);
}

void PrintAge() {
	System.out.println("age is "+Age);
}
}
public class Cons{

	public static void main(String[] args) {
		Person obj=new Person("abinav",21);
		obj.PrintName();
		obj.PrintAge();
		
		

	}
}
