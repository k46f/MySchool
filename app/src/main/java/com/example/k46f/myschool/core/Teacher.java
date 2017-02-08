package com.example.k46f.myschool.core;

/**
 * Created by k46f on 8/02/2017.
 */

public class Teacher extends Person {

    final String LOG_TAG = ">>>>>> Teacher ";

    public void approveStudent(Student student) {
        student.approve();

    }

    public void reprobateStudent(Student student) {
        student.reprobate();
    }

    public void dictateClass(Course course){
        course.receiveClasses();
    }

}
