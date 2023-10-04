package com.example.hamsaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnsignup;
    private Button btnsignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }

}