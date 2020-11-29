package com.example.jobportalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class JobDetailsActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private TextView mTitle;
    private TextView mDate;
    private TextView mDescription;
    private TextView mSkills;
    private TextView mSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);
        toolbar=findViewById(R.id.toolbar_job_details);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Job Details");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        mTitle=findViewById(R.id.job_details_title);
        mDate=findViewById(R.id.job_details_date);
        mDescription=findViewById(R.id.job_details_description);
        mSalary=findViewById(R.id.job_details_salary);
        mSkills=findViewById(R.id.job_details_skills);


        //Receive data from all job activity using intent.

        Intent intent =getIntent();
        String title=intent.getStringExtra("title");
        String date=intent.getStringExtra("date");
        String description=intent.getStringExtra("description");
        String skills=intent.getStringExtra("skills");
        String salary=intent.getStringExtra("salary");

        mTitle.setText(title);
        mDate.setText(date);
        mDescription.setText(description);
        mSalary.setText(salary);
        mSkills.setText(skills);





    }
}