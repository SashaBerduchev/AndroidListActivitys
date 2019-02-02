package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import MatrixWork.Matrix;

public class MatrixActivity extends AppCompatActivity {

    Button btnmatrixcalc, imagematrix;
    TextView columntext, rowtext;
    TextView matrixview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);

        btnmatrixcalc = findViewById(R.id.btnMatrixCalc);
        columntext = findViewById(R.id.columnText);
        rowtext = findViewById(R.id.rowText);
        matrixview  = findViewById(R.id.matrixView);
        imagematrix = findViewById(R.id.btnImageMatrix);
        final Intent intent = new Intent(this, ImageMatrixActivity.class);
        btnmatrixcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer column = Integer.getInteger(columntext.getText().toString());
                Integer row = Integer.getInteger(rowtext.getText().toString());
                Integer[][] matrixarray;
                Matrix matrix = new Matrix(column, row);
                matrixarray =  matrix.AddMatrix();

                for (int i=0; i<matrixarray.length; i++)
                {
                    for (int j=0; j<matrixarray[i].length; j++)
                    {
                        matrixview.setText(matrixarray[i][j]);
                    }
                }

                btnmatrixcalc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
