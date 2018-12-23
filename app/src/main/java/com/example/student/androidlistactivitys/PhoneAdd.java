package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhoneAdd extends AppCompatActivity {

    TextView textname, textmodel, textprocessor, textram, textgraficscore, textbatterry, textcost;
    Button btnset;

    static final String keyName = "keyName";
    static final String keyModel = "keyModel";
    static final String keyProcessor = "keyProcessor";
    static final String keyRam = "keyRam";
    static final String keyGraficscore = "keyGraficscore";
    static final String keyBattery = "keyBattery";
    static final String keyCost = "keyCost";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_add);

        textname = findViewById(R.id.TextName);
        textmodel = findViewById(R.id.TextModel);
        textprocessor = findViewById(R.id.TextProcessor);
        textram = findViewById(R.id.TextRam);
        textgraficscore = findViewById(R.id.TextGraphicscore);
        textbatterry = findViewById(R.id.TextBattery);
        textcost = findViewById(R.id.TextCost);
        btnset = findViewById(R.id.btnSet);

        final Intent intentdeviceactivity = new Intent(this, DeviceActivity.class);

        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRequest = new Intent();
                intentRequest.putExtra(keyName, String.valueOf(textname.getText()));
                intentRequest.putExtra(keyModel, String.valueOf(textmodel.getText()));
                intentRequest.putExtra(keyProcessor, String.valueOf(textprocessor.getText()));
                intentRequest.putExtra(keyRam, String.valueOf(textram.getText()));
                intentRequest.putExtra(keyGraficscore, String.valueOf(textgraficscore.getText()));
                intentRequest.putExtra(keyBattery, Integer.parseInt(textbatterry.getText().toString()));
                intentRequest.putExtra(keyCost, Integer.parseInt(textcost.getText().toString()));
                setResult(RESULT_OK, intentRequest);

                finish();

                startActivity(intentdeviceactivity);
            }
        });

    }
}
