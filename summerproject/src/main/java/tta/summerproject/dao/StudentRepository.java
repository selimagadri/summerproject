package tta.summerproject.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import tta.summerproject.entity.Student;

public interface StudentRepository extends  MongoRepository <Student , Integer>{
	
}
