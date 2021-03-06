package com.example.android.baoshantourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.baoshantourguide.R;

import java.util.ArrayList;

import static android.R.attr.x;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_list);

        // Create a list of words
        ArrayList<Unit> words = new ArrayList<Unit>();
        words.add(new Unit(getResources().getString(R.string.park01_name), getResources().getString(R.string.park01_address), R.drawable.guchun_park));
        words.add(new Unit(getResources().getString(R.string.park02_name), getResources().getString(R.string.park02_address), R.drawable.linjiang_park));
        words.add(new Unit(getResources().getString(R.string.park03_name), getResources().getString(R.string.park03_address), R.drawable.luoxi_park));
        words.add(new Unit(getResources().getString(R.string.park04_name), getResources().getString(R.string.park04_address), R.drawable.senlin_park));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        UnitAdapter adapter =
                new UnitAdapter(this, words, R.color.category_parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
