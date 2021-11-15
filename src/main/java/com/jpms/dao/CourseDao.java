package com.jpms.dao;


import com.jpms.bean.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Repository
public class CourseDao {
    public static List<Course> courses;

    {
        courses = new ArrayList();
        courses.add(new Course(20001L, "C001", "Algebra"));
        courses.add(new Course(20002L, "C002", "Geometry"));
        courses.add(new Course(20003L, "C003", "BioTechnonogy"));
        courses.add(new Course(20004L, "C004", "AppliedScience"));
        courses.add(new Course(20005L, "C005", "Astronomy"));
        courses.add(new Course(20006L, "C006", "Finance"));
        courses.add(new Course(20007L, "C007", "AstroPhysics"));
    }
}