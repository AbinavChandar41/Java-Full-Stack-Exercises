package Assignment;

class Dog{
	private String Name;
	private String Breed;
	

Dog(String Name,String Breed){
	this.Name=Name;
	this.Breed=Breed;
}
String getName() {
	return Name;
}
String getBreed() {
	return Breed;
}
void setName(String Name) {
	this.Name=Name;
}
void setBreed(String Breed) {
	this.Breed=Breed;
}

}





public class Assign2 {

	public static void main(String[] args) {
		Dog dog = new Dog("german","tommy");
		System.out.println("before details");
		System.out.println(dog.getName());
		System.out.println(dog.getBreed());
		
		dog.setName("bull");
		dog.setBreed("jerry");
		System.out.println("after updated the details");
		System.out.println(dog.getName());
		System.out.println(dog.getBreed());
		
		
		
	}

}
