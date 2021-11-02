package by.home.module04.task09.logic;


import java.util.ArrayList;


import by.home.module04.task09.entity.Book;
import by.home.module04.task09.entity.Library;

public class LibraryLogic {

	public LibraryLogic() {

	}

	public ArrayList<Book> findBooksByAuthor(String author, Library library) {

		ArrayList<Book> result = new ArrayList<Book>();
		for (int i = 0; i < library.getBooks().size(); i++) {
			if (library.getBook(i).getAuthor().equals(author)) {
				result.add(library.getBook(i));

			}
		}

		return result;

	}

	public ArrayList<Book> findBooksByPublisher(String publisher, Library library) {

		ArrayList<Book> result = new ArrayList<Book>();
		for (int i = 0; i < library.getBooks().size(); i++) {
			if (library.getBook(i).getPublisher().equals(publisher)) {
				result.add(library.getBook(i));

			}
		}

		return result;

	}

	// находит книги выпущенные после заданного года
	public ArrayList<Book> findBooksByYearOfPublishing(int yearOfPublishing, Library library) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (int i = 0; i < library.getBooks().size(); i++) {
			if (library.getBook(i).getYearOfPublishing() > yearOfPublishing) {
				result.add(library.getBook(i));

			}
		}

		return result;

	}

}
