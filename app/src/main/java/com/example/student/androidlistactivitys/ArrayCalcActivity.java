package com.example.student.androidlistactivitys;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import static java.lang.Integer.parseInt;


public class ArrayCalcActivity extends AppCompatActivity {

    Button btngraph;
    TextView textarg1, textarg2;
    GraphView graphView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_calc);

        btngraph = findViewById(R.id.btnGraph);
        textarg1 = findViewById(R.id.textArg1);
        textarg2= findViewById(R.id.textArg2);
        graphView = findViewById(R.id.graph);



        btngraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer[] arrx = new Integer[30];
                Double[] arry = new Double[30];
                Integer ion, ioff;
                ion = parseInt(textarg1.getText().toString());
                ioff = parseInt(textarg2.getText().toString());
                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                        new DataPoint(ion, Math.pow(ion, 3)),
                        new DataPoint(ioff, Math.pow(ioff, 3))
                });
                graphView.addSeries(series);

                for (Integer i = ion; i < ioff; i++) {
                    arrx[i] = i;
                    arry[i] = Math.pow(i, 2);

                }

                for (Integer i = ion; i < ioff; i++) {


                }


            }
        });
    }
}
