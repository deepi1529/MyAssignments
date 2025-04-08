package week2.day1;

public class Library {
	//creating method with argument - string
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		System.out.println(bookTitle);
		//to return the title
		return bookTitle;
		
	}
	//creating another method
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		//creating object to call method
		Library bookOptions = new Library();
		bookOptions.addBook("Title of the Book");
		bookOptions.issueBook();
		
			
	}
		
		

}
