package com.example.myapplication3.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication3.R;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mBtnLinear,mBtnHor,mBtnGrid,mBtnStagger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnStagger = findViewById(R.id.btn_stagger);
        setlisten();
    }

    private void setlisten() {
        Click click = new Click();
        mBtnLinear.setOnClickListener(click);
        mBtnHor.setOnClickListener(click);
        mBtnGrid.setOnClickListener(click);
        mBtnStagger.setOnClickListener(click);
    }
    class Click implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_linear:
                     intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                     break;
                case R.id.btn_hor:
                     intent = new Intent(RecyclerViewActivity.this, HorRecycViewActivity.class);
                     break;
                case R.id.btn_grid:
                     intent = new Intent(RecyclerViewActivity.this, GridRecycViewActivity.class);
                     break;
                case R.id.btn_stagger:
                    intent = new Intent(RecyclerViewActivity.this,StaggerRecycViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}