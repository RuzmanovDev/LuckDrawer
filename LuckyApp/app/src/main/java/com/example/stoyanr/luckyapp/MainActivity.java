package com.example.stoyanr.luckyapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.preferences = getSharedPreferences("db", Context.MODE_PRIVATE);
        this.fillDb();
    }

    private void fillDb() {
        SharedPreferences.Editor editor = this.preferences.edit();
        editor.putString("1","късмет");
        editor.putString("2","много любов");
        editor.putString("3","много пари");
        editor.putString("4","нова кола");
        editor.putString("5","нова къща");
        editor.putString("6","нова работа");
        editor.putString("7","нова придобивка");
        editor.putString("8","ново начало");
        editor.putString("9","бебе");
        editor.putString("10","ядове");
        editor.putString("11","ново ssd");
        editor.putString("12","почивка");
        editor.putString("13","среща");
        editor.putString("14","щастие");
        editor.putString("15","безсмъртие");
        editor.commit();
    }

    public void goToLuckyNumberActivity(View view) {
        int asignNumber = 0;

        switch (view.getId()) {
            case R.id.aries:
                asignNumber = 1;
                break;
            case R.id.tauris:
                asignNumber = 2;
                break;
            case R.id.gemini:
                asignNumber = 3;
                break;
            case R.id.cancer:
                asignNumber = 4;
                break;
            case R.id.leo:
                asignNumber = 5;
                break;
            case R.id.virgo:
                asignNumber = 6;
                break;
            case R.id.libra:
                asignNumber = 7;
                break;
            case R.id.scorpio:
                asignNumber = 8;
                break;
            case R.id.sagittarius:
                asignNumber = 9;
                break;
            case R.id.capricorn:
                asignNumber = 10;
                break;
            case R.id.aquarius:
                asignNumber = 11;
                break;
            case R.id.pisces:
                asignNumber = 12;
                break;
        }

        Intent intent = new Intent(this, LuckyNumberActivity.class);
        intent.putExtra("asignNumber", asignNumber);
        startActivity(intent);
    }
}
