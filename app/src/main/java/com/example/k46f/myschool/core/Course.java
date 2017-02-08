package com.example.k46f.myschool.core;

import android.util.Log;

/**
 * Created by k46f on 9/02/2017.
 */

public class Course {

    final String LOG_TAG = ">>>>>> Course ";

    private Integer students;

    public void receiveClasses() {
        Log.i(LOG_TAG, "Receiving Class");

    }

    public void grade(Grade grade) {
        Log.i(LOG_TAG, "Pertain " + grade + " Grade.");
    }

}