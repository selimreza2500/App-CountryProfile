package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bangladesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);


    }

    public void Dhaka(View view) {
        Intent Dhaka = new Intent(bangladesh.this,dhaka.class);
        startActivity(Dhaka);
    }
}