package com.example.student.androidlistactivitys;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.shapeofview.ShapeOfView;
import com.github.florent37.shapeofview.manager.ClipPathManager;

public class ShapeViewActivity extends AppCompatActivity {

    ShapeOfView triangleView, circleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_view);

        triangleView = findViewById(R.id.triangleView);
        circleView = findViewById(R.id.circleView);


        triangleView.setClipPathCreator(new ClipPathManager.ClipPathCreator() {
            @Override
            public Path createClipPath(int width, int height) {
                final Path path = new Path();

                path.moveTo(0, 0);
                path.lineTo((float) (0.5 * width), height);
                path.lineTo(width, 0);
                path.close();

                return path;
            }
        });

        circleView.setClipPathCreator(new ClipPathManager.ClipPathCreator() {
            @Override
            public Path createClipPath(int width, int height) {
                final  Path path  = new Path();

                path.lineTo((float) (0.5 * width), height);
                path.lineTo(width, 0);
                path.close();

                return path;
            }
        });


    }
}
