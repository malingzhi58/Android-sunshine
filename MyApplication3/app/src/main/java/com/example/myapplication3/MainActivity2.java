package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication3.datastorage.DataStrorageActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button mBtnUIView,mBtnData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBtnUIView = findViewById(R.id.btn_ui);
        mBtnData =findViewById(R.id.btn_datastorage);
        onClick onClick = new onClick();
        mBtnUIView.setOnClickListener(onClick);
        mBtnData.setOnClickListener(onClick);

        //申请权限
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
    }
    private class onClick implements View.OnClickListener{
        Intent intent = null;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity2.this, UIActivity.class);
                    break;
                case R.id.btn_datastorage:
                    intent = new Intent(MainActivity2.this, DataStrorageActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}