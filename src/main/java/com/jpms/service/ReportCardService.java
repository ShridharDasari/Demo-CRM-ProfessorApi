package com.jpms.service;


import com.jpms.bean.Course;
import com.jpms.bean.Grade;
import com.jpms.bean.Student;
import com.jpms.exception.CourseNotFoundException;
import com.jpms.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.jpms.dao.CourseDao.courses;
import static com.jpms.dao.EnrolledStudentDao.enrolledStudents;

@Service
public class ReportCardService {

    public Boolean AddGrade_Course(Grade gradeobj) {

//Student Id validation
        Boolean StudentValidated = false;
        for (Student user : enrolledStudents) {
            if (user.getId() == (gradeobj.getId())) {
                System.out.println("Student Validation Completed");
                StudentValidated = true;
                break;
            }
        }
        if (StudentValidated.equals(false)) {
            throw new StudentNotFoundException("Student Not found with ID : " + gradeobj.getId());
        }

        //Course Id validation
        Boolean CourseValidated = false;
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(gradeobj.getSCurseName())) {
                System.out.println("Subject Validation Completed");
                CourseValidated = true;
                break;
            }
        }
        if (CourseValidated.equals(false)) {
            throw new CourseNotFoundException("Course Not found  : " + gradeobj.getSCurseName());
        }

        Boolean gradeAdded = false;
        for (Student user : enrolledStudents) {
            if (user.getId() == (gradeobj.getId())) {
                if (user.getSubject().equalsIgnoreCase(gradeobj.getSCurseName())) {
                    user.setGrade(gradeobj.getGrade());
                    gradeAdded = true;
                    break;
                }
            }
        }

        return gradeAdded;
    }

}
