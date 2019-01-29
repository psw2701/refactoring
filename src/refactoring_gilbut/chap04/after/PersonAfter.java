package refactoring_gilbut.chap04.after;

public class PersonAfter {
	private LabelAfter name;
	private LabelAfter mail;

	public PersonAfter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonAfter(LabelAfter name, LabelAfter mail) {
		this.name = name;
		this.mail = mail;
	}

	public PersonAfter(LabelAfter name) {
		this(name, new NullLabel());
	}

	public LabelAfter getName() {
		return name;
	}

	public void setName(LabelAfter name) {
		this.name = name;
	}

	public LabelAfter getMail() {
		return mail;
	}

	public void setMail(LabelAfter mail) {
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
