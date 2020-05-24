package com.example.myapplication3.Listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication3.R;

public class ListViewActivity2 extends AppCompatActivity {
    private ListView mLv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        mLv1 = findViewById(R.id.lv_1);
        mLv1.setAdapter(new MyListAdapter(ListViewActivity2.this));
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity2.this, "点击 pos: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        // 长按事件
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity2.this, "长按 pos: " + i, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}