package com.example.myapplication3.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication3.R;

public class  SharedPreferenceActivity extends AppCompatActivity {
    private EditText mEtName;
    Button mBtnSave, mBtnshow;
    TextView mTvContent;
    private SharedPreferences mSharedPref;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        mEtName =findViewById(R.id.et_name);
        mBtnSave=findViewById(R.id.btn_save);
        mBtnshow = findViewById(R.id.btn_show);
        mTvContent = findViewById(R.id.et_content);

        mSharedPref = this.getSharedPreferences("data",MODE_PRIVATE);
        mEditor = mSharedPref.edit();

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.putString("name",mEtName.getText().toString());
                mEditor.apply();
            }
        });
        mBtnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvContent.setText(mSharedPref.getString("name",""));
            }
        });

    }
}