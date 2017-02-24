package com.example.k46f.myschool.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Student extends Person {

    final String LOG_TAG = "Student >>> ";

    private Course course;

    public Student() {
        course = new Course();
    }

    public void approve() {
        Log.i(LOG_TAG, "Student named " + name + "approve.");
    }

    public void reprove() {
        Log.i(LOG_TAG, "Student named " + name + "reprove.");
    }

    public void belongsToCourse(Course courseId){
        Log.i(LOG_TAG, "Student named " + name + "belongs to " + courseId + " Course");
    }
}
