package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    TextView arraynum, array1, array2, sum;
    Button btnArrayCalc;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        arraynum = findViewById(R.id.editArray1);
        array1 = findViewById(R.id.textArray1);
        array2 = findViewById(R.id.textViewArray2);
        sum = findViewById(R.id.ArraySum);
        btnArrayCalc = findViewById(R.id.btnArrayCalc);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        btnArrayCalc.startAnimation(animation);

        btnArrayCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num = Integer.parseInt(arraynum.getText().toString());
                Integer[] arr;

                Arrays.Array array = new Arrays.Array(num);
                arr = array.setArray();
                for (int i=0; i<arr.length; i++)
                {
                    array1.setText(arr[i]);
                }

            }
        });
    }

}
