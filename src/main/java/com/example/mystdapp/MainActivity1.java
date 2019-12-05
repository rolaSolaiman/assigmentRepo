package com.example.mystdapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends AppCompatActivity{

    List<Student> StdList = new ArrayList<>();
    RecyclerView Std_rv;
    StdAdapter StdAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        Std_rv = findViewById(R.id.Std_rv);
        Std_rv.setLayoutManager(new LinearLayoutManager(this));
        StdAdapter = new StdAdapter(this ,StdList );
        Std_rv.setAdapter(StdAdapter);
    }

    private void initData() {
        StdList . add(new Student("rola abo amra","20153460","9273653","female","dier el balah","rola2m.321@gmail.com","22/6/1997"));
        StdList . add(new Student("lina timraz","20152334","258612","female","dier el balah","linatimraz@gmail.com","3/3/1997"));
        StdList . add(new Student("rawan eyad","20152514","924982","female","gaza","rawaneyad@gmail.com","19/8/1997"));
        StdList . add(new Student("sabreen elkass","2015951","6586165","female","gaza","sabreenelkass@gmail.com","7/7/1997"));
        StdList . add(new Student("hannen edwan","20152516","1545962","female","jabalia","haneenedwan@gmail.com","11/9/1997"));
    }
}
