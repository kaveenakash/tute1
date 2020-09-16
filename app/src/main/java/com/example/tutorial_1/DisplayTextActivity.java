package com.example.tutorial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA);
        TextView txt = findViewById(R.id.txt3);
        txt.setText(message);
    }
}