package com.raghadm.As_hlLk2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Button destinationBtn = (Button) findViewById(R.id.destinationButton);
        destinationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), Destination.class);
                startActivity(intent1);
            }
        });

        Button selectDel = (Button) findViewById(R.id.selectDel);
        selectDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        Button PayamentMethod = (Button) findViewById(R.id.paymentbtn);
        PayamentMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), PaymentMethod.class);
                startActivity(intent3);
            }
        });
    }
}
