package com.example.apple.calculatornew;

import android.widget.TextView;

public class Transform {

    private double num1;
    private String num;
    private double[] result = new double[11];
    private String[] systemResult = new String[5];

    public Transform(double num1){
        this.num1 = num1;
    }

    public Transform(String num){
        this.num = num;
    }

    public void getLengthResult(int item,double[] lengthResult){
        switch(item){
            case 0://千米
                lengthResult[1] = num1;//千米
                lengthResult[2] = 1000*num1;//米
                lengthResult[3] = 10000*num1;//分米
                lengthResult[4] = 100000*num1;//厘米
                lengthResult[5] = 1000000*num1;//毫米
                lengthResult[6] = 1E9*num1;//微米
                lengthResult[7] = 1E12*num1;//纳米
                lengthResult[8] = 1E15*num1;//皮米
                lengthResult[9] = 39370*num1;//英寸
                lengthResult[10] = 3280.84*num1;//英尺
                break;
            case 1://米
                lengthResult[1] = 0.001*num1;//千米
                lengthResult[2] = num1;//米
                lengthResult[3] = 10*num1;//分米
                lengthResult[4] = 100*num1;//厘米
                lengthResult[5] = 1000*num1;//毫米
                lengthResult[6] = 1000000*num1;//微米
                lengthResult[7] = 1E9*num1;//纳米
                lengthResult[8] = 1E12*num1;//皮米
                lengthResult[9] = 39.370*num1;//英寸
                lengthResult[10] = 3.28084*num1;//英尺
                break;
            case 2://分米
                lengthResult[1] = 0.0001*num1;//千米
                lengthResult[2] = 0.1*num1;//米
                lengthResult[3] = num1;//分米
                lengthResult[4] = 10*num1;//厘米
                lengthResult[5] = 100*num1;//毫米
                lengthResult[6] = 100000*num1;//微米
                lengthResult[7] = 1E8*num1;//纳米
                lengthResult[8] = 1E11*num1;//皮米
                lengthResult[9] = 3.9370*num1;//英寸
                lengthResult[10] = 0.328084*num1;//英尺
                break;
            case 3://厘米
                lengthResult[1] = 0.00001*num1;//千米
                lengthResult[2] = 0.01*num1;//米
                lengthResult[3] = 0.1*num1;//分米
                lengthResult[4] = num1;//厘米
                lengthResult[5] = 10*num1;//毫米
                lengthResult[6] = 10000*num1;//微米
                lengthResult[7] = 1E7*num1;//纳米
                lengthResult[8] = 1E10*num1;//皮米
                lengthResult[9] = 0.39370*num1;//英寸
                lengthResult[10] = 0.0328084*num1;//英尺
                break;
            case 4://毫米
                lengthResult[1] = 0.000001*num1;//千米
                lengthResult[2] = 0.001*num1;//米
                lengthResult[3] = 0.01*num1;//分米
                lengthResult[4] = 0.1*num1;//厘米
                lengthResult[5] = num1;//毫米
                lengthResult[6] = 1000*num1;//微米
                lengthResult[7] = 1E6*num1;//纳米
                lengthResult[8] = 1E9*num1;//皮米
                lengthResult[9] = 0.039370*num1;//英寸
                lengthResult[10] = 0.00328084*num1;//英尺
                break;
            case 5://微米
                lengthResult[1] = 1E-9*num1;//千米
                lengthResult[2] = 1E-6*num1;//米
                lengthResult[3] = 1E-5*num1;//分米
                lengthResult[4] = 0.0001*num1;//厘米
                lengthResult[5] = 0.001*num1;//毫米
                lengthResult[6] = num1;//微米
                lengthResult[7] = 1000*num1;//纳米
                lengthResult[8] = 1000000*num1;//皮米
                lengthResult[9] = 0.0000394*num1;//英寸
                lengthResult[10] = 3.2808E-6*num1;//英尺
                break;
            case 6://纳米
                lengthResult[1] = 1E-12*num1;//千米
                lengthResult[2] = 1E-9*num1;//米
                lengthResult[3] = 1E-8*num1;//分米
                lengthResult[4] = 1E-7*num1;//厘米
                lengthResult[5] = 1E-6*num1;//毫米
                lengthResult[6] = 0.001*num1;//微米
                lengthResult[7] = num1;//纳米
                lengthResult[8] = 1000*num1;//皮米
                lengthResult[9] = 3.9370E-8*num1;//英寸
                lengthResult[10] = 3.2808E-9*num1;//英尺
                break;
            case 7://皮米
                lengthResult[1] = 1E-15*num1;//千米
                lengthResult[2] = 1E-12*num1;//米
                lengthResult[3] = 1E-11*num1;//分米
                lengthResult[4] = 1E-10*num1;//厘米
                lengthResult[5] = 1E-9*num1;//毫米
                lengthResult[6] = 0.000001*num1;//微米
                lengthResult[7] = 0.001*num1;//纳米
                lengthResult[8] = num1;//皮米
                lengthResult[9] = 3.9370E-11*num1;//英寸
                lengthResult[10] = 3.2808E-12*num1;//英尺
                break;
            case 8://英寸
                lengthResult[1] = 0.0000254*num1;//千米
                lengthResult[2] = 0.0254*num1;//米
                lengthResult[3] = 0.254*num1;//分米
                lengthResult[4] = 2.54*num1;//厘米
                lengthResult[5] = 25.4*num1;//毫米
                lengthResult[6] = 25400*num1;//微米
                lengthResult[7] = 25400000*num1;//纳米
                lengthResult[8] = 2.54E10*num1;//皮米
                lengthResult[9] = num1;//英寸
                lengthResult[10] = 0.0833333*num1;//英尺
                break;
            case 9://英尺
                lengthResult[1] = 0.0003048	*num1;//千米
                lengthResult[2] = 0.3048*num1;//米
                lengthResult[3] = 3.048*num1;//分米
                lengthResult[4] = 30.48*num1;//厘米
                lengthResult[5] = 304.8*num1;//毫米
                lengthResult[6] = 304800*num1;//微米
                lengthResult[7] = 304800000*num1;//纳米
                lengthResult[8] = 3.048E11*num1;//皮米
                lengthResult[9] = 12*num1;//英寸
                lengthResult[10] = num1;//英尺
                break;
        }

        result = lengthResult;
    }

