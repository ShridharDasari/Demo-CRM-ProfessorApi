/**
 * 
 */
package com.jpms.controller;

import com.jpms.bean.EnrolledStudent;
import com.jpms.dao.EnrolledStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
//@RequestMapping("/enrolledStudentService")
public class EnrolledStudentRestController {



	@Autowired
	private EnrolledStudentDao enrolledStudentDao;
	@RequestMapping("/enrolledStudents")
	public List getenrolledStudents() {

		return enrolledStudentDao.list();
	}

	@RequestMapping("/enrolledStudents/{id}")
	public ResponseEntity enrolledStudent(@PathVariable("id") Long id) {

		EnrolledStudent enrolledStudent = enrolledStudentDao.get(id);
		if (enrolledStudent == null) {
			return new ResponseEntity("No EnrolledStudent found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(enrolledStudent, HttpStatus.OK);
	}

	
	
//
//	@PostMapping(value = "/post/enrolledStudents")
//	public ResponseEntity createEnrolledStudent(@RequestBody EnrolledStudent enrolledStudent) {
//
//		enrolledStudentDao.insert(enrolledStudent);
//
//		return new ResponseEntity(enrolledStudent, HttpStatus.OK);
//	}
//
//
//	@DeleteMapping("/delete/enrolledStudents/{id}")
//	public ResponseEntity deleteEnrolledStudent(@PathVariable Long id) {
//
//		if (null == enrolledStudentDao.delete(id)) {
//			return new ResponseEntity("No EnrolledStudent found for ID " + id, HttpStatus.NOT_FOUND);
//		}
//
//		return new ResponseEntity(id, HttpStatus.OK);
//
//	}
//
//	@PutMapping("/put/enrolledStudents/{id}")
//	public ResponseEntity updateEnrolledStudent(@PathVariable Long id, @RequestBody EnrolledStudent enrolledStudent) {
//
//		enrolledStudent = enrolledStudentDao.update(id, enrolledStudent);
//
//		if (null == enrolledStudent) {
//			return new ResponseEntity("No EnrolledStudent found for ID " + id, HttpStatus.NOT_FOUND);
//		}
//
//		return new ResponseEntity(enrolledStudent, HttpStatus.OK);
//	}

}