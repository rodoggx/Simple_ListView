package com.example.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    private String[] mData =
            new String[] {"Chris", "Mike", "Aldo", "Karles", "Libu", "Lisa", "Gwen", "Mary", "Gina", "Tamekia", "Tom", "Bill", "Larry", "Keisha", "Beyonce", "Tina", "Jill", "Karen", "Joe", "Frank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.mList);

        //pass array of objects
    ArrayAdapter<String> arrayAdapter =
            new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mData);

        //attach adapter to listview
        mListView.setAdapter(arrayAdapter);
    }
}
