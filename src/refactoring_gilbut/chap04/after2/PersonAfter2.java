package refactoring_gilbut.chap04.after2;

public class PersonAfter2 {
	private LabelAfter2 name;
	private LabelAfter2 mail;

	public PersonAfter2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonAfter2(LabelAfter2 name, LabelAfter2 mail) {
		this.name = name;
		this.mail = mail;
	}

	public PersonAfter2(LabelAfter2 name) {
		this(name, LabelAfter2.newNull());
	}

	public LabelAfter2 getName() {
		return name;
	}

	public void setName(LabelAfter2 name) {
		this.name = name;
	}

	public LabelAfter2 getMail() {
		return mail;
	}

	public void setMail(LabelAfter2 mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return String.format("PersonBefore[name=%s, mail=%s]", name, mail);
	}

	public void display() {
		name.display();
		mail.display();
	}
}
