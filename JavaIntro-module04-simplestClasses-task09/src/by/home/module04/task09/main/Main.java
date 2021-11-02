package by.home.module04.task09.main;

import java.util.ArrayList;

import by.home.module04.task09.entity.Book;
import by.home.module04.task09.entity.Library;
import by.home.module04.task09.logic.LibraryLogic;
import by.home.module04.task09.view.View;

public class Main {

	public static void main(String[] args) {

		Library library = new Library();

		View view = new View();

		LibraryLogic logic = new LibraryLogic();

		library.addBook(new Book(1L, "1984", "Джордж Оруэлл", "АСТ", 2015, 320, 10.70, "мягкий перепёт"));
		library.addBook(
				new Book(2L, "Над кукушкиным гнездом", "Кен Кизи", "Эксмо", 2020, 384, 11.16, "твёрдый переплёт"));
		library.addBook(new Book(3L, "Гаражная распродажа", "Кен Кизи", "Эксмо", 2007, 220, 20.06, "твёрдый переплёт"));
		library.addBook(new Book(4L, "В Дороге", "Джек Керуак", "Азбука", 2013, 440, 15.07, "твёрдый переплёт"));
		library.addBook(new Book(5L, "Бродяги дхармы", "Джек Керуак", "Азбука", 2014, 2010, 15.16, "мягкий перепёт"));
		library.addBook(
				new Book(6L, "О дивный новый мир", "Олдос Хаксли", "АСТ", 2011, 390, 21.16, "твёрдый переплёт"));
		library.addBook(
				new Book(7L, "Двери восприятия. Райи ад", "Олдос Хаксли", "АСТ", 2019, 384, 31.16, "твёрдый переплёт"));
		library.addBook(new Book(8L, "Биг Сур", "Джек Керуак", "АСТ", 2005, 234, 17.16, "твёрдый переплёт"));
		library.addBook(new Book(9L, "Пена дней", "Борис Виан", "Азбука", 2021, 440, 43.16, "твёрдый переплёт"));
		library.addBook(new Book(10L, "Триумфальная арка", "Эрих Мария Ремарк", "Азбука", 2003, 500, 50.16,
				"твёрдый переплёт"));

		view.print(library);

		ArrayList<Book> booksByKeruak = logic.findBooksByAuthor("Джек Керуак", library);

		view.print(booksByKeruak);

		ArrayList<Book> booksByAST = logic.findBooksByPublisher("АСТ", library);

		view.print(booksByAST);

		ArrayList<Book> booksByYear = logic.findBooksByYearOfPublishing(2015, library);

		view.print(booksByYear);

	}

}
