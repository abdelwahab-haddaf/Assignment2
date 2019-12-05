package com.mohanadalkrunz99.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentVH> {


    Context context ;
    List<Student> students ;

    public StudentsAdapter(Context context  , List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_note ,parent , false );
        return new StudentVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVH holder, int position) {
        holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }




    class StudentVH extends RecyclerView.ViewHolder{

        TextView std_name , std_id  , std_avg , std_level;
        public StudentVH(@NonNull View itemView) {
            super(itemView);
            std_name = itemView.findViewById(R.id.std_name);
            std_id = itemView.findViewById(R.id.std_id);
            std_avg = itemView.findViewById(R.id.std_avg);
            std_level = itemView.findViewById(R.id.std_level);

        }

        public void setData(final Student student) {
            std_name.setText(student.getStd_name());
            std_id.setText(student.getStd_id());
            std_level.setText(student.getStd_level());
            std_avg.setText(student.getStd_avg());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, student.getStd_name(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() , StudentActivity.class);
                    intent.putExtra("id",student.getStd_id());
                    intent.putExtra("name",student.getStd_name());
                    intent.putExtra("level",student.getStd_level());
                    intent.putExtra("avg",student.getStd_avg());
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
