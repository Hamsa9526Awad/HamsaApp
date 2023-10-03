package com.example.hamsaapp.Data.myuser;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.hamsaapp.Data.MyTask.Mytask;
import com.example.hamsaapp.Data.MyTask.MytaskQuery;
import com.example.hamsaapp.Data.mySubject.Mysubject;
import com.example.hamsaapp.Data.mySubject.MysubjectQuery;

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
        }
