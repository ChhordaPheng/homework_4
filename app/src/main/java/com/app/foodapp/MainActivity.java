package com.app.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fruitBtnClickListener(View v){
        //store data by using Bundle
        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", "FRUIT");
        dataBundle.putInt("image", R.drawable.img_1);
        //send data to another activity
        Intent intent = new Intent();
        intent.setClass(this, Foodview.class);
        intent.putExtras(dataBundle);
        startActivity(intent);

    }
    public void vegBtnClickListener(View v){
        //store data by using Bundle
        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", "VEGETABLE");
        dataBundle.putInt("image", R.drawable.img_2);
        //send data to another activity
        Intent intent = new Intent();
        intent.setClass(this, Foodview.class);
        intent.putExtras(dataBundle);
        startActivity(intent);

    }

    public void drinksBtnClickListener(View v){
        //store data by using Bundle
        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", "DRINKS");
        dataBundle.putInt("image", R.drawable.img_3);
        //send data to another activity
        Intent intent = new Intent();
        intent.setClass(this, Foodview.class);
        intent.putExtras(dataBundle);
        startActivity(intent);

    }




    public void callBtnListener(View v){
        Uri number = Uri.parse("tel: 016466831");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void webBtnListener(View v){
        Uri webpage = Uri.parse("https://www.w3schools.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);

    }

}