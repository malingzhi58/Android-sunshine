package com.example.android.sunshine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,mButton8,mButton9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mButton1 = findViewById(R.id.Button1);
        mButton2 = findViewById(R.id.Button2);
        mButton3 = findViewById(R.id.Button3);
        mButton4 = findViewById(R.id.Button4);
        mButton5 = findViewById(R.id.Button5);
        mButton6 = findViewById(R.id.Button6);
        mButton7 = findViewById(R.id.Button7);
        mButton8 = findViewById(R.id.Button8);
        mButton9 = findViewById(R.id.Button9);
        setListeners();
    }
    void setListeners(){
        onClick onClick = new onClick();
        mButton1.setOnClickListener(onClick);
        mButton2.setOnClickListener(onClick);
        mButton3.setOnClickListener(onClick);
        mButton4.setOnClickListener(onClick);
        mButton5.setOnClickListener(onClick);
        mButton6.setOnClickListener(onClick);
        mButton7.setOnClickListener(onClick);
        mButton8.setOnClickListener(onClick);
        mButton9.setOnClickListener(onClick);
    }
    class onClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){

                case R.id.Button1:
                     intent = new Intent(MainActivity.this,WeatherFirstActivity.class);
                    startActivity(intent);
                    break;
                case R.id.Button2:
                     intent = new Intent(MainActivity.this,WeatherSecond.class);
                    startActivity(intent);
                    break;
                case R.id.Button3:
                    intent = new Intent(MainActivity.this,LifeCycleActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.Button4:
                    intent = new Intent(MainActivity.this,QueryActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.Button5:
                    intent = new Intent(MainActivity.this,AsycLoaderActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.Button6:
                    intent = new Intent(MainActivity.this,WeatherThirdLoader.class);
                    startActivity(intent);
                    break;
                case R.id.Button7:
                    intent = new Intent(MainActivity.this,VisualizerActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.Button8:
                    intent = new Intent(MainActivity.this,EmptyActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.Button9:
                    intent = new Intent(MainActivity.this,EmptyActivity2.class);
                    startActivity(intent);
                    break;
            }

        }
    }

}