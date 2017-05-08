package com.example.stoyanr.luckyapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private int asignNumber = 0;
    private int luckyNumber = 0;
    private final int DEFAULT_LUCK_ID = 0;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.preferences = this.getSharedPreferences("db", Context.MODE_PRIVATE);

        Bundle bundle = getIntent().getExtras();
        this.asignNumber = bundle.getInt("asignNumber");
        this.luckyNumber = bundle.getInt("luckyNumber");

        this.drawLuck();
    }

    public void drawLuck() {
        int luckId = (int) Math.floor(((this.asignNumber * this.luckyNumber) * Math.random()) % this.preferences.getAll().size());
        String result = this.preferences.getString(String.valueOf(luckId), String.valueOf(DEFAULT_LUCK_ID));

        TextView luckTextView = (TextView) this.findViewById(R.id.luckTextView);
        luckTextView.setText(result);
    }
}
