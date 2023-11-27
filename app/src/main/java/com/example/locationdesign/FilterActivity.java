package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FilterActivity extends AppCompatActivity {

    ImageView imgclose;
    Button btnapply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        intview();
    }

    private void intview() {
        imgclose=findViewById(R.id.imgclose);

        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FilterActivity.this,FindActivity.class);
                startActivity(i);

            }
        });

        btnapply=findViewById(R.id.btnapply);

        btnapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FilterActivity.this,CalendarActivity.class);
                startActivity(i);

            }
        });
    }
}