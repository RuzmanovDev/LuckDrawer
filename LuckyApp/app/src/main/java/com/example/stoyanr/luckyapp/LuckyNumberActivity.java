package com.example.stoyanr.luckyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LuckyNumberActivity extends AppCompatActivity {
    private int asignNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);

        Bundle bundle = getIntent().getExtras();
        this.asignNumber = bundle.getInt("asignNumber");
    }

    public void onDrawYourLuck(View view) {
        EditText luckyNumberInput = (EditText) findViewById(R.id.luckyNumberEditText);
        int luckyNumber = Integer.parseInt(luckyNumberInput.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("asignNumber", this.asignNumber);
        intent.putExtra("luckyNumber", luckyNumber);
        startActivity(intent);
    }
}
