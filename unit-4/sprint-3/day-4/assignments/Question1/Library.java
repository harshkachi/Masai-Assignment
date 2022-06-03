package com.Question1;

public class Library {

	int Unique_id;
	String bookName;
	String BookAuthor;
	
	
	public Library(int unique_id, String bookName, String bookAuthor) {
		super();
		this.Unique_id = unique_id;
		this.bookName = bookName;
		this.BookAuthor = bookAuthor;
	}


	public int getUnique_id() {
		return Unique_id;
	}


	public void setUnique_id(int unique_id) {
		Unique_id = unique_id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return BookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	
	
	//Object hash code while print.
	@Override
	public int hashCode() {
		return this.Unique_id;
	}
	
	// Return true or false if it is equal or not
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) 
		{
			return true;
		}
		
		Library s1 = this; 
		Library s2 = (Library) obj;
		
		return s1.Unique_id == s2.Unique_id; 
		
	}
	
	
	@Override
	public String toString() {
		
		return "Book id : "+ getUnique_id()+ " Book Name : "+
		getBookName()+ " Book Auther : "+ getBookAuthor();
	}
	
	
}
