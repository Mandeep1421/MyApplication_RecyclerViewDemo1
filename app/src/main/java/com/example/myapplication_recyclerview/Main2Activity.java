package com.example.myapplication_recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication_recyclerview.Modal.Student;

public class Main2Activity extends AppCompatActivity {
private TextView id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
id=findViewById(R.id.rsid);

        Intent i=getIntent();
        Student studobj = (Student) i.getExtras().getSerializable("stud");
        id.setText("Student ID::"+studobj.getSid());
    }
}
