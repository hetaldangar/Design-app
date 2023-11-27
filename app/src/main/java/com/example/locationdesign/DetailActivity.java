package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imghotel,imgreview;
    TextView txtreview;
    Button btnbooknow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        intview();
    }

    private void intview() {
        imghotel=findViewById(R.id.imghotel);

        imghotel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailActivity.this, HotelListActivity.class);
                startActivity(i);
            }
        });
        imgreview=findViewById(R.id.imgreview);

        imgreview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailActivity.this, ReviewActivity.class);
                startActivity(i);
            }
        });
        txtreview=findViewById(R.id.txtreview);

        txtreview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailActivity.this, ReviewActivity.class);
                startActivity(i);
            }
        });
        btnbooknow=findViewById(R.id.btnbooknow);

        btnbooknow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailActivity.this, FindActivity.class);
                startActivity(i);
            }
        });

    }
}