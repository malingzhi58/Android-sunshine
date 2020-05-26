package com.example.myapplication3.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication3.R;

public class DataStrorageActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnSharedPreference;
    private Button mBtnFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_strorage);
        mBtnSharedPreference =findViewById(R.id.sharedpreference);
        mBtnSharedPreference.setOnClickListener(this);
        mBtnFile =findViewById(R.id.file);
        mBtnFile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intent =null;
        switch (view.getId()){
            case R.id.sharedpreference:
                intent = new Intent(DataStrorageActivity.this,SharedPreferenceActivity.class);
                break;
            case R.id.file:
                intent = new Intent(DataStrorageActivity.this,FileActivity.class);
                break;
        }
        startActivity(intent);
    }

}