package com.example.akshuuproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    EditText userName, userPhone, userRooms, userDate, userTime;
    Button bookBtn;
    TextView hotelName, hotelPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        hotelName = findViewById(R.id.hotelNameText);
        hotelPrice = findViewById(R.id.hotelPriceText);
        userName = findViewById(R.id.editTextName);
        userPhone = findViewById(R.id.editTextPhone);
        userRooms = findViewById(R.id.editTextRooms);
        userDate = findViewById(R.id.editTextDate);
        userTime = findViewById(R.id.editTextTime);
        bookBtn = findViewById(R.id.buttonBook);

        Intent intent = getIntent();
        hotelName.setText(intent.getStringExtra("hotelName"));
        hotelPrice.setText(intent.getStringExtra("hotelPrice"));

        bookBtn.setOnClickListener(v -> {
            Intent i = new Intent(this, SuccessActivity.class);
            i.putExtra("user", userName.getText().toString());
            i.putExtra("hotel", hotelName.getText().toString());
            startActivity(i);
        });
    }
}
