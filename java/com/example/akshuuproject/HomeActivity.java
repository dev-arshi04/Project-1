package com.example.akshuuproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView hotelListView;
    ArrayList<Hotel> hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        hotelListView = findViewById(R.id.hotelListView);
        hotels = new ArrayList<>();

        hotels.add(new Hotel("Taj", "₹5000", R.drawable.hotel1));
        hotels.add(new Hotel("Marriott", "₹4500", R.drawable.hotel2));
        hotels.add(new Hotel("Leela", "₹6000", R.drawable.hotel3));
        hotels.add(new Hotel("Oberoi", "₹5500", R.drawable.hotel4));
        hotels.add(new Hotel("Holiday Inn", "₹4000", R.drawable.hotel5));

        HotelAdapter adapter = new HotelAdapter(this, hotels);
        hotelListView.setAdapter(adapter);

        hotelListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(HomeActivity.this, BookingActivity.class);
            intent.putExtra("hotelName", hotels.get(position).getName());
            intent.putExtra("hotelPrice", hotels.get(position).getPrice());
            startActivity(intent);
        });
    }
}
