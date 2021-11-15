/**
 * 
 */
package com.jpms.controller;

import java.util.List;

import com.jpms.bean.Grade;
import com.jpms.service.ReportCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpms.bean.Professor;
import com.jpms.dao.ProfessorDao;


@RestController
@CrossOrigin
//@RequestMapping("/professorService")
public class ProfessorRestController {

	
	@Autowired
	private ProfessorDao professorDAO;

	
	@RequestMapping("/professors")
		public List getProfessors() {
			
		
		return professorDAO.list();
	}

	@RequestMapping("/professors/{id}")
	public ResponseEntity getProfessor(@PathVariable("id") Long id) {

		Professor professor = professorDAO.get(id);
		if (professor == null) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(professor, HttpStatus.OK);
	}

	
	
	
	@PostMapping(value = "/post/professors")
	public ResponseEntity createProfessor(@RequestBody Professor professor) {

		professorDAO.insert(professor);

		return new ResponseEntity(professor, HttpStatus.OK);
	}



	
	@DeleteMapping("/delete/professors/{id}")
	public ResponseEntity deleteProfessor(@PathVariable Long id) {

		if (null == professorDAO.delete(id)) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

	@PutMapping("/put/professors/{id}")
	public ResponseEntity updateProfessor(@PathVariable Long id, @RequestBody Professor professor) {

		professor = professorDAO.update(id, professor);

		if (null == professor) {
			return new ResponseEntity("No Professor found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(professor, HttpStatus.OK);
	}

	@Autowired
	ReportCardService reportCardService;
	@PostMapping(value = "/post/addGrade")
	public ResponseEntity addGrade(@RequestBody Grade grade) {

		if(reportCardService.AddGrade_Course(grade)){
			return new ResponseEntity("Added Grade",HttpStatus.OK);
		}else{
			return new ResponseEntity("Grade not added as StudentId and Course details did not match",HttpStatus.NOT_FOUND);
		}


	}

}