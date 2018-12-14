package com.example.student.androidlistactivitys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterList extends BaseAdapter {

    private ArrayList<ProdData> arrayList;
    Context context;

    public AdapterList (ArrayList<ProdData> listprod, Context context)
    {
        arrayList=listprod;
        this.context=context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1=inflater.inflate(R.layout.list_prod_layout, viewGroup, false);

        TextView nameText = view1.findViewById(R.id.tvDate);
        TextView modelText = view1.findViewById(R.id.tvModel);
        TextView prodText = view1.findViewById(R.id.tvProd);

        ProdData prodData = arrayList.get(i);


        nameText.setText(String.valueOf(prodData.namedat));
        modelText.setText(String.valueOf(prodData.modeldat));
        prodText.setText(String.valueOf(prodData.proddat));


        return view1;
    }
}
