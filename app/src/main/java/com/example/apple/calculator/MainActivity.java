package com.example.apple.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        textView = findViewById(R.id.text);
        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button div = findViewById(R.id.div);
        Button mul = findViewById(R.id.mul);
        Button point = findViewById(R.id.point);
        Button percent = findViewById(R.id.percent);
        Button clear = findViewById(R.id.clear);
        Button equ = findViewById(R.id.equ);
        Button delete = findViewById(R.id.delete);

        num0.setOnClickListener(new myClickListener());
        num1.setOnClickListener(new myClickListener());
        num2.setOnClickListener(new myClickListener());
        num3.setOnClickListener(new myClickListener());
        num4.setOnClickListener(new myClickListener());
        num5.setOnClickListener(new myClickListener());
        num6.setOnClickListener(new myClickListener());
        num7.setOnClickListener(new myClickListener());
        num8.setOnClickListener(new myClickListener());
        num9.setOnClickListener(new myClickListener());
        add.setOnClickListener(new myClickListener());
        sub.setOnClickListener(new myClickListener());
        div.setOnClickListener(new myClickListener());
        mul.setOnClickListener(new myClickListener());
        point.setOnClickListener(new myClickListener());
        percent.setOnClickListener(new myClickListener());

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

    }

    class myClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Button bt = findViewById(v.getId());
            textView.setText(textView.getText() + bt.getText().toString());
        }
    }
}
