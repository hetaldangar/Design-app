package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intview();
    }

    private void intview() {

        txtsearch=findViewById(R.id.txtsearch);

        txtsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(i);

            }
        });

    }
}