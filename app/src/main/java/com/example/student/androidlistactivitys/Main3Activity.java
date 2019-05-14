package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import DataBaseHelpers.ProdDataDBHelper;

public class Main3Activity extends AppCompatActivity {

    Button btnset;
    TextView nametext;
    TextView modelText;
    TextView prodtext;
    ProdDataDBHelper dataDBHelper;
    Animation animation, btnanim;
    public static String keyName = "keyName";
    public static String keyModel = "keyModel";
    public static String keyProd = "keyProd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Intent intent = new Intent(this, Main4Activity.class);


        btnset= findViewById(R.id.btnSet);
        nametext = findViewById(R.id.textName);
        modelText = findViewById(R.id.modelText);
        prodtext = findViewById(R.id.prodText);
        dataDBHelper = new ProdDataDBHelper(this);
        animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);
        nametext.startAnimation(animation);
        modelText.startAnimation(animation);
        prodtext.startAnimation(animation);
        btnanim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        btnset.startAnimation(btnanim);
        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra(keyName, String.valueOf(nametext.getText()));
                intent.putExtra(keyModel, String.valueOf(modelText.getText()));
                intent.putExtra(keyProd, String.valueOf(prodtext.getText()));
                setResult(RESULT_OK, intent);
                startActivity(intent);
                dataDBHelper.addData(nametext.getText().toString(), modelText.getText().toString(), prodtext.getText().toString());

            }
        });
    }


}
