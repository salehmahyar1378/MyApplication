package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String Databasename="info.db";
    private static final int version=1;
    private static final String TABLENAME ="weight";
    private static final String dID="id";
    private static final String dDate="date";
    private static final String dWEIGHT="weight";

    public DatabaseManager(Context context) {
        super(context, Databasename, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase cdb) {

        String cQuery="CREATE TABLE " + TABLENAME + "( " + dID + "INTEGER PRIMARY KEY UNIQUE, " + dWEIGHT + " DOUBLE, " + dDate + " VARCHAR );";
        cdb.execSQL(cQuery);
        Log.i(TAG, "onCreate: dorostamal kard ");
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertPerson(Person iperson){
        SQLiteDatabase idb=this.getWritableDatabase();
        ContentValues icv=new ContentValues();
        icv.put(dID,iperson.dID);
        icv.put(dDate,iperson.dDATE);
        icv.put(dWEIGHT,iperson.dWEIGHT);
        idb.insert(TABLENAME,null,icv);
        idb.close();

    }

}
