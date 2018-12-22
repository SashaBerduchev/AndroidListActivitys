package com.example.student.androidlistactivitys;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Humen> list;

    public RecyclerViewAdapter(ArrayList<Humen> list){this.list = list;}

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resyclerview_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int position) {
        viewHolder.Name.setText(list.get(position).getName());
        viewHolder.Sername.setText(list.get(position).getSername());
        viewHolder.Age.setText(list.get(position).getAge());
        viewHolder.Weight.setText(list.get(position).getHeight());
        viewHolder.Height.setText(list.get(position).getHeight());
    }

    @Override
    public int getItemCount() {
        return list.size();
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

