package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Generic.Generic_Class;
import Generic.Generic_Collection;
import Generic.Generic_Mask;

public class ListActivity extends AppCompatActivity {

    TextView list1, list2, list3;
    TextView intlist, intlist2;
    Button btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list1 = findViewById(R.id.editTextList1);
        list2 = findViewById(R.id.editTextList2);
        list3 = findViewById(R.id.editTextList3);
        intlist = findViewById(R.id.intList);
        intlist2 = findViewById(R.id.intList2);
        btnList = findViewById(R.id.btnList);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Generic_Class generic_class = new Generic_Class();
                intlist.setText(generic_class.SetGenericInt(Integer.parseInt(list1.getText().toString())));
                intlist2.setText(generic_class.SetGenericString(list2.getText().toString()));

                Generic_Collection generic_collection = new Generic_Collection();
                generic_collection.Collection(list2.getText().toString());


                Generic_Mask generic_mask = new Generic_Mask();
                list3.setText(String.valueOf(generic_mask.setMask(Integer.parseInt(list1.getText().toString()), list2.getText().toString(), Double.parseDouble(list3.getText().toString()))));

            }
        });

    }

}
