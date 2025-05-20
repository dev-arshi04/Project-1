package com.example.akshuuproject;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        resultText = findViewById(R.id.textSuccess);

        String user = getIntent().getStringExtra("user");
        String hotel = getIntent().getStringExtra("hotel");

        resultText.setText("Congrats " + user + "! Your stay at " + hotel + " is booked.");
    }
}
