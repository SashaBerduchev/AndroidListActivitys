package com.example.student.androidlistactivitys;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Humen> list;

    public RecyclerViewAdapter(ArrayList<Humen> list){this.list = list;}

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

public class ViewHolder extends RecyclerView.ViewHolder{
        TextView Name;
        TextView Sername;
        TextView Age;
        TextView Height;
        TextView Weight;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            Name = itemView.findViewById(R.id.rv_human_name);
            Sername = itemView.findViewById(R.id.rv_human_sername);
            Age = itemView.findViewById(R.id.rv_human_age);
            Height = itemView.findViewById(R.id.rv_human_height);
            Weight = itemView.findViewById(R.id.rv_human_weight);
        }
}

}

