package com.example.locationdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {
    ImageView imgpay,imgnext,imgmaster,imgmasternext;
    TextView txtpay,txtmaster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        intview();
    }

    private void intview() {

        imgpay=findViewById(R.id.imgpay);

        imgpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });

        imgnext=findViewById(R.id.imgnext);

        imgnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });

        imgmaster=findViewById(R.id.imgmaster);

        imgmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });

        imgmasternext=findViewById(R.id.imgmasternext);

        imgmasternext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });

        txtpay=findViewById(R.id.txtpay);

        txtpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });

        txtmaster=findViewById(R.id.txtmaster);

        txtmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, ConfirmActivity.class);
                startActivity(i);

            }
        });
    }
}