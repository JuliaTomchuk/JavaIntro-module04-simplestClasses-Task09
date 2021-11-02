package by.home.module04.task09.entity;

import java.util.ArrayList;


public class Library {
	
	private ArrayList <Book> books;
	
	public Library(){
		
		books= new ArrayList<Book>();
		
	}
	
	public Library(ArrayList <Book> books){
		this.books=books;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		
		books.add(book);
	}
	
	public Book getBook(int index) {
		return books.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[books=" + books + "]";
	}
	
	

}
