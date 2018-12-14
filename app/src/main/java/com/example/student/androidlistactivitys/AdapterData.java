package com.example.student.androidlistactivitys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 01.10.2018.
 */

public class AdapterData extends BaseAdapter {


    private ArrayList<Person> listArray;
    private Context context;
    //private String name;
    //private String sername;

    public AdapterData(ArrayList<Person> listArray,  Context context) {
        this.listArray = listArray;
        this.context = context;

    }

    @Override
    public int getCount() {
        return listArray.size();
    }

    @Override
    public Object getItem(int position) {
        return listArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.image_layout_adapter, parent, false);
        Person person = listArray.get(position);

        TextView firstnamedata = view.findViewById(R.id.tvFirstName);
        TextView lastnamedata = view.findViewById(R.id.tvLastName);

        firstnamedata.setText(person.firstName);
        lastnamedata.setText(person.lastName);

        return view;
    }
}



