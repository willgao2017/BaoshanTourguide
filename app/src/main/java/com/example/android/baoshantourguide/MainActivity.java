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

        ParksClickListener clickListener = new ParksClickListener();

        TextView parks = (TextView)findViewById(R.id.parks);

        parks.setOnClickListener(clickListener);
    }



}
