/**
 * 
 */
package com.jpms.controller;

import com.jpms.bean.Student;
import com.jpms.dao.EnrolledStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
//@RequestMapping("/enrolledStudentService")
public class StudentRestController {



	@Autowired
	private EnrolledStudentDao enrolledStudentDao;
	@RequestMapping("/enrolledStudents")
	public List getenrolledStudents() {

		return enrolledStudentDao.list();
	}

	@RequestMapping("/enrolledStudents/{id}")
	public ResponseEntity enrolledStudent(@PathVariable("id") Long id) {

		Student Student = enrolledStudentDao.get(id);
		if (Student == null) {
			return new ResponseEntity("No EnrolledStudent found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(Student, HttpStatus.OK);
	}



}