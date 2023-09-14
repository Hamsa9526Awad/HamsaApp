package com.example.hamsaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //iuiyu8i7uii
        setContentView(R.layout.activity_main);
        Log.d("hamsa","u");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hamsa","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hamsa","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hamsa","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}