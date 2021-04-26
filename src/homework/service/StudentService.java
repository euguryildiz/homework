package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.model.Student;


public class StudentService {
	
	List<Student> _students;
	
	public StudentService() {
		this._students = new ArrayList<Student>();
	}
	
	public void Add(Student student) {
		_students.add(student);
	}
	public void Deleted(Student student) {
		int Deleted = _students.indexOf(student);
		_students.remove(Deleted);
	}
	
	public List<Student> GetAll() {
		return _students;
	}
	
}
