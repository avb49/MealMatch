package com.example.artembutbaev.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by artembutbaev on 10/03/2018.
 */

public class ArrayAdapters extends ArrayAdapter<Cards> {

    Context context;

    public ArrayAdapters(Context context, int resourceId, List<Cards> items) {

        super(context, resourceId, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {


        Cards cardItem = getItem(position);

        if(convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.nameOfMeal);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        name.setText(cardItem.getNameOfMeal());
        image.setImageResource(R.mipmap.ic_launcher);

        return convertView;
    }
}
