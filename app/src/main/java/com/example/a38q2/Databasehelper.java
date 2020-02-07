package com.example.a38q2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Databasehelper extends SQLiteOpenHelper {
    public static final String DBName="niki.db";
    public static final String TableName="student";
    public static final String col1="Email";
    public static final String col2="Pass";

    public Databasehelper(Context context) {
        super(context, DBName, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+TableName+"(Email TEXT,Pass TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean Insert(String Email,String Pass)
    {
        SQLiteDatabase sd=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col1,Email);
        cv.put(col2,Pass);
        long ins=sd.insert(TableName,null,cv);
        if(ins==-1)
            return false;
        else
            return true;
    }
}
