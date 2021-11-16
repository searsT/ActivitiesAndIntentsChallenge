package com.example.activitiesandintentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "comcom.example.activitiesandintentschallenge";
    public String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        choice = getString(R.string.text_2_body);
        intent.putExtra(EXTRA_MESSAGE, choice);
        startActivity(intent);

    }
  public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        choice = getString(R.string.text_1_body);
        intent.putExtra(EXTRA_MESSAGE, choice);
        startActivity(intent);

    }

    public void launchSecondActivity3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        choice = getString(R.string.text_3_body);
        intent.putExtra(EXTRA_MESSAGE, choice);
        startActivity(intent);
    }
}