package com.example.apple.calculatornew;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    TextView textView;
    static String record="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        textView = findViewById(R.id.text);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
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
        final Button delete = findViewById(R.id.delete);


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

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                record = "";
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(getLastLineText().trim());
                double result = num/100;
                textView.setText(record +getLastLineText().trim()+"%"+"\n"+result+"\n");
                setRecord();
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expr = getLastLineText();
                Calculate cal = new Calculate(expr);
                if(cal.isLegal()) {
                    double result = cal.getResult();
                    textView.setText(record + getLastLineText().trim() + "\n" + result + "\n");
                }
                else{
                    Toast.makeText(FirstActivity.this,"表达式非法",Toast.LENGTH_SHORT).show();
                    textView.setText(record + getLastLineText().trim() + "\n"  + "\n");
                }
                setRecord();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(delete());
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

    public String getLastLineText(){
        String text = textView.getText().toString();
        int line = textView.getLayout().getLineCount();
        int start = textView.getLayout().getLineStart(line-1);
        int end = textView.getLayout().getLineEnd(line-1);
        String result = text.substring(start,end);
        return result;
    }

    public String delete(){
            String recordTemp = textView.getText().toString();
            int line = textView.getLayout().getLineCount();
            int start = textView.getLayout().getLineStart(0);
            int end = textView.getLayout().getLineEnd(line - 1);
            if(end-1 == -1){
                return "";
            }
            recordTemp = recordTemp.substring(start, end - 1);
            return recordTemp;
        }


    public void setRecord(){
        String text = textView.getText().toString();
        String temp = "";
        int line = textView.getLayout().getLineCount();
        for(int i=0;i<line;i++) {
            int start = textView.getLayout().getLineStart(i);
            int end = textView.getLayout().getLineEnd(i);
            temp = text.substring(start,end);
            record = record + temp ;
        }
        int offset=textView.getLineCount()*textView.getLineHeight();
        if (offset > textView.getHeight()) {
            textView.scrollTo(0,offset - textView.getHeight());
        }
        Log.d("this", "getRecord: "+record);
    }
}
