package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        if (getActionBar() != null) getActionBar().setDisplayHomeAsUpEnabled(true);

    }

}