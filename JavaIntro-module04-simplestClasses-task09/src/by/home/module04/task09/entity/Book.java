package by.home.module04.task09.entity;



/*Создать класс Book ,спецификация которого приведена ниже.Определить конструкторы, set- и get- методы и метод toString().
 *  Создать второй класс, агрегирующий массив типа  Book c подходящими конструкторами и методами. 
 *  Задать критерии выбора данных и вывести эти данные на консоль.
 *  Класс Book:id, название, автор,издательство,год издания, количество страниц, цена, тип переплёта.
 *  Найти и вывести:
 *  список книг заданного автора;
 *  список книг, выпущенных заданым издательством;
 *  список книг, выпущенных после заданного года.*/
public class Book {

	private long id;
	private String title;
	private String author;
	private String publisher;
	private int yearOfPublishing;
	private  int numberOfPages;
	private  double price;
	private  String bindingType;

	public Book() {
		id = 0L;
		title = null;
		author=null;
		publisher = null;
		yearOfPublishing = 0;
		numberOfPages = 0;
		price = 0;
		bindingType = null;
	}

	public Book(String title,String author, long id) {
		this.id = id;
		this.title = title;
		this.author=author;
		publisher = null;
		yearOfPublishing = 0;
		numberOfPages = 0;
		price = 0;
		bindingType = null;

	}

	public Book(long id, String title, String author, String publisher, int yearOfPublishing, int numberOfPages, double price,
			String bindingType) {
		this.id = id;
		this.title = title;
		this.author =author;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + numberOfPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+ " [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", yearOfPublishing=" + yearOfPublishing + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}
	
	
	

	

}
