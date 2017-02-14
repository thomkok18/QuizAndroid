package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText answer1, answer2, answer3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (EditText) findViewById(R.id.answerText1);
        answer2 = (EditText) findViewById(R.id.answerText2);
        answer3 = (EditText) findViewById(R.id.answerText3);
    }

    public void answerButton1(View view) {
        String answer = answer1.getText().toString();
        if (answer.matches("Nederland")) {
            Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    public void answerButton2(View view) {
        String answer = answer2.getText().toString();
        if (answer.matches("Nederland")) {
            Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    public void answerButton3(View view) {
        String answer = answer3.getText().toString();
        if (answer.matches("Nederland")) {
            Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }
}