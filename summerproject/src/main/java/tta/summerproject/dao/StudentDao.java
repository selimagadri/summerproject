package tta.summerproject.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import tta.summerproject.entity.Student;

@Repository
public class StudentDao {

	
	private static Map<Integer, Student> students; 
	
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1,"selima","science"));
				put(2, new Student(2,"salem","math"));
				put(3, new Student(3,"mohamed","history"));
				
			}
		};
			
	}
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentById(int id) {
	
		return this.students.get(id);
	}
	public void removeStudentById(int id) {
		students.remove(id);
		
	}
	
	public void updateStudent(Student student) {
		Student s = this.students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), student);
		}
	
	public void insertStudent(Student student) {
		Student s = this.students.put(student.getId(), student);
		
		}
	
}
