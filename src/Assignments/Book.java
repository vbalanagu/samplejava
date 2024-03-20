package Assignments;

public class Book {
	String title;
	String author;
	int PageCount;
	private static int totalBooks = 0;
	public Book() {
		totalBooks++;
	}
	public static int bookCount() {
		return totalBooks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.title = "Title1";
		b1.author = "Author1";
		b1.PageCount = 100;
		Book b2 = new Book();
		b2.title = "Title2";
		b2.author = "Author2";
		b2.PageCount = 110;
		Book b3 = new Book();
		b3.title = "Title3";
		b3.author = "Author3";
		b3.PageCount = 120;
		System.out.println("Total number of books are: "+ Book.bookCount());
		System.out.println("Title: "+b1.title+" Author: "+b1.author+" PageCount: "+b1.PageCount);
		System.out.println("Title: "+b2.title+" Author: "+b2.author+" PageCount: "+b2.PageCount);
		System.out.println("Title: "+b3.title+" Author: "+b3.author+" PageCount: "+b3.PageCount);
		b3.PageCount = 125;
		System.out.println("Total number of books are: "+ Book.bookCount());
		System.out.println("Title: "+b3.title+" Author: "+b3.author+" PageCount: "+b3.PageCount);
		Book b4 = new Book();
		b4.title = "Title4";
		b4.author = "Author4";
		b4.PageCount = 130;
		System.out.println("Total number of books are: "+ Book.bookCount());
	}

}
