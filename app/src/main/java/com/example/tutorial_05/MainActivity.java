package com.example.tutorial_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText fname,lname,email,pass;
    RadioGroup gender;
    Switch branch;
    Spinner city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.et_Fname);
        lname = findViewById(R.id.et_Lname);
        email = findViewById(R.id.et_Email);
        pass = findViewById(R.id.et_Pass);
        gender = findViewById(R.id.rd_Gender);
        branch = findViewById(R.id.swt_branch);
        city = findViewById(R.id.select_city);

    }

    public void showdata(View view) {

        String value = "";
        if(branch.isChecked()){
            value = "MCA";
        }
        else{
            value = "BCA";
        }

        String f_name = fname.getText().toString();
        String l_name = lname.getText().toString();
        String e_mail = email.getText().toString();
        String p_ass = pass.getText().toString();

        int selectedID = gender.getCheckedRadioButtonId();
        RadioButton gn = findViewById(selectedID);

        String g_en = gn.getText().toString();
        String b_ranch = branch.getText().toString();
        String c_ity = city.getSelectedItem().toString();

        Intent i = new Intent(MainActivity.this,HomeActivity.class);

        i.putExtra("fname",f_name);
        i.putExtra("lname",l_name);
        i.putExtra("email",e_mail);
        i.putExtra("pass",p_ass);
        i.putExtra("gen",g_en);
        i.putExtra("branch",b_ranch);
        i.putExtra("city",c_ity);

        startActivity(i);

    }
}