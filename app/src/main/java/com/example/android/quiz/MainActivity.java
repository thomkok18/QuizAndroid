package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText answer;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = (EditText) findViewById(R.id.answerText);
    }

    public void answerButton(View view) {
        String answer1 = answer.getText().toString();
        if (answer1.matches("Nederland")) {
            Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }
}