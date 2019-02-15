package com.example.student.androidlistactivitys;


import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public class ImageMatrixActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_matrix);

        imageView = findViewById(R.id.imageView);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                printMatrixValues(imageView.getImageMatrix());
            }
        });
    }

    private void printMatrixValues(Matrix matrix) {
        float[] values = new float[9];
        matrix.getValues(values);
        Log.i(TAG, String.format("Matrix values:\n" +
                        "%f %f %f\n" +
                        "%f %f %f\n" +
                        "%f %f %f",
                values[Matrix.MSCALE_X], values[Matrix.MSKEW_X], values[Matrix.MTRANS_X],
                values[Matrix.MSKEW_Y], values[Matrix.MSCALE_Y], values[Matrix.MTRANS_Y],
                values[Matrix.MPERSP_0], values[Matrix.MPERSP_1], values[Matrix.MPERSP_2]));
    }
}
