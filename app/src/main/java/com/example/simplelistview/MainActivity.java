package com.example.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = ("MainActivityTAG_");
    //step 2
    private ListView mListView;

    private EditText mName;

    private String[] mData =
            new String[] {"Chris", "Mike", "Aldo", "Karles", "Libu", "Lisa", "Gwen", "Mary", "Gina", "Tamekia", "Tom", "Bill", "Larry", "Keisha", "Beyonce", "Tina", "Jill", "Karen", "Joe", "Frank"};

    private List<String> dataList =
            Arrays.asList(mData);
//step1
    private ArrayList<String> dataArrayList = new ArrayList<String>(dataList);
//step 4
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName = (EditText) findViewById(R.id.inputName);
//step 3
        mListView = (ListView) findViewById(R.id.mList);

        //step 5
        //pass array of objects
            arrayAdapter =
            new NamesAdapter<String>(
                    this,
                    //android.R.layout.simple_list_item_1, used for default android layout, code below for custom
                    R.layout.list_item,
                    R.id.l_item_txt,
                    dataArrayList);

        //attach adapter to listview
        mListView.setAdapter(arrayAdapter);
    }

    public void addName(View view) {


        //Log.d(TAG, "Name: " + mName.getText());

//step 6
        dataArrayList.add(mName.getText().toString());
//step 7 - built implementation to show changes
        arrayAdapter.notifyDataSetChanged();
    }
}
