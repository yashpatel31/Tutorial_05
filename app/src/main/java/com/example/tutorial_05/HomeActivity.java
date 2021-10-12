package com.example.tutorial_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView fname,lname,email,pass,gender,branch,city;
    String v1,v2,v3,v4,v5,v6,v7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fname = findViewById(R.id.F_name);
        lname = findViewById(R.id.L_name);
        email = findViewById(R.id.Email);
        pass = findViewById(R.id.Pass);
        gender = findViewById(R.id.Gender);
        branch = findViewById(R.id.Branch);
        city = findViewById(R.id.City);

        String v1 = getIntent().getStringExtra("fname");
        String v2 = getIntent().getStringExtra("lname");
        String v3 = getIntent().getStringExtra("email");
        String v4 = getIntent().getStringExtra("pass");
        String v5 = getIntent().getStringExtra("gen");
        String v6 = getIntent().getStringExtra("branch");
        String v7 = getIntent().getStringExtra("city");

        fname.setText(v1);
        lname.setText(v2);
        email.setText(v3);
        pass.setText(v4);
        gender.setText(v5);
        branch.setText(v6);
        city.setText(v7);

    }
}