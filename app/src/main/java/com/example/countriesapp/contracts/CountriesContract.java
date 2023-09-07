package com.example.countriesapp.contracts;

import android.provider.BaseColumns;

public final class CountriesContract {
    private CountriesContract() {}

    public static class CountryEntry implements BaseColumns {
        public static final String TABLE_NAME = "countries";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_FULL_NAME = "full_name";
        public static final String COLUMN_AREA = "area";
        public static final String COLUMN_POPULATION = "population";
        public static final String COLUMN_FLAG = "flag";
        public static final String COLUMN_REGION = "region";
        public static final String COLUMN_SUBREGION = "subregion";
    }
}