    public void getTemperatureResult(int item,double[] temperatureResult){
        switch(item){
            case 0://摄氏度
                temperatureResult[1] = num1;//摄氏度
                temperatureResult[2] = 33.8*num1;//华氏度
                temperatureResult[3] = 274.15*num1;//开氏度
                break;
            case 1://华氏度
                temperatureResult[1] = -17.2222222*num1;//摄氏度
                temperatureResult[2] = num1;//华氏度
                temperatureResult[3] = 255.9277778*num1;//开氏度
                break;
            case 2://开氏度
                temperatureResult[1] = -272.15*num1;//摄氏度
                temperatureResult[2] = -457.87*num1;//华氏度
                temperatureResult[3] = 10000*num1;//开氏度
                break;

        }

        result = temperatureResult;
    }

    public void getSpeedResult(int item,double[] speedResult){
        switch(item){
            case 0://米每秒
                speedResult[1] = num1;//米每秒
                speedResult[2] = 3.6*num1;//千米每时
                speedResult[3] = 3.3356E-9*num1;//光速
                break;
            case 1://千米每时
                speedResult[1] = 0.2777778*num1;//米每秒
                speedResult[2] = num1;//千米每时
                speedResult[3] = 9.2657E-10*num1;//光速
                break;
            case 2://光速
                speedResult[1] = 3E8*num1;//米每秒
                speedResult[2] = 1079252848.8*num1;//千米每时
                speedResult[3] = num1;//光速
                break;
        }

        result = speedResult;
    }

    public void getAngleResult(int item,double[] angleResult){
        switch(item){
            case 0://度
                angleResult[1] = num1;//度
                angleResult[2] = 60*num1;//分
                angleResult[3] = 0.0174533*num1;//弧度
                break;
            case 1://分
                angleResult[1] = 0.0166667*num1;//度
                angleResult[2] = num1;
                angleResult[3] = 0.0002909*num1;//弧度
                break;
            case 2://弧度
                angleResult[1] = 57.29578*num1;//度
                angleResult[2] = 3437.7468*num1;//分
                angleResult[3] = num1;//弧度
                break;
        }

        result = angleResult;
    }

