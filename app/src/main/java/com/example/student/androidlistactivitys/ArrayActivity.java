package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import Arrays.Array;
import Arrays.ArrayFind;
import Arrays.ArraySum;

public class ArrayActivity extends AppCompatActivity {

    TextView arraynum, array2, sum;
    Button btnArrayCalc;
    Animation animation;
    TextView ArrayText;
    TextView textelemview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        arraynum = findViewById(R.id.editArray1);
        ArrayText = findViewById(R.id.ArrayText);
        array2 = findViewById(R.id.textViewArray2);
        sum = findViewById(R.id.ArraySum);
        btnArrayCalc = findViewById(R.id.btnArrayCalc);
        textelemview = findViewById(R.id.textElemView);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        btnArrayCalc.startAnimation(animation);

        btnArrayCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num = Integer.parseInt(arraynum.getText().toString());
                Integer[] arr;

                Array array = new Arrays.Array(num);
                arr = array.setArray();
                for (int i=0; i<arr.length; i++)
                {
                    ArrayText.setText(arr[i]);
                }

                ArrayFind arrayFind = new ArrayFind(arr, num,  Integer.parseInt(textelemview.getText().toString()));
                textelemview.setText(arrayFind.findIndex());

                ArraySum arraySum = new ArraySum(arr, num);
                sum.setText(arraySum.arraySum());

            }
        });
    }

}
