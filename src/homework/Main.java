package homework;


import homework.model.Student;
import homework.service.StudentService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1, "Uður", "Yýldýz", "mail@mail.com");
		
		StudentService studentService = new StudentService();
		
		studentService.Add(student);
		
		for (Student item: studentService.GetAll()) {
			System.out.println(item.getName());
		}
		
	}

}
