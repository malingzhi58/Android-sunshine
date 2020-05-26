package com.example.myapplication3.recyclerview;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.myapplication3.R;

public class StaggerRecycViewActivity extends AppCompatActivity {
    RecyclerView mRvstagger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stagger_recyc_view);
        mRvstagger = findViewById(R.id.rv_stagger);
        mRvstagger.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        mRvstagger.addItemDecoration(new Mydecoration());
        mRvstagger.setAdapter(new StaggerAdapter(StaggerRecycViewActivity.this, new StaggerAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(StaggerRecycViewActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
    class Mydecoration extends RecyclerView.ItemDecoration{
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state)
        {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.dividerHeight2);
            outRect.set(gap, gap, gap, gap);
        }
    }

}