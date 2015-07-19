package com.jablibrary;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * @author Jayden
 * @since 2015. 07. 19.
 *
 * This class is Intro activity.
 * Full screen theme apply
 */
public class IntroActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
}
