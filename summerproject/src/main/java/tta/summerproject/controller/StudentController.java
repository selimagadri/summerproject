package tta.summerproject.controller;

//import java.awt.PageAttributes.MediaType;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tta.summerproject.dao.StudentRepository;
import tta.summerproject.entity.Student;

//import tta.summerproject.service.StudentService;

@RestController
@RequestMapping("/user")
public class StudentController {
/*
	@Autowired
	private StudentService studentService ;
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
		}

	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
		}
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id) {
		studentService.removeStudentById(id);
		}
	
	@RequestMapping(method = RequestMethod.PUT)
     public void updateStudent(@RequestBody Student student) {
		this.studentService.updateStudent(student);
		}
	@RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student) {
		this.studentService.insertStudent(student);
		}
*/
	@Autowired
	private StudentRepository repository;

	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student);
		return "Added book with id : " + student.getId();
	}

	@GetMapping("/findAllStudents")
	public List<Student> getStudents() {
		return repository.findAll();
	}

	@GetMapping("/findStudent/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}
	  
}