    public void getVolumeResult(int item,double[] volumeResult){
        switch(item){
            case 0://立方米
                volumeResult[1] = num1;//立方米
                volumeResult[2] = 1000*num1;//立方分米
                volumeResult[3] = 1E9*num1;//立方厘米
                volumeResult[4] = 1000*num1;//升
                volumeResult[5] = 1000000*num1;//毫升
                break;
            case 1://立方分米
                volumeResult[1] = 0.001*num1;//立方米
                volumeResult[2] = num1;//立方分米
                volumeResult[3] = 1000*num1;//立方厘米
                volumeResult[4] = num1;//升
                volumeResult[5] = 1000*num1;//毫升
                break;
            case 2://立方厘米
                volumeResult[1] = 1E-6*num1;//立方米
                volumeResult[2] = 0.001*num1;//立方分米
                volumeResult[3] = num1;//立方厘米
                volumeResult[4] = 0.001*num1;//升
                volumeResult[5] = num1;//毫升
                break;
            case 3://升
                volumeResult[1] = 0.001*num1;//立方米
                volumeResult[2] = num1;//立方分米
                volumeResult[3] = 1000*num1;//立方厘米
                volumeResult[4] = num1;//升
                volumeResult[5] = 1000*num1;//毫升
                break;
            case 4://毫升
                volumeResult[1] = 1E-6*num1;//立方米
                volumeResult[2] = 0.001*num1;//立方分米
                volumeResult[3] = num1;//立方厘米
                volumeResult[4] = 0.001*num1;//升
                volumeResult[5] = num1;//毫升
                break;
        }

        result = volumeResult;
    }

    public void getSystemResult(int item,String[] systemResult){
        switch(item){
            case 0://二进制
                systemResult[1] = num;//二进制
                systemResult[2] = Integer.toOctalString(Integer.parseInt(num,2));//八进制
                systemResult[3] = Integer.toHexString(Integer.parseInt(num,2));//十六进制
                systemResult[4] = Integer.parseInt(num,2)+"";//十进制
                break;
            case 1://八进制
                systemResult[1] = Integer.toBinaryString(Integer.parseInt(num,8));;//二进制
                systemResult[2] = num;//八进制
                systemResult[3] = Integer.toHexString(Integer.parseInt(num,8));//十六进制
                systemResult[4] = Integer.parseInt(num,8)+"";//十进制
                break;
            case 2://十六进制
                systemResult[1] = Integer.toBinaryString(Integer.parseInt(num,16));//二进制
                systemResult[2] = Integer.toOctalString(Integer.parseInt(num,16));//八进制
                systemResult[3] = num;//十六进制
                systemResult[4] = Integer.parseInt(num,16)+"";//十进制
                break;
            case 3://十进制
                systemResult[1] = Integer.toBinaryString(Integer.parseInt(num,10));//二进制
                systemResult[2] = Integer.toOctalString(Integer.parseInt(num,10));//八进制
                systemResult[3] = Integer.toHexString(Integer.parseInt(num,10));//十六进制
                systemResult[4] = num;//十进制
                break;
        }
        this.systemResult = systemResult;
    }

    public void setTextView(TextView textView,int item){
        switch(item) {
            case 1:
                textView.setText(result[1]+"");
                break;
            case 2:
                textView.setText(result[2]+"");
                break;
            case 3:
                textView.setText(result[3]+"");
                break;
            case 4:
                textView.setText(result[4]+"");
                break;
            case 5:
                textView.setText(result[5]+"");
                break;
            case 6:
                textView.setText(result[6]+"");
                break;
            case 7:
                textView.setText(result[7]+"");
                break;
            case 8:
                textView.setText(result[8]+"");
                break;
            case 9:
                textView.setText(result[9]+"");
                break;
            case 10:
                textView.setText(result[10]+"");
                break;
        }
    }

    public void setSystemTextView(TextView textView,int item){
        switch(item) {
            case 1:
                textView.setText(systemResult[1]+"");
                break;
            case 2:
                textView.setText(systemResult[2]+"");
                break;
            case 3:
                textView.setText(systemResult[3]+"");
                break;
            case 4:
                textView.setText(systemResult[4]+"");
                break;
        }
    }

}
