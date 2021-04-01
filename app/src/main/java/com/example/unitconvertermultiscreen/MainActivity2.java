package com.example.unitconvertermultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Float number = intent.getFloatExtra(MainActivity.EXTRA_MESSAGE, 0 );

        TextView textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(number*1000));
    }
}