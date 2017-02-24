package com.example.k46f.myschool.core;

import android.util.Log;

/**
 * Created by k46f on 9/02/2017.
 */

public class Course {

    final String LOG_TAG = "Course >>> ";

    private final static Integer studentsQuantity = 25;

    private String courseId;

    private Teacher teacher;

    private Student[] students;

    private Grade grade;


    public Course() {
        courseId = "A";
        teacher = new Teacher();
        students = new Student[studentsQuantity];
        grade = new Grade();
    }

    public void receiveClasses() {
        Log.i(LOG_TAG, "Receiving Class");

    }

}