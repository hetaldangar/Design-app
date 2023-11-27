package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmActivity extends AppCompatActivity {
    Button btnapply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        intview();
    }

    private void intview() {

        btnapply=findViewById(R.id.btnapply);

        btnapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConfirmActivity.this, UserActivity.class);
                startActivity(i);

            }
        });
    }
}