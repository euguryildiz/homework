package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.model.Lesson;

public class LessonService {
	
	List<Lesson> _lessons;
	
	public LessonService() {
		this._lessons = new ArrayList<Lesson>();
	}
	
	public void Add(Lesson lesson) {
		_lessons.add(lesson);
	}
	
	public void Delete(Lesson lesson) {
		int Deleted = _lessons.indexOf(lesson);
		_lessons.remove(Deleted);
	}
	
	public List<Lesson> GetAll() {
		return _lessons;
	}
	
}
