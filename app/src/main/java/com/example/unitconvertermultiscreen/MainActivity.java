package com.example.unitconvertermultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.unitconvertermultiscreen.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void secondActivity(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        EditText editText = findViewById(R.id.number);
        String snumber = editText.getText().toString();
        Float number = Float.valueOf(snumber);
        intent.putExtra(EXTRA_MESSAGE, number);
        startActivity(intent);
    }
}