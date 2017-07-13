package com.example.android.baoshantourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView parks = (TextView) findViewById(R.id.parks);

        parks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, ParkActivity.class);
                startActivity(parksIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView shoppingmalls = (TextView) findViewById(R.id.shoppingmalls);

        shoppingmalls.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent shoppingmallsIntent = new Intent(MainActivity.this, ShoppingmallActivity.class);
                startActivity(shoppingmallsIntent);
            }
        });

        TextView universities = (TextView) findViewById(R.id.universities);

        universities.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent universitiesIntent = new Intent(MainActivity.this, UniversityActivity.class);
                startActivity(universitiesIntent);
            }
        });
    }

}
