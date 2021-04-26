package homework.model;

public class Lesson {
	
	int Id;
	int CategoryId;
	String Name;
	
	public Lesson(int id, int categoryId, String name) {
		this.setId(id);
		this.setCategoryId(categoryId);
		this.setName(name);
	}
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}


}
