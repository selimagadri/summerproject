package tta.summerproject.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import tta.summerproject.dao.StudentDao;
import tta.summerproject.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}
	
	public void removeStudentById(int id) {
		studentDao.removeStudentById(id);
		}

	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
		}
	public void insertStudent(Student student) {
		this.studentDao.insertStudent(student);
		}

}
