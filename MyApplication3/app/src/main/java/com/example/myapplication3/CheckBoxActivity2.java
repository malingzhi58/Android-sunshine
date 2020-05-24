package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity2 extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_check_box2);
//    }
private CheckBox mCb6, mCb7, mCb8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box2);

        mCb6 = findViewById(R.id.cb_6);
        mCb7 = findViewById(R.id.cb_7);
        mCb8 = findViewById(R.id.cb_8);
//        private void setListeners()
//        {
//            new CompoundButton.OnCheckedChangeListener()
//            mCb6.setOnCheckedChangeListener()
//        }

        mCb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity2.this, b?"6选中":"6未选中", Toast.LENGTH_SHORT).show();
            }
        });
        mCb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity2.this, b?"7选中":"7未选中", Toast.LENGTH_SHORT).show();
            }
        });
        mCb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity2.this, b?"8选中":"8未选中", Toast.LENGTH_SHORT).show();
            }
        });
    }
}