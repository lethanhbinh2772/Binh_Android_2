package com.example.myapplication.Util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {
    public static final String PREF_NAME = "Android005";
    public static void setPhoneNumber(String phoneNumber, Context context){
        SharedPreferences sharedPreferences= context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("phoneNumber", phoneNumber);
        editor.apply();
    }
    public static String getPhoneNumber(Context context){
        SharedPreferences sharedPreferences= context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("phoneNumber", null);
    }
}
