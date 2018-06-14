package com.aniketvishal.basketballcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points1=0;
    int points2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointer1(View view){
        points1=(points1+3);
        display1(points1);
    }

    public void twopointer1(View view){
        points1=(points1+2);
        display1(points1);
    }

    public void onepointer1(View view){
        points1=(points1+1);
        display1(points1);
    }


    public void threepointer2(View view){
        points2=(points2+3);
        display2(points2);
    }

    public void twopointer2(View view){
        points2=(points2+2);
        display2(points2);
    }

    public void onepointer2(View view){
        points2=(points2+1);
        display2(points2);
    }

    private void display1(int number){
        TextView points = (TextView) findViewById(R.id.team_a_textview);
        points.setText("" + number);
    }

    private void display2(int number){
        TextView points = (TextView) findViewById(R.id.team_b_textview);
        points.setText("" + number);
    }

    public void reset(View view){
        points1=0;
        points2=0;
        display1(points1);
        display2(points2);
    }

}
