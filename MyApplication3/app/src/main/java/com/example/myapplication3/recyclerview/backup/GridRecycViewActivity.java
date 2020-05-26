package com.example.myapplication3.recyclerview.backup;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication3.R;

public class GridRecycViewActivity extends AppCompatActivity {
    public RecyclerView mRvgrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recyc_view);
        mRvgrid = findViewById(R.id.rv_grid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(GridRecycViewActivity.this,3);
        mRvgrid.setLayoutManager(gridLayoutManager);
        mRvgrid.setAdapter(new GridAdapter(GridRecycViewActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecycViewActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}