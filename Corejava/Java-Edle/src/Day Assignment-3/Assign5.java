package Assignment;

class Book{
	String title;
	String author;
	String isbn;

Book(String title,String author,String isbn){
	this.title=title;
	this.author=author;
	this.isbn=isbn;
	
}
String gettitle(){
	return title;
	
}
String getauthor() {
	return author;
}
String getisbn() {
	return isbn;
}
void settitle(String title) {
	this.title=title;
}
void setauthor(String author) {
	this.author=author;
}
void setisbn(String isbn) {
	this.isbn=isbn;
}

void display() {
	System.out.println("the book tittle is "+title);
	System.out.println("the book author is "+author);
	System.out.println("the book isbn is "+isbn);
	
}

}





public class Assign5 {
	public static void main(String args[]) {
		Book book = new Book("panjathandiram","sujatha","435ct");
		book.display();
		System.out.println("after updation");
		book.settitle("poniyin selvan");
		book.setauthor("kalki");
		book.setisbn("543cj");
		book.display();
		
		
	}
	
	
	
	
	

}
