package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnnimationActivity extends AppCompatActivity {
    private TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annimation);
        // 属性动画
        tvText.animate().translationYBy(500).setDuration(2000).start();
        tvText.animate().scaleXBy(2).start();
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0,100);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d("annimate",animation.getAnimatedValue()+"");
            }
        });
    }
}