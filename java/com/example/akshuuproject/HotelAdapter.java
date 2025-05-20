package com.example.akshuuproject;

import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;

public class HotelAdapter extends BaseAdapter {
    Context context;
    ArrayList<Hotel> hotels;
    LayoutInflater inflater;

    public HotelAdapter(Context context, ArrayList<Hotel> hotels) {
        this.context = context;
        this.hotels = hotels;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() { return hotels.size(); }
    @Override
    public Object getItem(int position) { return hotels.get(position); }
    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.item_hotel, null);
        ImageView img = view.findViewById(R.id.hotelImage);
        TextView name = view.findViewById(R.id.hotelName);
        TextView price = view.findViewById(R.id.hotelPrice);

        Hotel h = hotels.get(position);
        img.setImageResource(h.getImage());
        name.setText(h.getName());
        price.setText(h.getPrice());

        return view;
    }
}
