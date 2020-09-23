package com.example.wafaa.restaruant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    TextView meal , amount , priceVeiw ;
    int nitems , price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        meal=(TextView)findViewById(R.id.meal);
        amount=(TextView)findViewById(R.id.amount);
        priceVeiw=(TextView)findViewById(R.id.viewprice);

    }

    public void sub(View view) {
        String  N = amount.getText().toString();
        nitems=Integer.parseInt(N);
        nitems--;
        amount.setText(nitems+"");
        price =nitems*23;
        priceVeiw.setText(price+"");

    }

    public void add(View view) {
        String  N = amount.getText().toString();
        nitems=Integer.parseInt(N);
        nitems++;
        amount.setText(nitems+"");
        price =nitems*23;
        priceVeiw.setText(price+"");


    }

    public void showToast(View view) {
        Toast.makeText(this," you buy "+nitems+meal.getText().toString()+"by price "+price,Toast.LENGTH_SHORT).show();
    }
}
