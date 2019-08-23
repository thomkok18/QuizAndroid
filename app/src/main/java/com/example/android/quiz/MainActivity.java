package com.example.android.quiz;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText answer;
    CheckBox yesCheckbox, noCheckbox;
    ImageView imageA, imageB, imageC;
    Spinner spinner;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = (EditText) findViewById(R.id.answerText1);
        yesCheckbox = (CheckBox) findViewById(R.id.yes);
        noCheckbox = (CheckBox) findViewById(R.id.no);
        imageA = (ImageView) findViewById(R.id.image1);
        imageB = (ImageView) findViewById(R.id.image2);
        imageC = (ImageView) findViewById(R.id.image3);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void imageA(View view) {
        imageA.setSelected(true);
        imageB.setSelected(false);
        imageC.setSelected(false);

        imageA.setBackgroundColor(Color.LTGRAY);
        imageB.setBackgroundColor(Color.TRANSPARENT);
        imageC.setBackgroundColor(Color.TRANSPARENT);
    }

    public void imageB(View view) {
        imageA.setSelected(false);
        imageB.setSelected(true);
        imageC.setSelected(false);

        imageA.setBackgroundColor(Color.TRANSPARENT);
        imageB.setBackgroundColor(Color.LTGRAY);
        imageC.setBackgroundColor(Color.TRANSPARENT);
    }

    public void imageC(View view) {
        imageA.setSelected(false);
        imageB.setSelected(false);
        imageC.setSelected(true);

        imageA.setBackgroundColor(Color.TRANSPARENT);
        imageB.setBackgroundColor(Color.TRANSPARENT);
        imageC.setBackgroundColor(Color.LTGRAY);
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
        String day = answer.getText().toString();
        if (!day.matches("")) {
            if (day.matches("Monday")) {
                Toast.makeText(getApplicationContext(), "The first answer is correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "The first answer is incorrect!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void answerButton2(View view) {
        if (yesCheckbox.isChecked() || noCheckbox.isChecked()) {
            if (yesCheckbox.isChecked()) {
                Toast.makeText(getApplicationContext(), "The second answer is correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "The second answer is incorrect!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void answerButton3(View view) {
        if (imageA.isSelected() || imageB.isSelected() || imageC.isSelected()) {
            if (imageC.isSelected()) {
                Toast.makeText(getApplicationContext(), "The third answer is correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "The third answer is incorrect!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void answerButton4(View view) {
        int planet = spinner.getSelectedItemPosition();
        if (planet != 0) {
            if (planet == 3) {
                Toast.makeText(getApplicationContext(), "The fourth answer is correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "The fourth answer is incorrect!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}