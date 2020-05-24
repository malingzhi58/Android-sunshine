package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity2 extends AppCompatActivity {
    private TextView mTv4;
    private TextView mTv5,mTv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view2);
        mTv4 = findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv4.getPaint().setAntiAlias(true);//去掉锯齿

        mTv5=findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//underling

        mTv6=findViewById(R.id.tv_3);
        mTv6.setText(Html.fromHtml("<u> this is underline</u>"));
    }
}