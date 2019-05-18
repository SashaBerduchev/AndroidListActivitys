package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComputerAdd extends AppCompatActivity {

    TextView nametext,  modeltext, processortext, coretext, graphicstext, costtext;
    Button btnsetcomputer;

    public  static  String keyNameComputer;
    public  static  String keyModelComputer;
    public  static  String keyProcessorComputer;
    public  static  String keyCoresComputer;
    public  static  String keyGraphicsComputer;
    public  static  String keyCostComputer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_add);
        nametext = findViewById(R.id.textName);
        modeltext = findViewById(R.id.textModel);
        processortext = findViewById(R.id.textProcessor);
        coretext = findViewById(R.id.textCores);
        graphicstext = findViewById(R.id.textGraphics);
        costtext = findViewById(R.id.textCost);
        btnsetcomputer = findViewById(R.id.btnSetComputers);

        final Intent intentdeviceactivity = new Intent(this, DeviceAddActivity.class);

        btnsetcomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRequest = new Intent();
                intentRequest.putExtra(keyNameComputer, String.valueOf(nametext.getText()));
                intentRequest.putExtra(keyModelComputer, String.valueOf(modeltext.getText()));
                intentRequest.putExtra(keyProcessorComputer, String.valueOf(processortext.getText()));
                intentRequest.putExtra(keyCoresComputer, String.valueOf(coretext.getText()));
                intentRequest.putExtra(keyGraphicsComputer, String.valueOf(graphicstext.getText()));
                intentRequest.putExtra(keyCostComputer, String.valueOf(costtext.getText()));
                startActivity(intentdeviceactivity);
            }
        });



    }
}
