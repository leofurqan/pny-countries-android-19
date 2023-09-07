package com.example.countriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.countriesapp.contracts.CountriesContract;
import com.example.countriesapp.helpers.DBHelper;

public class CountriesList extends AppCompatActivity {

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_list);

        dbHelper = new DBHelper(this);

        SQLiteDatabase db = dbHelper.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(CountriesContract.CountryEntry.COLUMN_NAME, "Pakistan");
        values.put(CountriesContract.CountryEntry.COLUMN_FULL_NAME, "Islamic Republic of Pakistan");
        values.put(CountriesContract.CountryEntry.COLUMN_AREA, "881912 KM");
        values.put(CountriesContract.CountryEntry.COLUMN_POPULATION, "220892331");
        values.put(CountriesContract.CountryEntry.COLUMN_FLAG, "https://flagcdn.com/w320/pk.png");
        values.put(CountriesContract.CountryEntry.COLUMN_REGION, "Asia");
        values.put(CountriesContract.CountryEntry.COLUMN_SUBREGION, "Southern Asia");

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(CountriesContract.CountryEntry.TABLE_NAME, null, values);
    }
}