package com.example.hamsaapp.Data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.hamsaapp.Data.mytasktable.Mytask;
import com.example.hamsaapp.Data.mytasktable.MytaskQuery;
import com.example.hamsaapp.Data.mySubjectsTable.Mysubject;
import com.example.hamsaapp.Data.mySubjectsTable.MysubjectQuery;
import com.example.hamsaapp.Data.myuser.MyUser;
import com.example.hamsaapp.Data.myuser.Myuserquery;

@Database(entities = {MyUser.class, Mysubject.class, Mytask.class},version = 5)

public abstract class AppDataBase extends RoomDatabase {


    private static AppDataBase db;

    public abstract Myuserquery.MyUserQuery getMyUserQuery();

    public abstract MysubjectQuery getMySubjectQuery();

    public abstract MytaskQuery getMyTaskQuery();

    public static AppDataBase getDB(Context context) {
        if (db == null) {
            db = Room.databaseBuilder(context,
                            AppDataBase.class, "database-name")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();


        }
        return db;
    }
}

