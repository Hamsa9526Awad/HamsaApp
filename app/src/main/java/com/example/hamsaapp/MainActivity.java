package com.example.hamsaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.hamsaapp.Data.AppDataBase;
import com.example.hamsaapp.Data.mySubjectsTable.Mysubject;
import com.example.hamsaapp.Data.mySubjectsTable.MysubjectQuery;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //iuiyu8i7uii
        setContentView(R.layout.activity_main);
        Log.d("hamsa","onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        // بناء قاعدة بيانات وارجاع مؤشر عليها1
        AppDataBase db= AppDataBase.getDB(getApplicationContext());
        // مؤشر لجدول2
        MysubjectQuery subjectQuery = db.getMySubjectQuery();
        // مثال لاستعمال جدول البيانات
        // بناء كائن من نوع الجدول وتحديد قيم الصفات3
        Mysubject s1=new Mysubject();
        s1.setTitle("Math");
        Mysubject s2=new Mysubject();
        s2.title="Computers"; // set ولكن بطريقة أخرى لأنها public

        //اضافة كائن للجدول4
        subjectQuery.insertsubject(s1);
        subjectQuery.insertsubject(s2);

        //5فحص هل تم حفظ ما سبق
        // استخراج وطباعة جميع معطيات الجدول المواضيع

        List<Mysubject> allsubjects = subjectQuery.getAllsubjects();
        for (Mysubject s: allsubjects) {
            Log.d("Hamsa",s.title);
            Toast.makeText(this, s.title, Toast.LENGTH_SHORT).show();

        }


    }
  
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hamsa","onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hamsa","onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }

}