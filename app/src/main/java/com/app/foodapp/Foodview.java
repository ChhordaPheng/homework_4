package com.app.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Foodview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodview);
        Bundle dataBundle = getIntent().getExtras();
        String foodName = dataBundle.getString("name");
        Drawable foodImg = getResources().getDrawable(dataBundle.getInt("image"));
        TextView foodTxtView = (TextView)  findViewById(R.id.foodtextview);
        ImageView foodImageView = (ImageView) findViewById(R.id.foodimageview);
        foodTxtView.setText(foodName);
        foodImageView.setImageDrawable(foodImg);


    }



}