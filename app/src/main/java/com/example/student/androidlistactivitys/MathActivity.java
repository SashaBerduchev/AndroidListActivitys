package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MathActivity extends AppCompatActivity {

    Button btnarray, btnlist, btnmatrix, btncycles;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        btnarray = findViewById(R.id.btnArray);
        btnlist = findViewById(R.id.btnList);
        btnmatrix = findViewById(R.id.btnMatrix);
        btncycles = findViewById(R.id.btnCycles);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        btnarray.startAnimation(animation);
        btnlist.startAnimation(animation);
        btnmatrix.startAnimation(animation);
        btncycles.startAnimation(animation);


        final Intent arrayactivity = new Intent(this, ArrayActivity.class);

        final  Intent listactivity = new Intent(this, ListActivity.class);

        final  Intent cyclesactivity = new Intent(this, CyclesActivity.class);


        btnarray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(arrayactivity);
            }
        });

        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(listactivity);
            }
        });


        btncycles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cyclesactivity);
            }
        });
    }
}
