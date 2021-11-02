package by.home.module04.task09.view;

import java.util.ArrayList;

import by.home.module04.task09.entity.Book;
import by.home.module04.task09.entity.Library;

public class View {
	public View() {

	}

	public void print(ArrayList <Book> books) {
		System.out.println(books);

	}

	public void print(Book book) {
		System.out.println(book);

	}
	
	
	public void print(Library library) {
		System.out.println(library);

	}
	

}
