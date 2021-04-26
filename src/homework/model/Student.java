package homework.model;

public class Student {

	int Id;
	String Name;
	String Surname;
	String Email;
	
	public Student(int id, String name, String surname, String email) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
		this.setEmail(email);
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}


}
