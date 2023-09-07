package com.example.countriesapp.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.countriesapp.contracts.CountriesContract;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CountriesApp.db";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + CountriesContract.CountryEntry.TABLE_NAME + " (" +
                    CountriesContract.CountryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    CountriesContract.CountryEntry.COLUMN_NAME + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_FULL_NAME + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_AREA + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_POPULATION + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_FLAG + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_REGION + " TEXT," +
                    CountriesContract.CountryEntry.COLUMN_SUBREGION + " TEXT)";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + CountriesContract.CountryEntry.TABLE_NAME;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
