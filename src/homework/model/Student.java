package homework.model;

public class Student {

	
	public Student(int id, String name, String surname, String email) {
		this.Id = id;
		this.Name = name;
		this.Surname = surname;
		this.Email = email;
		
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

	int Id;
	String Name;
	String Surname;
	String Email;
}
