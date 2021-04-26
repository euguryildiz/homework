package homework.model;



public class Category {
	
	int Id;
	String Name;
	
	public Category(int id, String name) {
		this.setId(id);;
		this.setName(name);
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
	

	
}
