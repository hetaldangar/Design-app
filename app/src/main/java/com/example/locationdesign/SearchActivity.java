package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    Button btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        intview();

    }

    private void intview() {

        btnnext=findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });
    }


}