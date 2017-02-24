package com.example.k46f.myschool.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Teacher extends Person {

    final String LOG_TAG = "Teacher >>> ";

    private String course;

    public void approveStudent(Student student) {
        student.approve();

    }

    public void reproveStudent(Student student) {
        student.reprove();
    }

    public void dictateClass(Course courseId){
        courseId.receiveClasses();
        Log.i(LOG_TAG, "Teacher named " + name + " is dictating class to" + courseId + " course.");
    }

}
