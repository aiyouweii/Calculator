package com.example.apple.calculatornew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        /**
         * 长度单位
         */
        final double[] lengthResult = new double[11];
        final int[] length_item =new int[2];

        Spinner length1 = findViewById(R.id.length1);
        length1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                length_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                length_item[0] = 0;
            }
        });

        final Spinner length2 = findViewById(R.id.length2);
        length2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.length_first);
                TextView textView = findViewById(R.id.length_second);
                double num1 = Double.parseDouble(editText.getText().toString().trim());
                Transform transform = new Transform(num1);
                Log.d("miao", "onItemSelected: "+length_item[0]);
                transform.getLengthResult(length_item[0],lengthResult);
                transform.setTextView(textView,position);
                for(int i=1;i<11;i++){
                    Log.d("miao", "onItemSelected: "+lengthResult[i]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.length_second);
                textView.setText("0.0");
            }
        });


        /**
         * 温度单位
         */

        final double[] temperatureResult = new double[4];
        final int[] temperature_item =new int[2];

        Spinner temperature1 = findViewById(R.id.temperature1);
        temperature1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                temperature_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                temperature_item[0] = 0;
            }
        });

        final Spinner temperature2 = findViewById(R.id.temperature2);
        temperature2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.temperature_first);
                TextView textView = findViewById(R.id.temperature_second);
                double num1 = Double.parseDouble(editText.getText().toString().trim());
                Transform transform = new Transform(num1);
                Log.d("miao", "onItemSelected: "+temperature_item[0]);
                transform.getTemperatureResult(temperature_item[0],temperatureResult);
                transform.setTextView(textView,position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.temperature_second);
                textView.setText("0.0");
            }
        });

        /**
         * 速度单位
         */

        final double[] speedResult = new double[4];
        final int[] speed_item =new int[2];

        Spinner speed1 = findViewById(R.id.speed1);
        speed1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                speed_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                speed_item[0] = 0;
            }
        });

        final Spinner speed2 = findViewById(R.id.speed2);
        speed2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.speed_first);
                TextView textView = findViewById(R.id.speed_second);
                double num1 = Double.parseDouble(editText.getText().toString().trim());
                Transform transform = new Transform(num1);
                Log.d("miao", "onItemSelected: "+speed_item[0]);
                transform.getSpeedResult(speed_item[0],speedResult);
                transform.setTextView(textView,position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.speed_second);
                textView.setText("0.0");
            }
        });


        /**
         * 角度单位
         */

        final double[] angleResult = new double[4];
        final int[] angle_item =new int[2];

        Spinner angle1 = findViewById(R.id.angle1);
        angle1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                angle_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                angle_item[0] = 0;
            }
        });

        final Spinner angle2 = findViewById(R.id.angle2);
        angle2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.angle_first);
                TextView textView = findViewById(R.id.angle_second);
                double num1 = Double.parseDouble(editText.getText().toString().trim());
                Transform transform = new Transform(num1);
                Log.d("miao", "onItemSelected: "+angle_item[0]);
                transform.getAngleResult(angle_item[0],angleResult);
                transform.setTextView(textView,position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.angle_second);
                textView.setText("0.0");
            }
        });

        /**
         * 体积单位
         */

        final double[] volumeResult = new double[6];
        final int[] volume_item =new int[2];

        Spinner volume1 = findViewById(R.id.volume1);
        volume1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                volume_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                volume_item[0] = 0;
            }
        });

        final Spinner volume2 = findViewById(R.id.volume2);
        volume2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.volume_first);
                TextView textView = findViewById(R.id.volume_second);
                double num1 = Double.parseDouble(editText.getText().toString().trim());
                Transform transform = new Transform(num1);
                Log.d("miao", "onItemSelected: "+volume_item[0]);
                transform.getVolumeResult(volume_item[0],volumeResult);
                transform.setTextView(textView,position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.system_second);
                textView.setText("0.0");
            }
        });

        /**
         * 进制转换
         */

        final String[] systemResult = new String[5];
        final int[] system_item =new int[2];

        Spinner system1 = findViewById(R.id.system1);
        system1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                system_item[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                system_item[0] = 0;
            }
        });

        final Spinner system2 = findViewById(R.id.system2);
        system2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText editText = findViewById(R.id.system_first);
                TextView textView = findViewById(R.id.system_second);
                //double num1 = Double.parseDouble(editText.getText().toString().trim());
                String num = editText.getText().toString().trim();
                Transform transform = new Transform(num);
                Log.d("miao", "onItemSelected: "+system_item[0]);
                transform.getSystemResult(system_item[0],systemResult);
                transform.setSystemTextView(textView,position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView textView = findViewById(R.id.system_second);
                textView.setText("0.0");
            }
        });
    }
}
