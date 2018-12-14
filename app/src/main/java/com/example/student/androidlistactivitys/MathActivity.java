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

    Button btnarray, btnlist, btnmatrix;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        btnarray = findViewById(R.id.btnArray);
        btnlist = findViewById(R.id.btnList);
        btnmatrix = findViewById(R.id.btnMatrix);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        btnarray.startAnimation(animation);
        btnlist.startAnimation(animation);
        btnmatrix.startAnimation(animation);



        final Intent arrayactivity = new Intent(this, ArrayActivity.class);

        btnarray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(arrayactivity);
            }
        });
    }
}
