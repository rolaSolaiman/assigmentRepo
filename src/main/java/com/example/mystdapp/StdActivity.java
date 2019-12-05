package com.example.mystdapp;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std);

        String id = getIntent().getStringExtra("id");
        String name= getIntent().getStringExtra("name");
        String phone = getIntent().getStringExtra("phone");
        String type = getIntent().getStringExtra("type");
        String address = getIntent().getStringExtra("address");
        String email= getIntent().getStringExtra("email");
        String birthdate = getIntent().getStringExtra("birthdate");
    }
}
