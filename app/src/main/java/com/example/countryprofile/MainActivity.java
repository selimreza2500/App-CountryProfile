package com.example.countryprofile;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void my(View view) {
        Intent my = new Intent(MainActivity.this,mayanmar.class);
        startActivity(my);
    }

    public void pk(View view) {
        Intent pk = new Intent(MainActivity.this,pakistan.class);
        startActivity(pk);
    }

    public void india(View view) {
        Intent india = new Intent(MainActivity.this,India.class);
        startActivity(india);
    }

    public void bd(View view) {
        Intent bd = new Intent(MainActivity.this,bangladesh.class);
        startActivity(bd);

    }
}