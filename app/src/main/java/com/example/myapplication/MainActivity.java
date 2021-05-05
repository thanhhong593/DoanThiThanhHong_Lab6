package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Student> arrList = new ArrayList<>();
    ArrayAdapter<Student> arrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView1);
        DatabaseHandler databaseHandler= new DatabaseHandler(MainActivity.this);

        databaseHandler.addStudent(new Student("ajshda","112 An Nghi,p5,Quan1","0123972173"));
        arrList= databaseHandler.getAllStudents();
        arrAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrList);
        listView.setAdapter(arrAdapter);


    }
}