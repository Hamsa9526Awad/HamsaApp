package com.example.hamsaapp.Data.mytask;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao//واجهة استعلامات على قاعدة بيانات
public interface mysubjectQuery
{
    @Query("SELECT * FROM MYSUBJECT")
    List<mysubject> getAllTasks();
    @Insert
    void insertTask(mysubject...t);


}
