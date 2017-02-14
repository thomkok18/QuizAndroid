package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText answer1;
    CheckBox yesCheckbox, noCheckbox;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (EditText) findViewById(R.id.answerText1);
        yesCheckbox = (CheckBox) findViewById(R.id.yes);
        noCheckbox = (CheckBox) findViewById(R.id.no);

    }

    public void checkboxYes(View view) {
        if (yesCheckbox.isChecked()) {
            noCheckbox.setChecked(false);
        }
    }
    public void checkboxNo(View view) {
        if (noCheckbox.isChecked()) {
            yesCheckbox.setChecked(false);
        }
    }

    public void answerButton1(View view) {
        String answer = answer1.getText().toString();
        if (answer.matches("Monday")) {
            Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    public void answerButton2(View view) {
        if (yesCheckbox.isChecked()) {
            Toast.makeText(getApplicationContext(), "The second answer is correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "The second answer is incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    public void answerButton3(View view) {

    }
}