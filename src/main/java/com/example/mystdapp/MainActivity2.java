package com.example.mystdapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity2  extends AppCompatActivity {
    List<Student> StdList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initData();

    }
        private void initData() {
            StdList.add(new Student("rola abo amra","20153460","9273653","female","dier el balah","rola2m.321@gmail.com","22/6/1997"));
        }

}

