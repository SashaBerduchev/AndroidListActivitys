package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Cycles.BreakSample;
import Cycles.ContinueRunner;
import Cycles.DoWhileRunner;
import Cycles.Embedded;
import Cycles.FirstTask;
import Cycles.ForRunner;
import Cycles.SecondTask;
import Cycles.Tab_task;
import Cycles.TherdTask;

public class CyclesActivity extends AppCompatActivity {

    TextView textviewnum, textpoint, textView3, textView4, textFirstTask, textSecondTask, textTherdTask;
    Button btnCyclesDo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycles);

        textviewnum = findViewById(R.id.textViewNum);
        textpoint = findViewById(R.id.textpoint);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textFirstTask = findViewById(R.id.textFirstTask);
        textSecondTask = findViewById(R.id.textSecondTask);
        textTherdTask = findViewById(R.id.textTherdTask);
        btnCyclesDo = findViewById(R.id.btnCycleDo);

        btnCyclesDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer num = Integer.parseInt(textviewnum.getText().toString());
                Integer point = Integer.parseInt(textpoint.getText().toString());
                BreakSample breakSample = new BreakSample();
                textView3.setText(breakSample.breakSample(num));

                ContinueRunner continueRunner = new ContinueRunner();
                textView4.setText(continueRunner.setRunner(num));

                DoWhileRunner doWhileRunner = new DoWhileRunner();
                doWhileRunner.doWhileRunner(num);

                Embedded embedded = new Embedded();
                embedded.doEmbedded(num, point);

                FirstTask firstTask = new FirstTask();
                textFirstTask.setText(firstTask.Task(num));

                ForRunner forRunner = new ForRunner();
                forRunner.Runner();

                SecondTask secondTask = new SecondTask();
                textSecondTask.setText(secondTask.Task(num));

                Tab_task tab_task = new Tab_task();
                tab_task.tab_task(num);

                TherdTask therdTask = new TherdTask();
                textTherdTask.setText(therdTask.Task(num));

            }
        });



    }
}
