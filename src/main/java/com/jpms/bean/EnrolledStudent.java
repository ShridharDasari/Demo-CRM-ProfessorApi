/**
 * 
 */
package com.jpms.bean;

/**
 * @author Administrator
 *
 */
import java.io.Serializable;
import java.util.Date;


public class EnrolledStudent implements Serializable {
	private Long id;
	private String firstName;
	private String lastName;
	private String rollNumber;
	private String subject;


	public EnrolledStudent(Long id, String firstName, String lastName, String rollNumber, String subject) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
		this.subject = subject;
	}

	
	public EnrolledStudent() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Long getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(Long studentId) {
//		this.studentId = studentId;
//	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


}