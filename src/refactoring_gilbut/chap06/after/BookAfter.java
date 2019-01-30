package refactoring_gilbut.chap06.after;

public class BookAfter {
	private String title;
	private String isbn;
	private String price;
	private Author author;

	public BookAfter(String title, String isbn, String price, String authorName, String authorMail) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.author = new Author(authorName, authorMail);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthorName() {
		return author.getAuthorName();//위임
	}

	public void setAuthorName(String authorName) {
		this.author.setAuthorName(authorName);//위임
	}

	public String getAuthorMail() {
		return author.getAuthorMail();//위임
	}

	public void setAuthorMail(String authorMail) {
		this.author.setAuthorMail(authorMail);//위임
	}

	public String toXml() {
		String autor = tag("author", tag("name", author.getAuthorName()) + tag("mail", author.getAuthorMail()));
		String book= tag("book", tag("title", title) +"\r\n"+ tag("isbn", isbn) +"\r\n"+ tag("price", price) +"\r\n"+ autor);
		return book;
	}

	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1$s>", element, content); // 1$첫번째 매개변수
	}
}
