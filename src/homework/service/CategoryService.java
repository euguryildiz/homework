package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.model.Category;


public class CategoryService {

	List<Category> _categorys;
	
	public CategoryService() {
		this._categorys = new ArrayList<Category>();
	}
	
	public void Add(Category category) {
		_categorys.add(category);
	}
	public void Deleted(Category category) {
		int Deleted = _categorys.indexOf(category);
		_categorys.remove(Deleted);
	}
	
	public List<Category> GetAll() {
		return _categorys;
	}
	
}
