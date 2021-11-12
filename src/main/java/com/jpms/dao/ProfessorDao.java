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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jpms.bean.Professor;

@Repository
public class ProfessorDao {

	// Dummy database. Initialize with some dummy values.
	private static List<Professor> professors;
	{
		professors = new ArrayList();
		professors.add(new Professor(101, "John", "Doe", "djohn@gmail.com", "121-232-3435","Algebra"));
		professors.add(new Professor(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345","Geometry"));
		professors.add(new Professor(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987","AppliedScience"));
		professors.add(new Professor(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736","Astronomy"));
	}

	/**
	 * Returns list of professors from dummy database.
	 * 
	 * @return list of professors
	 */
	public List list() {
		return professors;
	}

	/**
	 * Return professor object for given id from dummy database. If professor is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            professor id
	 * @return professor object for given id
	 */
	public Professor get(Long id) {

		for (Professor c : professors) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new professor in dummy database. Updates the id and insert new
	 * professor in list.
	 * 
	 * @param professor
	 *            Professor object
	 * @return professor object with updated id
	 */
	public Professor create(Professor professor) {
		professor.setId(System.currentTimeMillis());
		professors.add(professor);
		return professor;
	}

	/**
	 * Delete the professor object from dummy database. If professor not found for
	 * given id, returns null.
	 * 
	 * @param id
	 *            the professor id
	 * @return id of deleted professor object
	 */
	public Long delete(Long id) {

		for (Professor c : professors) {
			if (c.getId().equals(id)) {
				professors.remove(c);
				return id;
			}
		}

		return null;
	}

	/**
	 * Update the professor object for given id in dummy database. If professor
	 * not exists, returns null
	 * 
	 * @param id
	 * @param professor
	 * @return professor object with id
	 */
	public Professor update(Long id, Professor professor) {

		for (Professor c : professors) {
			if (c.getId().equals(id)) {
				professor.setId(c.getId());
				professors.remove(c);
				professors.add(professor);
				return professor;
			}
		}

		return null;
	}

	public void insert(Professor professor) {
		// TODO Auto-generated method stub
		
	}

}