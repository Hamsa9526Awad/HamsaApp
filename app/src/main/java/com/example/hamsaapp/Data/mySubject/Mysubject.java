package com.example.hamsaapp.Data.mySubject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity//Entity==Table==جدول

public class Mysubject {

    @PrimaryKey(autoGenerate = true)// تجديد الصفة كمفتاح رئيسي والذي ينتج بشكل تلقائي
    /*** رقم المهمة*/
    public long keyid;//رقم المهمة

    public String title;

    @Override
    public String toString() {
        return "Mysubject{" +
                "keyid=" + keyid +
                ", title='" + title + '\'' +
                '}';
    }

    public long getKeyid() {
        return keyid;
    }

    public String getTitle() {
        return title;
    }

    public void setKeyid(long keyid) {
        this.keyid = keyid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
