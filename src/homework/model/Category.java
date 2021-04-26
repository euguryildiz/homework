package homework.model;



public class Category {
	
	public Category(int id, String name) {
		this.Id = id;
		this.Name = name;
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
	
	int Id;
	String Name;
	
}
