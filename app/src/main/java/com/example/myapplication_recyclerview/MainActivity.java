package com.example.myapplication_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import com.example.myapplication_recyclerview.Adapter.Rc1_Adapter;
import com.example.myapplication_recyclerview.Modal.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> StudentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Rc1_Adapter mAdapter;
    private Toolbar t1;
    private RecyclerView rc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rc1);
//        t1=findViewById(R.id.t1);
     //   setActionBar(t1);
        mAdapter = new Rc1_Adapter(StudentList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL, 16));
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        data();
mAdapter.notifyDataSetChanged();
    }

private void data()
{
    StudentList.add(new Student("1","samir","Male"));
    StudentList.add(new Student("2","Meshwa","Female"));
    StudentList.add(new Student("3","Gurminder","Female"));
    StudentList.add(new Student("4","Sushmita","Female"));
    StudentList.add(new Student("5","Maninder","Male"));
}


}
