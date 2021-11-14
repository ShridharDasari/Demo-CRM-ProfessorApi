/**
 * 
 */
package com.jpms.dao;

/**
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.List;

import com.jpms.bean.EnrolledStudent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EnrolledStudentDao {

	// Dummy database. Initialize with some dummy values.
	private static List<EnrolledStudent> enrolledStudents;
	{
		enrolledStudents = new ArrayList();
		enrolledStudents.add(new EnrolledStudent(101L, "John", "Doe",  "A100","Algebra"));
		enrolledStudents.add(new EnrolledStudent(201L, "Russ", "Smith",  "A200","Geometry"));
		enrolledStudents.add(new EnrolledStudent(301L, "Kate", "Williams",  "A300","AppliedScience"));
		enrolledStudents.add(new EnrolledStudent(401L, "Viral", "Patel", "A400","Astronomy"));
	}

	/**
	 * Returns list of enrolledStudents from dummy database.
	 * 
	 * @return list of enrolledStudents
	 */
	public List list() {
		return enrolledStudents;
	}

	/**
	 * Return enrolledStudent object for given id from dummy database. If enrolledStudent is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            enrolledStudent id
	 * @return enrolledStudent object for given id
	 */
	public EnrolledStudent get(Long id) {

		for (EnrolledStudent c : enrolledStudents) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}


}