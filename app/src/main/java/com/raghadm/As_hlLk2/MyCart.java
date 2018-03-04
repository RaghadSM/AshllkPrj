package com.raghadm.As_hlLk2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyCart extends AppCompatActivity {
    TextView countText;
     int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);
         countText = (TextView) findViewById(R.id.textView6);
    }


    public void countIN(View view){

        counter++;
        countText.setText(Integer.toString(counter));

    }

    public void countDE(View view){

        counter--;
        countText.setText(Integer.toString(counter));

    }


}
