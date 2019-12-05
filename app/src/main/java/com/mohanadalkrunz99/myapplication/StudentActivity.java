package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {



    TextView std_id , std_name , std_level , std_avg ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        String id = getIntent().getStringExtra("id");
        String ame = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String avg = getIntent().getStringExtra("avg");


        std_id =  findViewById(R.id.std_id2);
        std_name =  findViewById(R.id.std_name2);
        std_level =  findViewById(R.id.std_level2);
        std_avg =  findViewById(R.id.std_avg2);
//
        std_id.setText("ID :" + getIntent().getStringExtra("id"));
        std_name.setText("Name :" + getIntent().getStringExtra("name"));
        std_level.setText("Level :" + getIntent().getStringExtra("level"));
        std_avg.setText("Avarage :" + getIntent().getStringExtra("avg"));

        }


    }







