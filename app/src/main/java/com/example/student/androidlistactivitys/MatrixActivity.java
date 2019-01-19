package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import MatrixWork.Matrix;

public class MatrixActivity extends AppCompatActivity {

    Button btnmatrixcalc;
    TextView columntext, rowtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);

        btnmatrixcalc = findViewById(R.id.btnMatrixCalc);
        columntext = findViewById(R.id.columnText);
        rowtext = findViewById(R.id.rowText);

        btnmatrixcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Matrix matrix = new Matrix(Integer.getInteger(columntext.getText().toString()), Integer.getInteger(rowtext.getText().toString()));
                matrix.AddMatrix();
            }
        });
    }
}
