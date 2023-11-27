package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewActivity extends AppCompatActivity {

    ImageView imgclose,imgfilter;
    TextView txtfilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        intview();
    }

    private void intview() {

        imgclose=findViewById(R.id.imgclose);

        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReviewActivity.this, DetailActivity.class);
                startActivity(i);

            }
        });
        imgfilter=findViewById(R.id.imgfilter);

        imgfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReviewActivity.this, FilterActivity.class);
                startActivity(i);

            }
        });
        txtfilter=findViewById(R.id.txtfilter);

        txtfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReviewActivity.this, FilterActivity.class);
                startActivity(i);

            }
        });

    }
}