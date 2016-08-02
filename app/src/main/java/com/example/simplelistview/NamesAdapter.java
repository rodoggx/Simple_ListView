package com.example.simplelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class NamesAdapter<S> extends ArrayAdapter<String> {
    private Context context;
    private int resInt;


//step 1 add contsructor

    public NamesAdapter(Context context, int resource) {
        super(context, resource);
    }

    public NamesAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public NamesAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public NamesAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public NamesAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public NamesAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    //step 2
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.list_item, parent, false);

        String name = getItem(position);
        TextView textView = (TextView)customView.findViewById(R.id.l_item_txt);

        textView.setText(name);
        if (name.toLowerCase().charAt(0) == 'a' ||
                name.toLowerCase().charAt(0) == 'e' ||
                name.toLowerCase().charAt(0) == 'i' ||
                name.toLowerCase().charAt(0) == 'o' ||
                name.toLowerCase().charAt(0) == 'u') {
            ImageView imageView = (ImageView) customView.findViewById(R.id.l_item_img);
            imageView.setImageResource(R.drawable.ic_thumb_up_black_24dp);
        }
        return customView;

        //get the actual string from your arraylist with your position
        //create an inflater from the context of the view - XML to view
        //current String.charAt(0) - if it is a vowel/constant then you show image
        // get the reference for textview and the imageview with findviewbyid
        //return the view you just inflated
        //pass an ARRAYLIST in the constructor

     //   String currentString = arrayList.get(position);

      //  return super.getView(position, convertView, parent);
    }
}
