package com.jpms.exception;


public class CourseNotFoundException extends RuntimeException{

    public CourseNotFoundException(String exception) {
        super(exception);
    }

}
