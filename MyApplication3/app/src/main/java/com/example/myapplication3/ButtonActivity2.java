package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity2 extends AppCompatActivity {
    private Button mBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        mBtn3 = findViewById(R.id.btn_3);
        setListen();
//        mBtn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ButtonActivity2.this,"mainhaha",Toast.LENGTH_SHORT).show();
//            }
//        });

    }
    private void setListen() {
        Listener listener = new Listener();
        mBtn3.setOnClickListener(listener);
    }
    class Listener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_3:Toast.makeText(ButtonActivity2.this,"mainhaha",Toast.LENGTH_SHORT).show();
            }
        }
    }

//    public void showToast(View view){
//        Toast.makeText(this,"haha",Toast.LENGTH_SHORT).show();
//    }
}