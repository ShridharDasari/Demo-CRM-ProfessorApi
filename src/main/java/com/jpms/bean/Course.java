/**
 * 
 */
package com.jpms.bean;

/**
 * @author Administrator
 *
 */
import java.io.Serializable;


public class Course implements Serializable {
	private Long id;
	private String courseCode;
	private String courseName;

	public Course(Long id, String courseCode, String courseName) {
		this.id = id;
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}