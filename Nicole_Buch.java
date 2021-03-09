
public class Nicole_Buch {
	String title, author, isbn;
	int book_number;
	static int number = 0; // alle objekte der klasse buch teilen sich die variable
	
	Nicole_Buch(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		number++;
		this.book_number = number;
	}
	void print() {
		System.out.println(title + " von " + author + ", " + isbn  + " Nummer: " + book_number + "\n");
	}	
	
}

