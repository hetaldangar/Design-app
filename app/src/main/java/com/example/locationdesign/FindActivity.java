package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FindActivity extends AppCompatActivity {

    ImageView imgfilter,imgback,imgmap;
    TextView txtfilter,txtmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        intview();
    }

    private void intview() {

        imgfilter=findViewById(R.id.imgfilter);

        imgfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindActivity.this, FilterActivity.class);
                startActivity(i);

            }
        });

        imgback=findViewById(R.id.imgback);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindActivity.this, DetailActivity.class);
                startActivity(i);

            }
        });

        txtfilter=findViewById(R.id.txtfilter);

        txtfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindActivity.this, FilterActivity.class);
                startActivity(i);

            }
        });
        imgmap=findViewById(R.id.imgmap);

        imgmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindActivity.this, MapActivity.class);
                startActivity(i);

            }
        });
        txtmap=findViewById(R.id.txtmap);

        txtmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindActivity.this, MapActivity.class);
                startActivity(i);

            }
        });
    }
}