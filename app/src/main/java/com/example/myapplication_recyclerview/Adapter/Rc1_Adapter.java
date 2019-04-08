package com.example.myapplication_recyclerview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication_recyclerview.Modal.Student;
import com.example.myapplication_recyclerview.R;

import java.util.List;

public class Rc1_Adapter extends  RecyclerView.Adapter<Rc1_Adapter.Myviewholder>{

    private List<Student> StudentList;

    public Rc1_Adapter(List<Student> studentList) {
        StudentList = studentList;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_row, viewGroup, false);

        return new Myviewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder myviewholder, int i) {
       Student stud = StudentList.get(i);
        myviewholder.sid.setText(stud.getSid());
        myviewholder.sname.setText(stud.getSname());
        myviewholder.gender.setText(stud.getGender());
    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder
    {
            public TextView sid,sname,gender;

        public Myviewholder(  View itemView) {
            super(itemView);
            sid=(TextView) itemView.findViewById(R.id.rid);
            sname=(TextView) itemView.findViewById(R.id.rname);
            gender=(TextView) itemView.findViewById(R.id.rgender);

        }
    }

}
