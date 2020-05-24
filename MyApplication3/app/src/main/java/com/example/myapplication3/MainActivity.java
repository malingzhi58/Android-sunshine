package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication3.Listview.ListViewActivity2;
import com.example.myapplication3.gridview.GridViewActivity;
import com.example.myapplication3.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText,mBtnRadioButton;
    private Button mBtnCheckBox,mBtnImageView,mBtnListView,mBtnGridView,mBtnRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.bottom_1);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextViewActivity2.class);
                startActivity(intent);
            }
        });
        mBtnButton=findViewById(R.id.bottom_2);
        mBtnEditText = findViewById(R.id.btn_editext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnListView = findViewById(R.id.btn_listview);
        mBtnGridView = findViewById(R.id.btn_gridview);
        mBtnRv = findViewById(R.id.btn_rv);
        setListeners();
    }
    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
    }
    private  class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this,RadioButtonActivity2.class);
                    break;
                case R.id.bottom_1:
                    intent = new Intent(MainActivity.this,TextViewActivity2.class);
                    break;
                case R.id.bottom_2:
                    intent = new Intent(MainActivity.this,ButtonActivity2.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this,CheckBoxActivity2.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this,ImageViewActivity2.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity2.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_rv:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}