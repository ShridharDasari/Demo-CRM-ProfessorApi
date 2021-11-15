/**
 * 
 */
package com.jpms.bean;

/**
 * @author Administrator
 *
 */
import java.io.Serializable;


public class Grade implements Serializable {
	private Long id;
	private String courseName;
	private String grade;


	public Grade(Long id, String courseName, String grade) {
		this.id = id;
		this.courseName = courseName;
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Grade() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getSCurseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


}