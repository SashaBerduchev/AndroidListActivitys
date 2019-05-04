package com.example.student.androidlistactivitys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import Notes.Notes;

public class NotepadAdapter extends BaseAdapter {
    private ArrayList<Notes> notepadList;
    private Context context;

    public NotepadAdapter(ArrayList<Notes> arrayList, Context context){
        notepadList = arrayList;
        this.context =context;
    }

    @Override
    public int getCount() {
        return notepadList.size();
    }

    @Override
    public Object getItem(int position) {
        return notepadList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       // View view = inflater.inflate();
        return null;
    }
}
