package refactoring_gilbut.chap04.before;

public class PersonBefore {
	private  LabelBefore name;
	private  LabelBefore mail;
	public PersonBefore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonBefore(LabelBefore name, LabelBefore mail) {
		this.name = name;
		this.mail = mail;
	}
	
	
	public PersonBefore(LabelBefore name) {
		this.name = name;
	}
	public LabelBefore getName() {
		return name;
	}
	public void setName(LabelBefore name) {
		this.name = name;
	}
	public LabelBefore getMail() {
		return mail;
	}
	public void setMail(LabelBefore mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return String.format("PersonBefore[name=%s, mail=%s]", name==null?"\"(none)\"":name, mail==null?"\"(none)\"":mail);
	}
	
	public void display() {
		if(name !=null) {
			name.display();
		}
		if(mail != null) {
			mail.display();
		}
	}
	
	
}
