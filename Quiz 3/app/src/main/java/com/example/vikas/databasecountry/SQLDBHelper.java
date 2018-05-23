package com.example.vikas.databasecountry;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLDBHelper extends SQLiteOpenHelper
{

    public static String DATABASE_NAME = "country.db";
    public static String TABLE_NAME = "country_table";
    public static String COL1 = "COUNTRY";
    public static String COL2 = "CITY";



    public SQLDBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    // on create to create the table

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String onCreateTableString = "CREATE TABLE " + TABLE_NAME + " (COUNTRY TEXT, CITY TEXT)";
        db.execSQL(onCreateTableString);

    }

    // This method when called inserts data to table.
    public boolean insertToTable(String country, String city)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1,country);
        contentValues.put(COL2,city);

        String query="SELECT *  FROM "+ TABLE_NAME + " WHERE " +COL1+ " = ? ";
        String[] selectionArgs = {country};
        Cursor data = db.rawQuery(query, selectionArgs);


        if (data.getCount() > 0)
        {
            return false;
        }

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1)
        {
            return false;
        } else {
            return true;
        }
    }



    public Cursor showData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        // this statement drops the table if it exists
        db.execSQL("DROP  TABLE IF  EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}



