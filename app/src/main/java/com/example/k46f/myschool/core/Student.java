package com.example.k46f.myschool.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Student extends Person {

    final String LOG_TAG = ">>>>>> Student ";

    public void approve() {
        Log.i(LOG_TAG, "Approve");
    }

    public void reprobate() {
        Log.i(LOG_TAG, "Reprobate");
    }

    public void course(Course course){
        Log.i(LOG_TAG, "Pertain " + course + "Course");
    }
}
