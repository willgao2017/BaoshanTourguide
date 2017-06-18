package com.example.android.baoshantourguide;

import android.view.View;
import android.widget.Toast;

/**
 * Created by will on 18/06/2017.
 */

public class ParksClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "open the list of parks", Toast.LENGTH_SHORT).show();
    }
}
