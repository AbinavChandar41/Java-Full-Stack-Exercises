package Assignment1;

class Person {
    private String firstName;
    private String lastName;

    
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   
    String getFirstName() {
        return firstName;
    }

    
    String getLastName() {
        return lastName;
    }
}

class Employeed extends Person {
    private String employeeId;
    private String jobTitle;

   
    Employeed(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName); 
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    
    String getEmployeeId() {
        return employeeId;
    }

   
    String getLastName() {
        return super.getLastName() + " - " + jobTitle;
    }
}

public class Main5 {
    public static void main(String[] args) {
       
        Person per = new Person("Abinav", "Chandar");
        System.out.println(per.getFirstName()); 
        System.out.println(per.getLastName());   
        
        Employeed emp = new Employeed("Praveen", "Kumar", "E123", "Software Engineer");
        System.out.println(emp.getFirstName()); 
        System.out.println(emp.getLastName());   
        System.out.println(emp.getEmployeeId());  
    }
}