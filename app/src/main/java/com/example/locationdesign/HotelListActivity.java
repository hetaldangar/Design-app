package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HotelListActivity extends AppCompatActivity {
    ImageView imgarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);
        intview();
    }

    private void intview() {

        imgarrow=findViewById(R.id.imgarrow);

        imgarrow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(HotelListActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
    }
}